package com.halushka.ktorchat.data.remote

import com.halushka.ktorchat.data.remote.dto.MessageDto
import com.halushka.ktorchat.domain.model.Message
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class MessageServiceImpl(
    private val client: HttpClient
) : MessageService {
    override suspend fun getAllMessages(): List<Message> {
        return try {
            //TODO add body to get request
            client.get(MessageService.Endpoints.GetAllMessages.url)
                .body<List<MessageDto>>()
                .map { it.toMessage() }
        } catch (exception: Exception) {
            emptyList()
        }
    }
}
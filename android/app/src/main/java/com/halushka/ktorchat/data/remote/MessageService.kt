package com.halushka.ktorchat.data.remote

import com.halushka.ktorchat.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    //TODO here is your server IP
    companion object {
        const val BASE_URL = "enter your server IP"
    }

    sealed class Endpoints(val url: String) {
        data object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}
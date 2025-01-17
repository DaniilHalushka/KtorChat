package com.halushka.ktorchat.data.remote

import com.halushka.ktorchat.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    //TODO here is your server IP
    companion object {
        const val BASE_URL = "http://192.168.117.107:8080"
    }

    sealed class Endpoints(val url: String) {
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}
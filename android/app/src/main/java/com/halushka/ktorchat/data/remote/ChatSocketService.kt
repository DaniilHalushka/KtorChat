package com.halushka.ktorchat.data.remote

import com.halushka.ktorchat.domain.model.Message
import com.halushka.ktorchat.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {
    suspend fun initSession(
        username: String
    ): Resource<Unit>

    suspend fun sendMessage(message: String)

    fun observeMessages(): Flow<Message>

    suspend fun closeSession()

    //TODO here is your ws IP
    companion object {
        const val BASE_URL = "ws://192.168.117.107:8080"
    }

    sealed class Endpoints(val url: String) {
        data object ChatSocket: Endpoints("$BASE_URL/chat-socket")
    }
}
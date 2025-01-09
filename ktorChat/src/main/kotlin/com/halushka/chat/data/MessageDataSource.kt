package com.halushka.chat.data

import com.halushka.chat.data.model.Message

interface MessageDataSource {
    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessage(message: Message)
}
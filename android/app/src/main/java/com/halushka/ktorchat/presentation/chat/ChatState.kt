package com.halushka.ktorchat.presentation.chat

import com.halushka.ktorchat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)

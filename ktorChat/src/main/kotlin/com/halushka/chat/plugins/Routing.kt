package com.halushka.chat.plugins

import com.halushka.chat.room.RoomController
import com.halushka.chat.routes.chatSocket
import com.halushka.chat.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
   routing {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}

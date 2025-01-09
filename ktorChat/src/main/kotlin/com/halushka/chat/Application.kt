package com.halushka.chat

import com.halushka.chat.di.mainModule
import com.halushka.chat.plugins.*
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)


fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureSockets()
    configureMonitoring()
    configureSerialization()
    configureSecurity()
    configureRouting()
}

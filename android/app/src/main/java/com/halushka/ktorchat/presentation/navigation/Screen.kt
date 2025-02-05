package com.halushka.ktorchat.presentation.navigation

sealed class Screen(val route: String) {
    data object Username : Screen("username_screen")
    data object Chat : Screen("chat_screen/{username}") {
        const val ARG_USERNAME = "username"
        fun createRoute(username: String) = "chat_screen/$username"
    }
}

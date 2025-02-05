package com.halushka.ktorchat.presentation.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.halushka.ktorchat.presentation.chat.ChatScreen
import com.halushka.ktorchat.presentation.username.UsernameScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Username.route
    ) {
        composable(Screen.Username.route) {
            UsernameScreen(onNavigate = navController::navigate)
        }
        composable(
            route = Screen.Chat.route,
            arguments = listOf(navArgument(Screen.Chat.ARG_USERNAME) { type = NavType.StringType })
        ) { backStackEntry ->
            val username = backStackEntry.arguments?.getString(Screen.Chat.ARG_USERNAME).orEmpty()
            Box(modifier = Modifier.systemBarsPadding()) {
                ChatScreen(username = username)
            }
        }
    }
}

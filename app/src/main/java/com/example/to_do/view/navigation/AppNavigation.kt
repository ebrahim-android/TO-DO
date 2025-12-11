package com.example.to_do.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.to_do.view.TaskDetailScreen
import com.example.to_do.view.TaskItem
import com.example.to_do.view.TaskScreem

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = first) {
        composable<first> {
            TaskScreem(
                navigateOtherScreen = { navController.navigate(second) }
            )
        }
        composable<second> {
            TaskDetailScreen()
        }
    }
}
package com.example.bottumnavigation

import EmailScreen
import HomeScreen
import SettingsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") {
            HomeScreen()
        }
        composable(route = "email") {
            EmailScreen()
        }
        composable(route = "settings") {
            SettingsScreen()
        }
    }
}
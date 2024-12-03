package com.example.facialfeatures.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.facialfeatures.ui.screens.HomeScreen
import com.example.facialfeatures.ui.screens.LoginScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(onNavigateToHome = { navController.navigate("home") })
        }
        composable("home") {
            HomeScreen() // Ensure HomeScreen exists and is properly implemented
        }

    }

}

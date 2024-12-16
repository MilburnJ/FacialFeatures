package com.example.facialfeatures.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.facialfeatures.ui.screens.HomeScreen
import com.example.facialfeatures.ui.screens.LoginScreen
import com.example.facialfeatures.ui.screens.ScanUploadScreen
import com.example.facialfeatures.ui.screens.SkinSurveyScreen
import com.example.facialfeatures.ui.screens.UploadScreen
import com.example.facialfeatures.ui.screens.ScanScreen
import com.example.facialfeatures.ui.screens.ResultScreen

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
            HomeScreen(
                onNavigateToSkinSurvey = { navController.navigate("skinSurvey") },
                onNavigateToScanUpload = { navController.navigate("scanUpload") }
            )
        }
        composable("skinSurvey") {
            SkinSurveyScreen(navController = navController,onNavigateBack = { navController.popBackStack() })
        }
        composable("scanUpload") {
            ScanUploadScreen(
                onNavigateToUpload = { navController.navigate("upload") },
                onNavigateToScan = { navController.navigate("scan") }
            )
        }
        composable("upload") {
            UploadScreen(navController = navController, onNavigateBack = { navController.popBackStack() })
        }
        composable("scan") {
            ScanScreen(onNavigateToResult = { navController.navigate("result")},
                onNavigateBack = { navController.popBackStack()} )
        }
        composable("result") {
            ResultScreen(navController = navController)        }

    }

}

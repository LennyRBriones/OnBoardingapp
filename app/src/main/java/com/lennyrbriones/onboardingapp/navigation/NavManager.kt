package com.lennyrbriones.onboardingapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lennyrbriones.onboardingapp.onBoardViews.MainOnboarding
import com.lennyrbriones.onboardingapp.views.HomeView

@Composable

fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController , startDestination = "OnBoarding" ) {
        composable("OnBoarding"){
            MainOnboarding(navController)
        }
        composable("Home"){
            HomeView(navController)
        }
    }
}
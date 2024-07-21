package com.karnamic.skillcase

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.karnamic.skillcase.home.ui.HomeScreen
import com.karnamic.skillcase.auth.login.ui.LoginScreen
import kotlinx.serialization.Serializable

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: Screen,
    modifier: Modifier = Modifier,
) {

    NavHost(navController = navController, startDestination = startDestination, modifier = modifier) {
        composable<Screen.Login> {
            LoginScreen(navController = navController)
        }
        composable<Screen.Home> {
            HomeScreen(navController = navController)
        }
    }
}

sealed class Screen {

    @Serializable
    data object Login: Screen()

    @Serializable
    data object Home: Screen()
}
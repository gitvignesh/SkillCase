package com.karnamic.skillcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.karnamic.skillcase.ui.AppNavHost
import com.karnamic.skillcase.ui.screens.LoginScreen
import com.karnamic.skillcase.ui.theme.SkillCaseTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !viewModel.isReady.value
            }
            //TODO: add exit animation
        }

        setContent {
            SkillCaseTheme {
                AppNavHost(navController = rememberNavController())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SkillCaseTheme {
        AppNavHost(navController = rememberNavController())
    }
}
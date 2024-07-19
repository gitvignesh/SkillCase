package com.karnamic.skillcase.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.karnamic.skillcase.theme.SkillCaseTheme

@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(1f),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Screen")
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreen() {
    SkillCaseTheme {
        HomeScreen(rememberNavController())
    }
}
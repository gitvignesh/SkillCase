package com.karnamic.skillcase.auth.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.karnamic.skillcase.R
import com.karnamic.skillcase.Screen
import com.karnamic.skillcase.theme.SkillCaseTheme

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            ElevatedCard(
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF87FA9F)
                ),
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.app_logo),
                    contentDescription = "app logo",
                    modifier = Modifier.size(120.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp)) // Space between elements
            Text(
                text = stringResource(id = R.string.app_name),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(text = stringResource(R.string.app_tagline))
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f) // Occupy remaining space
        ) {
            TextField(
                value = "Email",
                onValueChange = { /* TODO: Handle value change */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = "Password",
                onValueChange = { /* TODO: Handle value change */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    navController.navigate(Screen.Home)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = stringResource(R.string.login), fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "OR")
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.google_sign_in),
                contentDescription = stringResource(R.string.cd_google_sign_in),
                modifier = Modifier.clickable {
                    navController.navigate(Screen.Home)
                }
            )
        }

        Text(
            text = stringResource(R.string.developer),
            fontStyle = FontStyle.Italic,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    SkillCaseTheme {
        LoginScreen(rememberNavController())
    }
}

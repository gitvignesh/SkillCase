package com.karnamic.skillcase.ui

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class Utils {

    @Composable
    fun TextInput(inputValue: String, onChange: (String) -> Unit, modifier: Modifier = Modifier) {
        TextField(value = inputValue, onValueChange = onChange)
    }
}
package com.example.android_class_05_2023

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@Composable
fun Title(name: String, title: String){
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = name,
            fontSize = 48.sp,
            lineHeight = 64.sp,
            textAlign = TextAlign.Center
            )
        Text(
            text = title,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidClass052023Theme {
        Title("Rafał Behrendt", "Software dev")
    }
}
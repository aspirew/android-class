package com.example.android_class_05_2023.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_class_05_2023.Detail
import com.example.android_class_05_2023.Title
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@Composable
fun BusinessCard(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxHeight(),
    ) {
        Box {}
        Title(name = "Rafał Behrendt", "Software dev")
        Column {
            Detail(text = "123 456 789", icon = Icons.Rounded.Phone)
            Detail(text = "raf.behrendt@gmail.com", icon = Icons.Rounded.Email)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(){
    AndroidClass052023Theme {
        BusinessCard()
    }
}
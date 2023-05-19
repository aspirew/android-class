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
import com.example.android_class_05_2023.state.BusinessDataState
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@Composable
fun BusinessCard(businessDataState: BusinessDataState){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxHeight(),
    ) {
        Box {}
        Title(name = businessDataState.name, businessDataState.title)
        Column {
            Detail(text = businessDataState.phone, icon = Icons.Rounded.Phone)
            Detail(text = businessDataState.mail, icon = Icons.Rounded.Email)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(){
    AndroidClass052023Theme {
        val businessDataState = BusinessDataState("Rafał Behrendt", "Software Dev", "raf.behrendt@gmail.com", "123 134 213")
        BusinessCard(businessDataState)
    }
}
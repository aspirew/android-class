package com.example.android_class_05_2023.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_class_05_2023.Detail
import com.example.android_class_05_2023.Title
import com.example.android_class_05_2023.state.BusinessDataState
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@Composable
fun BusinessCard(businessDataState: MutableState<BusinessDataState>, windowSizeClass: WindowWidthSizeClass){
    when(windowSizeClass) {
        WindowWidthSizeClass.Expanded -> {
            WideBusinessCard(businessDataState = businessDataState)
        }
        else -> {
            NarrowBusinessCard(businessDataState = businessDataState)
        }
    }
}

@Composable
fun NarrowBusinessCard(businessDataState: MutableState<BusinessDataState>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxHeight(),
    ) {
        Box {}
        Title(name = businessDataState.value.name, businessDataState.value.title)
        Column {
            Detail(text = businessDataState.value.phone, icon = Icons.Rounded.Phone)
            Detail(text = businessDataState.value.mail, icon = Icons.Rounded.Email)
        }
    }
}

@Composable
fun WideBusinessCard(businessDataState: MutableState<BusinessDataState>) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Title(name = businessDataState.value.name, businessDataState.value.title)
        Column {
            Detail(text = businessDataState.value.phone, icon = Icons.Rounded.Phone)
            Detail(text = businessDataState.value.mail, icon = Icons.Rounded.Email)
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(){
    AndroidClass052023Theme {
        val businessDataState = mutableStateOf(BusinessDataState("Rafał Behrendt", "Software Dev", "raf.behrendt@gmail.com", "123 134 213"))
        BusinessCard(businessDataState, WindowWidthSizeClass.Compact)
    }
}
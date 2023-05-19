package com.example.android_class_05_2023.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_class_05_2023.state.BusinessDataState
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusinessDataInputFields(businessDataInputState: BusinessDataState){
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
            TextField(
                value = businessDataInputState.name,
                onValueChange = { businessDataInputState.name = it },
                label = { Text(text="Name")},
                placeholder = { Text(text = "Jan Kowalski")}
                )
            TextField(
                value = businessDataInputState.title,
                onValueChange = { businessDataInputState.title = it },
                label = { Text(text="Title")},
                placeholder = { Text(text = "Software dev")}
            )
            TextField(
                value = businessDataInputState.mail,
                onValueChange = { businessDataInputState.mail = it },
                label = { Text(text="Mail")},
                placeholder = { Text(text = "email@example.com")}
            )
            TextField(
                value = businessDataInputState.phone,
                onValueChange = { businessDataInputState.phone = it },
                label = { Text(text="Phone")},
                placeholder = { Text(text = "123 456 837")}
            )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessDataInputPreview(){
    AndroidClass052023Theme {
        val businessDataState = BusinessDataState()
        BusinessDataInputFields(businessDataState)
    }
}
package com.example.android_class_05_2023.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_class_05_2023.components.BusinessDataInputFields
import com.example.android_class_05_2023.state.BusinessDataState
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@Composable
fun BusinessDataInputScreen(businessDataState: BusinessDataState, onNavigateToCard: () -> Unit = {}){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight(),
    ) {
        BusinessDataInputFields(businessDataState)
        Button(onClick = { onNavigateToCard() }) {
            Text(text = "Generate")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(){
    AndroidClass052023Theme {
        val businessDataState = BusinessDataState()
        BusinessDataInputScreen(businessDataState)
    }
}
package com.example.android_class_05_2023.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_class_05_2023.components.textFields.MailTextField
import com.example.android_class_05_2023.components.textFields.NameTextField
import com.example.android_class_05_2023.components.textFields.PhoneTextField
import com.example.android_class_05_2023.components.textFields.TitleTextField
import com.example.android_class_05_2023.state.BusinessDataState
import com.example.android_class_05_2023.ui.theme.AndroidClass052023Theme

@Composable
fun BusinessDataInputFields(businessDataInputState: MutableState<BusinessDataState>){
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
            NameTextField(businessDataInputState = businessDataInputState)
            TitleTextField(businessDataInputState = businessDataInputState)
            MailTextField(businessDataInputState = businessDataInputState)
            PhoneTextField(businessDataInputState = businessDataInputState)
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun BusinessDataInputPreview(){
    AndroidClass052023Theme {
        val businessDataState = mutableStateOf(BusinessDataState())
        BusinessDataInputFields(businessDataState)
    }
}
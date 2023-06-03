package com.example.android_class_05_2023.components.textFields

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.example.android_class_05_2023.state.BusinessDataState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MailTextField(businessDataInputState: MutableState<BusinessDataState> ) {
    fun isError(mail: String) = !mail.contains('@') && mail.isNotEmpty()
    fun returnCorrectErrorMessage(mail: String): String {
        return if(isError(mail)){
            "Not a valid email!"
        }
        else {
            "Unknown error"
        }
    }
    fun onValueChange(newValue: String){
        businessDataInputState.value = businessDataInputState.value.copy(
            mail = newValue,
            isError = isError(newValue)
        )
    }
    val value = businessDataInputState.value.mail
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        label = { Text(text="Mail")},
        placeholder = { Text(text = "mail@example.com")},
        isError = isError(value),
        supportingText = {
            if(isError(value)) {
                Text(text = returnCorrectErrorMessage(value))
            }
        }
    )
}
package com.example.android_class_05_2023.components.textFields

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.text.input.KeyboardType
import com.example.android_class_05_2023.state.BusinessDataState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneTextField(
    businessDataInputState: MutableState<BusinessDataState>,
) {
    fun isError(phone: String) = !phone.contains(Regex("^[0-9]*\$")) && phone.isNotEmpty()
    fun returnCorrectErrorMessage(phone: String): String {
        return if(isError(phone)) {
            "Not a valid phone number!"
        }
        else {
            "Unknown error"
        }
    }
    fun onValueChange(newValue: String){
        businessDataInputState.value = businessDataInputState.value.copy(phone = newValue, isError = isError(newValue))
    }
    val value = businessDataInputState.value.phone
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        label = { Text(text = "Phone")},
        placeholder = { Text(text = "123456789")},
        isError = isError(value),
        supportingText = {
            if(isError(value)) {
                Text(text = returnCorrectErrorMessage(value))
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

    )
}
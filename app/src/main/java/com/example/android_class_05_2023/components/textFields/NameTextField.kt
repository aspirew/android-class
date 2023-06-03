package com.example.android_class_05_2023.components.textFields

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.example.android_class_05_2023.state.BusinessDataState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NameTextField(businessDataInputState: MutableState<BusinessDataState>) {
    fun isNameTooLong(name: String) = name.length > 20
    fun isNameTooShort(name: String) = name.isNotEmpty() && name.length < 5
    fun isError(name: String) = isNameTooLong(name) || isNameTooShort(name)
    fun returnCorrectErrorMessage(name: String): String {
        return if(isNameTooShort(name)){
            "Name is too short!"
        }
        else if(isNameTooLong(name)){
            "Name is too long!"
        }
        else {
            "Unknown error"
        }
    }
    fun onValueChange(newValue: String){
        businessDataInputState.value = businessDataInputState.value.copy(name = newValue, isError = isError(newValue))
    }
    val value = businessDataInputState.value.name

    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        label = { Text(text="Name")},
        placeholder = { Text(text = "Jan Kowalski")},
        isError = isError(value),
        supportingText = {
            if(isError(value)) {
                Text(text = returnCorrectErrorMessage(value))
            }
        }
    )
}
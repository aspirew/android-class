package com.example.android_class_05_2023.components.textFields

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.example.android_class_05_2023.state.BusinessDataState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TitleTextField(businessDataInputState: MutableState<BusinessDataState>) {
    fun isTitleTooLong(title: String) = title.length > 20
    fun isTitleTooShort(title: String) = title.length < 5 && title.isNotEmpty()
    fun isError(title: String) = isTitleTooLong(title) || isTitleTooShort(title)
    fun returnCorrectErrorMessage(name: String): String {
        return if(isTitleTooShort(name)){
            "Title is too short!"
        }
        else if(isTitleTooLong(name)){
            "Title is too long!"
        }
        else {
            "Unknown error"
        }
    }
    fun onValueChange(newValue: String){
        businessDataInputState.value = businessDataInputState.value.copy(title = newValue, isError = isError(newValue))
    }
    val value = businessDataInputState.value.title
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        label = { Text(text="Title")},
        placeholder = { Text(text = "Software dev")},
        isError = isError(value),
        supportingText = {
            if(isError(value)) {
                Text(text = returnCorrectErrorMessage(value))
            }
        }
    )
}
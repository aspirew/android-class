package com.example.android_class_05_2023.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class BusinessDataState(name: String = "", title: String = "", mail: String = "", phone: String = "") {
    var name: String by mutableStateOf(name)
    var title: String by mutableStateOf(title)
    var mail: String by mutableStateOf(mail)
    var phone: String by mutableStateOf(phone)
}
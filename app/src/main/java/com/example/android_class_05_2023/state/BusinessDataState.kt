package com.example.android_class_05_2023.state

import java.io.Serializable

data class BusinessDataState(
    val name: String = "",
    val title: String = "",
    val mail: String = "",
    val phone: String = "") : Serializable
package com.example.android_class_05_2023.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_class_05_2023.components.BusinessCard
import com.example.android_class_05_2023.state.BusinessDataState
import com.example.android_class_05_2023.view.BusinessDataInputScreen

@Composable
fun NavHostController(
    businessDataState: MutableState<BusinessDataState> = rememberSaveable { mutableStateOf(BusinessDataState()) },
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Routes.Input.name
) {
    Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxWidth()) {
        NavHost(
            modifier = modifier,
            navController = navController,
            startDestination = startDestination
        ) {
            composable(Routes.Input.name) {
                BusinessDataInputScreen(businessDataState) { navController.navigate(Routes.Card.name) }
            }
            composable(Routes.Card.name) {
                BusinessCard(businessDataState, windowSize)
            }
        }
    }
}
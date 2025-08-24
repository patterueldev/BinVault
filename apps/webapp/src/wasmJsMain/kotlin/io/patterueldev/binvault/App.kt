package io.patterueldev.binvault

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.patterueldev.binvault.core.ui.BaseContentView
import io.patterueldev.binvault.core.ui.Coordinator
import org.koin.compose.KoinApplication

sealed class AppRoute {
    object HOME : AppRoute()
}

@Composable
fun App(coordinator: Coordinator) {
    BaseContentView {
        coordinator.start()
    }
}
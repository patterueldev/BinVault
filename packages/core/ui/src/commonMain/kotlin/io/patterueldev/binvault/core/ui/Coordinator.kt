package io.patterueldev.binvault.core.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

open class Coordinator(
    private val navHostControllerProvider: @Composable () -> NavHostController = { rememberNavController() }
): KoinComponent {
    private val appListUIProvider: AppListUIProvider by inject()
    private lateinit var navHostController: NavHostController

    @Suppress("ComposableNaming")
    @Composable
    open fun start() {
        println("Coordinator started")
        navHostController = navHostControllerProvider()
        NavHost(navController = navHostController, startDestination = "/") {
            composable("/") {
                appListUIProvider.AppListUI()
            }
        }
    }
    open fun routeToCreateNewApp() {}
}

abstract class AppListUIProvider {
    @Composable
    open fun AppListUI() {
        Text("Default AppListUI - Override this in your module")
    }
}
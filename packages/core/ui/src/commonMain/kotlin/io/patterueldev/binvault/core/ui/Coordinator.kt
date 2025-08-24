package io.patterueldev.binvault.core.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

open class Coordinator(val navController: NavHostController): KoinComponent {
    private val appListUIProvider: AppListUIProvider by inject()

    @Suppress("ComposableNaming")
    @Composable
    open fun start() {
        NavHost(navController = navController, startDestination = "HOME") {
            composable("HOME") {
                appListUIProvider.AppListUI()
            }
        }
    }
    open fun routeToCreateNewApp() {}
}

interface AppListUIProvider {
    @Composable
    fun AppListUI()
}
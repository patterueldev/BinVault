package io.patterueldev.binvault

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.patterueldev.binvault.core.ui.BaseContentView
import io.patterueldev.feature.applist.scenes.list.AppListNavigationCoordinator

import io.patterueldev.feature.applist.scenes.list.AppListView
import io.patterueldev.feature.applist.scenes.list.DefaultAppListViewModel

sealed class AppRoute {
    object HOME : AppRoute()
}

@Composable
fun App(
    navController: NavHostController = rememberNavController(),
) {
    BaseContentView {
        NavHost(navController = navController, startDestination = "HOME") {
            composable("HOME") {
                AppListView(DefaultAppListViewModel())
            }
        }
    }
}

class DefaultAppListNavigationCoordinator(

): AppListNavigationCoordinator {
    override fun createNewApp() {
        TODO("Not yet implemented")
    }
}
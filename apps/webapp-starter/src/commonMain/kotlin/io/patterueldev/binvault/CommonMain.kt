package io.patterueldev.binvault

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import io.patterueldev.binvault.core.ui.BaseContentView
import io.patterueldev.binvault.core.ui.Coordinator
import io.patterueldev.core.ModuleProvider
import org.koin.core.context.startKoin

// I Could move this into core UI
class CommonMain(
    val body: (@Composable () -> Unit) -> Unit
) {
    fun mainApp() {
        startKoin {
            ModuleProvider.instance.module()
        }
        body {
            App(coordinator = Coordinator(navController = rememberNavController()))
        }
    }
}

@Composable
fun App(coordinator: Coordinator) {
    BaseContentView {
        coordinator.start()
    }
}
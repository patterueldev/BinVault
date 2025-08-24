package io.patterueldev.binvault

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import dev.whyoleg.sweetspi.ServiceLoader
import io.patterueldev.binvault.core.ui.BaseContentView
import io.patterueldev.binvault.core.ui.Coordinator
import io.patterueldev.core.ModuleProvider
import org.koin.core.context.startKoin

// I Could move this into core UI
class CommonMain(
    val body: (@Composable () -> Unit) -> Unit
) {
    fun mainApp() {
        ServiceLoader.load<ModuleProvider>().last().let { provider ->
            startKoin {
                modules(
                    provider.module()
                )
            }
            body {
                App(coordinator = Coordinator())
            }
        }
    }
}

@Composable
fun App(coordinator: Coordinator) {
    BaseContentView {
        coordinator.start()
    }
}
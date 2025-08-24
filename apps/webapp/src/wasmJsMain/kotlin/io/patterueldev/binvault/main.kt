package io.patterueldev.binvault

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import androidx.navigation.compose.rememberNavController
import io.patterueldev.binvault.core.ui.AppListUIProvider
import io.patterueldev.binvault.core.ui.Coordinator
import kotlinx.browser.document
import org.koin.core.context.startKoin
import org.koin.dsl.module

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CommonMain { body ->
        ComposeViewport(document.body!!) {
            body()
        }
    }.mainApp()
}
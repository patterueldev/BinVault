package io.patterueldev.feature.applist

import androidx.compose.runtime.Composable
import io.patterueldev.binvault.core.ui.AppListUIProvider
import io.patterueldev.feature.applist.scenes.list.AppListView
import io.patterueldev.feature.applist.scenes.list.AppListViewModel
import io.patterueldev.feature.applist.views.AppItem
import org.koin.core.annotation.Module

@Module
class AppListModule: AppListUIProvider() {
    @Composable
    override fun AppListUI() {
        AppListView(
            viewModel = object : AppListViewModel() {
                override fun loadApps() {
                    apps.add(AppItem.mock1())
                }
            }
        )
    }
}
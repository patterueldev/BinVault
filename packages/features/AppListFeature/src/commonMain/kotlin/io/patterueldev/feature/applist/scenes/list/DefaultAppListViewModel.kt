package io.patterueldev.feature.applist.scenes.list

import io.patterueldev.feature.applist.views.AppItem
import io.patterueldev.feature.applist.views.AppItemView

class DefaultAppListViewModel : AppListViewModel() {
    override fun loadApps() {
        apps.addAll(
            listOf(
                AppItem(
                    id = "1",
                    name = "App 001",
                    bundleId = "com.example.app001",
                    developerName = "Developer 001",
                    latestVersion = "1.0.0",
                ),
                AppItem(
                    id = "2",
                    name = "App 002",
                    bundleId = "com.example.app002",
                    developerName = "Developer 002",
                    latestVersion = null,
                ),
            )
        )
    }
}
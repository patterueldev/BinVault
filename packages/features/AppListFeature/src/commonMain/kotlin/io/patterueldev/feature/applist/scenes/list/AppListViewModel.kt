package io.patterueldev.feature.applist.scenes.list

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import io.patterueldev.feature.applist.views.AppItem

abstract class AppListViewModel: ViewModel() {
    var apps: MutableList<AppItem> = mutableStateListOf()

    abstract fun loadApps()
}


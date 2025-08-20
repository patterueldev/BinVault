package io.patterueldev.feature.applist.scenes.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import io.patterueldev.binvault.core.ui.BaseContentView
import io.patterueldev.feature.applist.views.AppItem
import io.patterueldev.feature.applist.views.AppItemView
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppListView(
    viewModel: AppListViewModel,
) {
    LaunchedEffect(Unit) {
        viewModel.loadApps()
    }

    Column {
        LazyColumn {
            items(viewModel.apps) {
                AppItemView(it)
            }
        }
    }
}

@Preview
@Composable
fun AppListViewPreview() = BaseContentView {
    AppListView(
        viewModel = object : AppListViewModel() {
            override fun loadApps() {
                apps.add(AppItem.mock1())
            }
        }
    )
}
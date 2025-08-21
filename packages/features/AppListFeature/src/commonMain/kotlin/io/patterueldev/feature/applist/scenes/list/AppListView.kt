package io.patterueldev.feature.applist.scenes.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.patterueldev.binvault.core.ui.BaseContentView
import io.patterueldev.feature.applist.views.AppItem
import io.patterueldev.feature.applist.views.AppItemView
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppListView(
    viewModel: AppListViewModel,
    navigationCoordinator: AppListNavigationCoordinator? = null,
) {
    LaunchedEffect(Unit) {
        viewModel.loadApps()
    }

    Column {
        Row(modifier = Modifier.padding(10.dp).align(Alignment.End)) {
            Button(onClick = { navigationCoordinator?.createNewApp() }) {
                Text("Create New App")
            }
        }
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
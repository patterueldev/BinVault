package io.patterueldev.feature.applist.views

import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppItemView(appItem: AppItem) {
    ListItem(
        headlineContent = { Text(appItem.name) },
        supportingContent = { Text(appItem.developerName) },
        trailingContent = { appItem.latestVersion?.let { Text(appItem.latestVersion) } }
    )
}

@Preview
@Composable
fun AppItemViewPreview() {
    AppItemView(appItem = AppItem.mock1())
}
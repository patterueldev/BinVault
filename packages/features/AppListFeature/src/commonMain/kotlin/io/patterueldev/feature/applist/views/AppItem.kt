package io.patterueldev.feature.applist.views

data class AppItem(
    val id: String? = null,
    val name: String,
    val bundleId: String,
    val developerName: String,
    val latestVersion: String?,
) {
    companion object {
        fun mock1() = AppItem(
            id = "1",
            name = "App 1",
            bundleId = "com.example.app1",
            developerName = "Developer 1",
            latestVersion = "1.0.0",
        )
    }
}
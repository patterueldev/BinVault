package io.patterueldev.binvault.aggregator

import dev.whyoleg.sweetspi.ServiceProvider
import io.patterueldev.binvault.core.ui.AppListUIProvider
import io.patterueldev.core.ModuleProvider
import io.patterueldev.feature.applist.AppListModule
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

// TODO: We don't need this if we plan to just provide the modules from the implementations.
// aggregator just loads the necessary dependencies from gradle, then ServiceLoader loads the modules automatically.
@ServiceProvider
object ModuleProviderImpl: ModuleProvider {
    override fun module(): Module {
        println("ModuleProviderImpl providing modules")
        return module {
            singleOf(::AppListModule) bind AppListUIProvider::class
        }
    }
}
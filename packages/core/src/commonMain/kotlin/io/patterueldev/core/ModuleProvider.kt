package io.patterueldev.core

import dev.whyoleg.sweetspi.Service
import dev.whyoleg.sweetspi.ServiceProvider
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

@Service
interface ModuleProvider {
    fun module(): Module
}
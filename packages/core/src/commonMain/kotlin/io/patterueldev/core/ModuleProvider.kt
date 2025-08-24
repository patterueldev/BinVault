package io.patterueldev.core

import dev.whyoleg.sweetspi.Service
import org.koin.core.module.Module
import org.koin.dsl.module

@Service
interface ModuleProvider {
    fun module(): Module
}
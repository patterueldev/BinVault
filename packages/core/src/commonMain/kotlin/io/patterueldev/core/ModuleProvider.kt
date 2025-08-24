package io.patterueldev.core

import org.koin.core.module.Module
import org.koin.dsl.module

class ModuleProvider private constructor() {
    fun module(): Module = module {

    }

    companion object {
        val instance by lazy { ModuleProvider() }
    }
}
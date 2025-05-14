package me.shwetagoyal.core.data.di

import me.shwetagoyal.core.data.networking.HttpClientFactory
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
}
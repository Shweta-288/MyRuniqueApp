package me.shwetagoyal.core.data.di

import me.shwetagoyal.core.data.auth.EncryptedSessionStorage
import me.shwetagoyal.core.data.networking.HttpClientFactory
import me.shwetagoyal.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}
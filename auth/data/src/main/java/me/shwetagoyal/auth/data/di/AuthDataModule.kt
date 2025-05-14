package me.shwetagoyal.auth.data.di

import me.shwetagoyal.auth.data.EmailPatternValidator
import me.shwetagoyal.auth.domain.PatternValidator
import me.shwetagoyal.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}
package me.shwetagoyal.auth.presentation.di

import me.shwetagoyal.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module


val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
}
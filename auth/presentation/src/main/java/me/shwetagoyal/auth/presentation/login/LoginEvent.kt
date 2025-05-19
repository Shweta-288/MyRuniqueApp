package me.shwetagoyal.auth.presentation.login

import me.shwetagoyal.core.presentation.ui.UiText

sealed interface LoginEvent {
    data class Error(val error: UiText): LoginEvent
    data object LoginSuccess: LoginEvent
}
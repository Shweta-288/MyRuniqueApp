package me.shwetagoyal.auth.presentation.register

import me.shwetagoyal.core.presentation.ui.UiText

sealed interface RegisterEvent{
    data object RegistrationSuccess: RegisterEvent
    data class Error(val error: UiText): RegisterEvent
}
package me.shwetagoyal.auth.presentation.intro

sealed interface IntroAction{
    data object OnSingInClick: IntroAction
    data object OnSignUpClick: IntroAction
}
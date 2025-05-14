package me.shwetagoyal.auth.domain


interface PatternValidator {
    fun matches(value: String): Boolean
}
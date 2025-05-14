package me.shwetagoyal.core.data.networking

data class AccessTokenRequest(
    val refreshToken: String,
    val userId: String
)

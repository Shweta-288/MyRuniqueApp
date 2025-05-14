package me.shwetagoyal.auth.data

import io.ktor.client.HttpClient
import me.shwetagoyal.auth.domain.AuthRepository
import me.shwetagoyal.core.data.networking.post
import me.shwetagoyal.core.domain.util.DataError
import me.shwetagoyal.core.domain.util.EmptyResult

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {
    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}
package me.shwetagoyal.auth.data

import io.ktor.client.HttpClient
import me.shwetagoyal.auth.domain.AuthRepository
import me.shwetagoyal.core.data.networking.post
import me.shwetagoyal.core.domain.AuthInfo
import me.shwetagoyal.core.domain.SessionStorage
import me.shwetagoyal.core.domain.util.DataError
import me.shwetagoyal.core.domain.util.EmptyResult
import me.shwetagoyal.core.domain.util.Result
import me.shwetagoyal.core.domain.util.asEmptyDataResult

class AuthRepositoryImpl(
    private val httpClient: HttpClient,
    private val sessionStorage: SessionStorage
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

    override suspend fun login(email: String, password: String): EmptyResult<DataError.Network> {
        val result = httpClient.post<LoginRequest, LoginResponse>(
            route = "/login",
            body = LoginRequest(
                email = email,
                password = password
            )
        )
        if(result is Result.Success) {
            sessionStorage.set(
                AuthInfo(
                    accessToken = result.data.accessToken,
                    refreshToken = result.data.refreshToken,
                    userId = result.data.userId
                )
            )
        }
        return result.asEmptyDataResult()
    }
}
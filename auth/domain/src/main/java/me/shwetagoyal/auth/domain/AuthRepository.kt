package me.shwetagoyal.auth.domain

import me.shwetagoyal.core.domain.util.DataError
import me.shwetagoyal.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}
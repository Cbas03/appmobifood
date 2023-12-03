package com.sebasconstantin.mobifood.signin.domain

import com.sebasconstantin.mobifood.core.security.PasswordHash
import com.sebasconstantin.mobifood.signin.data.SignInRepository
import javax.inject.Inject

class SignInUseCase @Inject constructor(
    private val networkRepository: SignInRepository,
    private val cryptoHash: PasswordHash
) {

    suspend operator fun invoke(user: String, password: String):Boolean =
        networkRepository.doSignIn(user, password)
}
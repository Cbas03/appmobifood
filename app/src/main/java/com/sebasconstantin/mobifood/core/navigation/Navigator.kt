package com.sebasconstantin.mobifood.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sebasconstantin.mobifood.MainActivity
import com.sebasconstantin.mobifood.SplashScreen
import com.sebasconstantin.mobifood.home.presentation.HomeScreen
import com.sebasconstantin.mobifood.signin.presentation.SignInViewModel
import javax.inject.Inject

class Navigator @Inject constructor(
    private val signInViewModel: SignInViewModel,
    private val homeScreen: HomeScreen
) {

    @Composable
    operator fun invoke() {

    }
}
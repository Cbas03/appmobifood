package com.sebasconstantin.mobifood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sebasconstantin.mobifood.core.routes.Routes
import com.sebasconstantin.mobifood.signin.presentation.SignInScreen
import com.sebasconstantin.mobifood.signin.presentation.SignInViewModel
import com.sebasconstantin.mobifood.signup.presentation.SignUpScreen
import com.sebasconstantin.mobifood.ui.theme.MobifoodTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity @Inject constructor() : ComponentActivity() {
    private val signInViewModel: SignInViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobifoodTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Routes.SignInScreen.route) {
                        composable(Routes.SignInScreen.route) {
                            SignInScreen(navController, signInViewModel = signInViewModel)
                        }
                        composable(Routes.SignUpScreen.route) {
                            SignUpScreen(navController)
                        }
                        composable(
                            Routes.HomeScreen.route,
                            arguments = listOf(
                                navArgument("id") { type = NavType.IntType },
                                navArgument("username") {
                                    defaultValue = ""
                                })
                        ) {
                            /*HomeScreen(
                                navController = navController,
                                id = it.arguments?.getInt("id") ?: 0,
                                username = it.arguments?.getString("username").orEmpty()
                            )*/
                        }
                    }
                }
            }
        }
    }
}
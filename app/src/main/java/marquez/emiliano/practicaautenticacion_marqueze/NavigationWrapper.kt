package marquez.emiliano.practicaautenticacion_marqueze

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.firebase.auth.FirebaseAuth
import marquez.emiliano.practicaautenticacion_marqueze.presentation.home.HomeScreen
import marquez.emiliano.practicaautenticacion_marqueze.presentation.initial.InitialScreen
import marquez.emiliano.practicaautenticacion_marqueze.presentation.login.LoginScreen
import marquez.emiliano.practicaautenticacion_marqueze.presentation.signup.SignUpScreen

@Composable
fun NavigationWrapper(
    navHostController: NavHostController,
    auth: FirebaseAuth
) {
    NavHost(navController = navHostController, startDestination = "home") {
        composable("initial") {
            InitialScreen(navigateToLogin = { navHostController.navigate("logIn") },
                navigateToSignUp = { navHostController.navigate("signUp") })
        }
        composable("logIn") {
            LoginScreen(auth) { navHostController.navigate("home") }
        }
        composable("signUp") {
            SignUpScreen(auth)
        }
        composable("home") {
            HomeScreen()
        }
    }
}

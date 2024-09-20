package co.edu.udea.compumovil.gr06_20242.lab1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.udea.compumovil.gr06_20242.lab1.ContactDataScreen
import co.edu.udea.compumovil.gr06_20242.lab1.PersonalDataScreen
import co.edu.udea.compumovil.gr06_20242.lab1.SharedData

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val sharedData = SharedData() // Instancia de SharedData

    NavHost(navController = navController, startDestination = Screens.PersonalDataScreen.route) {
        composable(route = Screens.PersonalDataScreen.route) {
            PersonalDataScreen(navController, sharedData) // Pasar sharedData
        }
        composable(route = Screens.ContactDataScreen.route) {
            ContactDataScreen(navController, sharedData) // Pasar sharedData
        }
    }
}
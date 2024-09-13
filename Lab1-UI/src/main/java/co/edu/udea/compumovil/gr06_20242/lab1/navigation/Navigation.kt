package co.edu.udea.compumovil.gr06_20242.lab1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.udea.compumovil.gr06_20242.lab1.ContactDataScreen
import co.edu.udea.compumovil.gr06_20242.lab1.PersonalDataScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.PersonalDataScreen.route){
        composable(route = Screens.PersonalDataScreen.route){
            PersonalDataScreen(navController)
        }
        composable(route = Screens.ContactDataScreen.route) {
            ContactDataScreen(navController)
        }
    }
}
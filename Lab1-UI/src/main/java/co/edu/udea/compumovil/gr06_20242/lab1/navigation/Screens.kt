package co.edu.udea.compumovil.gr06_20242.lab1.navigation

sealed class Screens(val route: String) {
    object PersonalDataScreen: Screens("personal_data_screen")
    object ContactDataScreen: Screens("contact_data_screen")
    object DisplayDataScreen: Screens("display_data_screen") // Nueva pantalla
}

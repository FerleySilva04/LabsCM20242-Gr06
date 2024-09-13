package co.edu.udea.compumovil.gr06_20242.lab1.api

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CitiesViewModelFactory(private val apiService: ColombiaCitiesService) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CitiesViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CitiesViewModel(apiService) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
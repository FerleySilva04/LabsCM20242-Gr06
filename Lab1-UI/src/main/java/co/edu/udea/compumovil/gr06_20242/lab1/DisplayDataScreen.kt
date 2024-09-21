package co.edu.udea.compumovil.gr06_20242.lab1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DisplayDataScreen(sharedData: SharedData) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState())) { // Permite el desplazamiento
        // Información personal
        Text(text = "Información personal:", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp)) // Espacio entre secciones
        Text(text = "${sharedData.name} ${sharedData.lastName}")
        Text(text = "${sharedData.gender}")
        Text(text = "Nació el ${sharedData.birthDate}")
        Text(text = "${sharedData.scholarGrade}")

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre secciones

        // Información de contacto
        Text(text = "Información de contacto:", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp)) // Espacio entre secciones
        Text(text = "Teléfono: ${sharedData.phone}")
        Text(text = "Dirección: ${sharedData.address}")
        Text(text = "Email: ${sharedData.email}")
        Text(text = "País: ${sharedData.country}")
        Text(text = "Ciudad: ${sharedData.city}")
    }
}

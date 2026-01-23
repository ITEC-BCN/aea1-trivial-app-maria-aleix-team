package com.example.trivialapp_base.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.ui.theme.AzulFondo
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()           // ocupa toda la pantalla
            .background(color = AzulFondo), // fondo azul
        contentAlignment = Alignment.Center // centra el contenido
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // centra hijos horizontalmente
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text("Puntuacion: ${viewModel.puntuacion}")
            Button(onClick = {navController.navigate(Routes.Screenmenu.route)} ) {
                Text("REPLAY")
            }
        }}
}
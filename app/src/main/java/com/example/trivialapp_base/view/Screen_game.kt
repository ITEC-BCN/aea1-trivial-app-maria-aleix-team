package com.example.trivialapp_base.view

import android.widget.ProgressBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.ui.theme.AzulFondo
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
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
            Text("Round ${viewModel.indicePreguntaActual+1}/10")

            Text(viewModel.preguntaActual!!.pregunta)

            Row() {
                Button(onClick = {viewModel.responderPregunta(viewModel.respuestasMezcladas[0])
                if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)}) {
                    Text(viewModel.respuestasMezcladas[0])
                }
                Button(onClick = {viewModel.responderPregunta(viewModel.respuestasMezcladas[1])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)}) {
                    Text(viewModel.respuestasMezcladas[1])
                }
            }
            Row() {
                Button(onClick = {viewModel.responderPregunta(viewModel.respuestasMezcladas[2])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)}) {
                    Text(viewModel.respuestasMezcladas[2])
                }
                Button(onClick = {viewModel.responderPregunta(viewModel.respuestasMezcladas[3])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)}) {
                    Text(viewModel.respuestasMezcladas[3])
                }
            }

            LinearProgressIndicator(
                progress = { 0f },
                color = Color.LightGray,
                trackColor = Color.Blue
            )
        }
    }}
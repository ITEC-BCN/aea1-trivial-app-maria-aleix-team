package com.example.trivialapp_base.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.ui.theme.AmarilloBotones
import com.example.trivialapp_base.ui.theme.AzulFondo
import com.example.trivialapp_base.ui.theme.MoradoTitulo
import com.example.trivialapp_base.ui.theme.NaranjaBotones
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    var showDialog by remember { mutableStateOf(false) }

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
            Text(text = "Juego Terminado!",
                style = TextStyle(
                    color = MoradoTitulo,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                ))

            Text(
                "Puntuacion: ${viewModel.puntuacion}",
                    style = TextStyle(
                    color = MoradoTitulo,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                ))

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {showDialog = true},
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = NaranjaBotones,
                    contentColor = MoradoTitulo
                ),
                border = BorderStroke(5.dp, AmarilloBotones)
            ) {
                Text(text = "Share")
            }

            Button(
                onClick = {navController.navigate(Routes.Screenmenu.route)},
                    modifier = Modifier
                        .width(220.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = NaranjaBotones,
                    contentColor = MoradoTitulo
                ),
                border = BorderStroke(5.dp, AmarilloBotones)
            ) {
                Text(text = "Replay")
            }

            // 🪟 DIALOGO que aparece al pulsar "Share"
            if (showDialog) {
                AlertDialog(
                    onDismissRequest = { showDialog = false },
                    title = { Text(text = "Compartir puntuación") },
                    text = { Text("¿Quieres compartir tu puntuación de ${viewModel.puntuacion} puntos?") },
                    confirmButton = {
                        TextButton(onClick = {showDialog = false }) {
                            Text("Compartir")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = { showDialog = false }) {
                            Text("Cancelar")
                        }
                    })
            }
        }}
}
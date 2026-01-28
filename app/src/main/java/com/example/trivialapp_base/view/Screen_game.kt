package com.example.trivialapp_base.view

import android.widget.ProgressBar
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.ui.theme.AmarilloBotones
import com.example.trivialapp_base.ui.theme.AzulFondo
import com.example.trivialapp_base.ui.theme.MoradoTitulo
import com.example.trivialapp_base.ui.theme.NaranjaBotones
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
            Text("Round ${viewModel.indicePreguntaActual+1}/10",
                color = MoradoTitulo,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )

            Image(
                painter = painterResource(com.example.trivialapp_base.R.drawable.logo2),
                contentDescription = "Example",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .border(4.dp, color = MoradoTitulo, CircleShape)
            )

            Text(viewModel.preguntaActual!!.pregunta,
                color = MoradoTitulo,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.fillMaxWidth()
            )

            Row() {
                Button(onClick = {
                    viewModel.responderPregunta(viewModel.respuestasMezcladas[0])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)
                    },
                    modifier = Modifier
                        .width(160.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor =  NaranjaBotones,
                        contentColor = MoradoTitulo
                    ),
                    border = BorderStroke(5.dp, color = AmarilloBotones)

                ) {
                    Text(viewModel.respuestasMezcladas[0])
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = {
                    viewModel.responderPregunta(viewModel.respuestasMezcladas[1])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)
                    },
                    modifier = Modifier
                        .width(160.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor =  NaranjaBotones,
                        contentColor = MoradoTitulo
                    ),
                    border = BorderStroke(5.dp, color = AmarilloBotones)
                ) {
                    Text(viewModel.respuestasMezcladas[1])
                }
            }
            Row() {
                Button(onClick = {
                    viewModel.responderPregunta(viewModel.respuestasMezcladas[2])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)
                },
                    modifier = Modifier
                        .width(160.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor =  NaranjaBotones,
                        contentColor = MoradoTitulo
                    ),
                    border = BorderStroke(5.dp, color = AmarilloBotones)
                ) {
                    Text(viewModel.respuestasMezcladas[2])
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = {
                    viewModel.responderPregunta(viewModel.respuestasMezcladas[3])
                    if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)
                },
                    modifier = Modifier
                        .width(160.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor =  NaranjaBotones,
                        contentColor = MoradoTitulo
                    ),
                    border = BorderStroke(5.dp, color = AmarilloBotones)
                ) {
                    Text(viewModel.respuestasMezcladas[3])
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            LinearProgressIndicator(
                progress = { viewModel.tiempoRestante },
                color = Color.Blue,
                trackColor = Color.LightGray
            )
            if (viewModel.juegoTerminado) navController.navigate(Routes.Screenresult.route)
        }
    }}
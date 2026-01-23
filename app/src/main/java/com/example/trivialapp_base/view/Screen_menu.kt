package com.example.trivialapp_base.view

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.ui.theme.AmarilloBotones
import com.example.trivialapp_base.ui.theme.AzulFondo
import com.example.trivialapp_base.ui.theme.MoradoTitulo
import com.example.trivialapp_base.ui.theme.NaranjaBotones
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
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
            Text(
                text = " Trivia Masters: Pokémon & Marvel ",
                style = TextStyle(
                    color = MoradoTitulo,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive
                )
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
            //dropdown menu
            MyDropDownMenu(modifier = Modifier, viewModel)

            Button(
                onClick = {

                    navController.navigate(Routes.Screengame.route)
                    viewModel.iniciarJuego()},

                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =  NaranjaBotones,
                    contentColor = MoradoTitulo
                ),
                border = BorderStroke(5.dp, color = AmarilloBotones)
            ) {
                Text(text = "New Game!")
              }
        }
    }
}

@Composable
fun MyDropDownMenu(modifier: Modifier = Modifier, viewModel: GameViewModel) {

    var selectedText by remember { mutableStateOf("Selecciona dificultad") } // Texto inicial
    var expanded by remember { mutableStateOf(false) }

    Column(modifier = modifier) {
        Button(
            onClick = { expanded = true },
            modifier = Modifier
                .width(220.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = NaranjaBotones,
                contentColor = MoradoTitulo
            ),
            border = BorderStroke(5.dp, AmarilloBotones)
        ) {
            Text(text = selectedText) // 🔹 Muestra la opción seleccionada
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .width(220.dp)
                .border(1.dp, Color.Black, RoundedCornerShape(4.dp))
        ) {
                DropdownMenuItem(
                    text = { Text(text = "Facil") },
                    onClick = {
                        selectedText = "Facil"
                        expanded = false
                        viewModel.setDificultad("Facil")
                    }
                )
                DropdownMenuItem(
                    text = { Text(text = "Medio") },
                    onClick = {
                        selectedText = "Medio"
                        expanded = false
                        viewModel.setDificultad("Medio")
                    }
                )
                DropdownMenuItem(
                    text = { Text(text = "Dificil") },
                    onClick = {
                        selectedText = "Dificil"
                        expanded = false
                        viewModel.setDificultad("Dificil")
                    }
                )
            }
        }
    }




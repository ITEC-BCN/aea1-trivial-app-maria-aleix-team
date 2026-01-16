package com.example.trivialapp_base.view

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
    //navController: NavController, viewModel: GameViewModel
    Box(
        modifier = Modifier
            .fillMaxSize()           // ocupa toda la pantalla
            .background(Color.Blue), // fondo azul
        contentAlignment = Alignment.Center // centra el contenido
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // centra hijos horizontalmente
            verticalArrangement = Arrangement.Center           // opcional, para centrar internamente
        ) {

        }
    }
    Text(
        text = " Trivia Masters: Pokémon & Marvel ",
        style = TextStyle(
            color = Color.Blue,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
    )
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.Blue
        ),
        border = BorderStroke(5.dp, Color.Green)
    ) {
        Text(text = "Push")
    }
}
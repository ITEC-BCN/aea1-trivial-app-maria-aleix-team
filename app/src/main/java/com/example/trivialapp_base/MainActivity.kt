package com.example.trivialapp_base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp_base.ui.theme.TrivialAPP_BaseTheme
import com.example.trivialapp_base.view.GameScreen
import com.example.trivialapp_base.view.MenuScreen
import com.example.trivialapp_base.view.ResultScreen
import com.example.trivialapp_base.viewmodel.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            TrivialAPP_BaseTheme {
                // Controlador de navegación
                val navigationController = rememberNavController()
                val myViewModel by viewModels<GameViewModel>()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.Screenmenu.route
                ) {
                    composable(Routes.Screenmenu.route) { MenuScreen(navigationController, myViewModel) }
                    composable(Routes.Screengame.route) { GameScreen(navigationController, myViewModel) }
                    composable(Routes.Screenresult.route) { ResultScreen(navigationController, myViewModel) }
                }



                // Instanciamos el ViewModel una vez



                // Definición de rutas y navegación



            }
        }
    }
}
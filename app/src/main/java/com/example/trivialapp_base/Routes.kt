package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object Screen_splash:Routes("pantalla1")
    object Screen_menu:Routes("pantalla2")
    object Screen_game:Routes("pantalla3")
    object Screen_result:Routes("pantalla4")
}
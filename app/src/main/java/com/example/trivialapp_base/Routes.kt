package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object Screensplash:Routes("pantalla1")
    object Screenmenu:Routes("pantalla2")
    object Screengame:Routes("pantalla3")
    object Screenresult:Routes("pantalla4")
}
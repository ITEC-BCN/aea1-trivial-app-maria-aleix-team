package com.example.trivialapp_base.viewmodel

import android.os.CountDownTimer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas

class GameViewModel : ViewModel() {
    private var preguntasPartida: List<Pregunta> = emptyList()
    var indicePreguntaActual by mutableIntStateOf(0)
        private set

    var preguntaActual by mutableStateOf<Pregunta?>(null)
        private set

    var respuestasMezcladas by mutableStateOf<List<String>>(emptyList())
        private set

    var puntuacion by mutableIntStateOf(0)
        private set

    var tiempoRestante by mutableFloatStateOf(100f)
        private set

    var juegoTerminado by mutableStateOf(false)
        private set

    var dificultadSeleccionada by mutableStateOf("Facil")
        private set

    var categoriaSeleccionada by mutableStateOf("General")
        private set

    private var timer: CountDownTimer? = null
    private val TIEMPO_POR_PREGUNTA = 10000L // 10 segons

    fun setDificultad(dificultad: String) {
        dificultadSeleccionada = dificultad // Sense .value!
    }

    fun setCategoria(categoria: String) {
        categoriaSeleccionada = categoria // Sense .value!
    }
    fun iniciarJuego() {
        if (categoriaSeleccionada!="General") {
            preguntasPartida = ProveedorPreguntas
                .obtenerPreguntas()
                .filter { it.dificultad == dificultadSeleccionada && it.categoria == categoriaSeleccionada}
                .shuffled()
                .take(10)
        }
        else{
            preguntasPartida = ProveedorPreguntas
                .obtenerPreguntas()
                .filter { it.dificultad == dificultadSeleccionada }
                .shuffled()
                .take(10)
        }
        indicePreguntaActual = 0
        preguntaActual = preguntasPartida[indicePreguntaActual]
        puntuacion = 0
        juegoTerminado = false
        respuestasMezcladas = listOf(
            preguntaActual!!.respuesta1,
            preguntaActual!!.respuesta2,
            preguntaActual!!.respuesta3,
            preguntaActual!!.respuesta4,
        ).shuffled()
        iniciarTimer()
    }

    private fun cargarSiguientePregunta() {
        preguntaActual = preguntasPartida[indicePreguntaActual]
        respuestasMezcladas = listOf(
            preguntaActual!!.respuesta1,
            preguntaActual!!.respuesta2,
            preguntaActual!!.respuesta3,
            preguntaActual!!.respuesta4,
        ).shuffled()
        iniciarTimer()
    }

    fun responderPregunta(respuestaUsuario: String){
        if (respuestaUsuario == preguntaActual!!.respuestaCorrecta){
            puntuacion++
        }
        avanzarRonda()
        cargarSiguientePregunta()
    }

    private fun avanzarRonda(){
        if (indicePreguntaActual==9) juegoTerminado = true
        else indicePreguntaActual++
    }

    private fun iniciarTimer(){
            timer?.cancel()
            timer = object : CountDownTimer(TIEMPO_POR_PREGUNTA, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    tiempoRestante = millisUntilFinished.toFloat() / TIEMPO_POR_PREGUNTA
                }

                override fun onFinish(){
                    tiempoRestante = 0f

                    avanzarRonda()

                    if(indicePreguntaActual < 9){

                        cargarSiguientePregunta()
                    }
                    else {
                        juegoTerminado = true
                    }
                }
            }.start()
        }

        override fun onCleared(){
            super.onCleared()
            timer?.cancel()
        }
    }


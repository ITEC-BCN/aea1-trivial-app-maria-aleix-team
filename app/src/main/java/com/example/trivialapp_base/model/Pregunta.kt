package com.example.trivialapp_base.model

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String // Debe coincidir con una de las anteriores
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(
            //Nivel Facil
            Pregunta("¿Cuál es el Pokémon número 25 en la Pokédex?", "Pokemon", "Facil", "Bulbasaur", "Charmander", "Jigglypuff", "Pikachu", "Pikachu"),
            Pregunta("¿Qué tipo de Pokémon es Charmander?", "Pokemon", "Facil", "Agua", "Planta", "Eléctrico", "Fuego", "Fuego"),
            Pregunta("¿Cuál es la evolución final de Bulbasaur?", "Pokemon", "Facil", "Ivysaur", "Venusaur", "Charmander", "Gloom", "Venusaur"),
            Pregunta("¿Qué objeto se usa para atrapar Pokémon?", "Pokemon", "Facil", "Master Coin", "Safari Hat", "Pokédex", "Poké Ball", "Poké Ball"),
            Pregunta("¿Qué tipo de Pokémon es Squirtle?", "Pokemon", "Facil", "Planta", "Tierra", "Hielo", "Agua", "Agua"),

            Pregunta("¿Cómo se llama el martillo de Thor?", "Marvel", "Facil", "Stormbreaker", "Gungnir", "Andúril", "Mjolnir", "Mjolnir"),
            Pregunta("¿De qué país ficticio es originario Black Panther?", "Marvel", "Facil", "Sokovia", "Latveria", "Genosha", "Wakanda", "Wakanda"),
            Pregunta("¿Quién es el alter ego de Iron Man?", "Marvel", "Facil", "Bruce Wayne", "Steve Rogers", "Peter Parker", "Tony Stark", "Tony Stark"),
            Pregunta("¿Qué superhéroe fue picado por una araña radioactiva?", "Marvel", "Facil", "Ant-Man", "Wolverine", "Hawkeye", "Spider-Man", "Spider-Man"),
            Pregunta("¿Qué color es la piel de Hulk?", "Marvel", "Facil", "Rojo", "Azul", "Gris", "Verde", "Verde"),

            //Nivel Medio
            Pregunta("¿Qué tipo de Pokémon es Gengar?", "Pokemon", "Medio", "Psíquico/Siniestro", "Normal", "Dragón", "Fantasma/Veneno", "Fantasma/Veneno"),
            Pregunta("¿Cuántos Pokémon originales había en la primera generación?", "Pokemon", "Medio", "100", "250", "386", "151", "151"),
            Pregunta("¿Qué Pokémon legendario representa al tiempo?", "Pokemon", "Medio", "Palkia", "Giratina", "Arceus", "Dialga", "Dialga"),
            Pregunta("¿Qué movimiento es súper efectivo contra el tipo Agua?", "Pokemon", "Medio", "Hielo", "Veneno", "Siniestro", "Eléctrico", "Eléctrico"),
            Pregunta("¿Cuál es el Pokémon inicial de tipo planta en la región de Hoenn?", "Pokemon", "Medio", "Bulbasaur", "Turtwig", "Chikorita", "Treecko", "Treecko"),

            Pregunta("¿Qué gema del Infinito controla el tiempo?", "Marvel", "Medio", "Gema del Poder", "Gema del Espacio", "Gema de la Realidad", "Gema del Tiempo", "Gema del Tiempo"),
            Pregunta("¿Cómo se llama la inteligencia artificial creada por Tony Stark que luego se convierte en un Vengador?", "Marvel", "Medio", "Ultron", "Jarvis", "Friday", "Vision", "Vision"),
            Pregunta("¿Quién es el villano principal en Avengers: Infinity War?", "Marvel", "Medio", "Loki", "Ultron", "Red Skull", "Thanos", "Thanos"),
            Pregunta("¿Cómo se llama la hermana de Wanda Maximoff (en los cómics)?", "Marvel", "Medio", "Jean Grey", "Hope Summers", "Rogue", "Polaris", "Polaris"),
            Pregunta("¿Qué héroe lidera normalmente a los X-Men?", "Marvel", "Medio", "Wolverine", "Tormenta", "Bestia", "Cíclope", "Cíclope"),

            //Nivel Dificil
            Pregunta("¿Qué Pokémon puede aprender el movimiento 'Transformación'?", "Pokemon", "Dificil", "Mew", "Zorua", "Smeargle", "Ditto", "Ditto"),
            Pregunta("¿Cuál es el tipo dual de Lucario?", "Pokemon", "Dificil", "Lucha/Siniestro", "Acero/Psíquico", "Roca/Lucha", "Lucha/Acero", "Lucha/Acero"),
            Pregunta("¿Qué región fue introducida en Pokémon Diamante y Perla?", "Pokemon", "Dificil", "Kalos", "Johto", "Unova", "Sinnoh", "Sinnoh"),
            Pregunta("¿Qué Pokémon tiene el número 493 en la Pokédex Nacional?", "Pokemon", "Dificil", "Giratina", "Darkrai", "Shaymin", "Arceus", "Arceus"),
            Pregunta("¿Qué habilidad permite copiar la habilidad del rival al entrar en combate?", "Pokemon", "Dificil", "Impostor", "Adaptable", "Copiafiel", "Rastreo", "Rastreo"),

            Pregunta("¿En qué cómic apareció por primera vez Spider-Man?", "Marvel", "Dificil", "The Amazing Spider-Man #1", "Tales to Astonish #27", "Marvel Comics #1", "Amazing Fantasy #15", "Amazing Fantasy #15"),
            Pregunta("¿Quién fue el primer Capitán América antes de Steve Rogers en el universo alternativo?", "Marvel", "Dificil", "John Walker", "Bucky Barnes", "Sam Wilson", "Isaiah Bradley", "Isaiah Bradley"),
            Pregunta("¿Qué metal compone el escudo del Capitán América?", "Marvel", "Dificil", "Adamantium", "Carbonadio", "Titanio", "Vibranium", "Vibranium"),
            Pregunta("¿Cuál es el verdadero nombre de la Viuda Negra?", "Marvel", "Dificil", "Yelena Belova", "Maria Hill", "Carol Danvers", "Natasha Romanoff", "Natasha Romanoff"),
            Pregunta("¿Qué organización secreta reemplazó a S.H.I.E.L.D. en algunas historias?", "Marvel", "Dificil", "HYDRA", "A.I.M.", "Roxxon", "S.W.O.R.D.", "S.W.O.R.D.")
        )
    }
}
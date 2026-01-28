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
            Pregunta("¿Qué organización secreta reemplazó a S.H.I.E.L.D. en algunas historias?", "Marvel", "Dificil", "HYDRA", "A.I.M.", "Roxxon", "S.W.O.R.D.", "S.W.O.R.D."),

            //Nivel Facil
            Pregunta("¿Cuál es el Pokémon inicial de tipo fuego de Kanto?", "Pokemon", "Facil", "Vulpix", "Charmander", "Cyndaquil", "Torchic", "Charmander"),
            Pregunta("¿Qué Pokémon es conocido como el ratón eléctrico?", "Pokemon", "Facil", "Raichu", "Pichu", "Eevee", "Pikachu", "Pikachu"),
            Pregunta("¿Qué tipo es Pikachu?", "Pokemon", "Facil", "Fuego", "Agua", "Planta", "Eléctrico", "Eléctrico"),
            Pregunta("¿Cómo se llama el entrenador principal del anime Pokémon?", "Pokemon", "Facil", "Red", "Brock", "Ash Ketchum", "Gary", "Ash Ketchum"),
            Pregunta("¿Cuál es la evolución de Charmander?", "Pokemon", "Facil", "Charmeleon", "Charizard", "Magmar", "Flareon", "Charmeleon"),

            Pregunta("¿Cómo se llama el dios del trueno en Marvel?", "Marvel", "Facil", "Loki", "Odin", "Thor", "Hela", "Thor"),
            Pregunta("¿Qué superhéroe usa un escudo?", "Marvel", "Facil", "Iron Man", "Hawkeye", "Captain America", "Falcon", "Captain America"),
            Pregunta("¿Qué héroe puede encogerse de tamaño?", "Marvel", "Facil", "Wasp", "Hulk", "Ant-Man", "Vision", "Ant-Man"),
            Pregunta("¿Qué héroe es un genio millonario con una armadura?", "Marvel", "Facil", "Batman", "Iron Man", "War Machine", "Doctor Strange", "Iron Man"),
            Pregunta("¿Qué héroe se transforma cuando se enfada?", "Marvel", "Facil", "Thor", "Hulk", "Loki", "Drax", "Hulk"),

            //Nivel Medio
            Pregunta("¿Qué tipo es el Pokémon Gyarados?", "Pokemon", "Medio", "Agua", "Agua/Dragón", "Agua/Volador", "Dragón/Volador", "Agua/Volador"),
            Pregunta("¿Cuál es la evolución final de Squirtle?", "Pokemon", "Medio", "Wartortle", "Blastoise", "Lapras", "Feraligatr", "Blastoise"),
            Pregunta("¿Qué objeto revive a un Pokémon debilitado?", "Pokemon", "Medio", "Antídoto", "Éter", "Revivir", "Poción", "Revivir"),
            Pregunta("¿Qué Pokémon es conocido como el clon de Mew?", "Pokemon", "Medio", "Ditto", "Mewtwo", "Zoroark", "Genesect", "Mewtwo"),
            Pregunta("¿Qué tipo es súper efectivo contra Dragón?", "Pokemon", "Medio", "Fuego", "Agua", "Planta", "Hada", "Hada"),

            Pregunta("¿Quién es el hermano adoptivo de Thor?", "Marvel", "Medio", "Baldur", "Hela", "Loki", "Fenrir", "Loki"),
            Pregunta("¿Qué actor interpreta a Iron Man en el UCM?", "Marvel", "Medio", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo", "Robert Downey Jr.", "Robert Downey Jr."),
            Pregunta("¿Cómo se llama la organización dirigida por Nick Fury?", "Marvel", "Medio", "HYDRA", "A.I.M.", "S.H.I.E.L.D.", "S.W.O.R.D.", "S.H.I.E.L.D."),
            Pregunta("¿Qué héroe controla la magia?", "Marvel", "Medio", "Scarlet Witch", "Doctor Strange", "Loki", "Vision", "Doctor Strange"),
            Pregunta("¿Qué héroe viene de Wakanda?", "Marvel", "Medio", "Falcon", "Luke Cage", "Black Panther", "Blade", "Black Panther"),

            //Nivel Dificil
            Pregunta("¿Qué Pokémon tiene la habilidad Levitación?", "Pokemon", "Dificil", "Golem", "Metagross", "Weezing", "Braviary", "Weezing"),
            Pregunta("¿Qué Pokémon legendario representa el espacio?", "Pokemon", "Dificil", "Dialga", "Giratina", "Arceus", "Palkia", "Palkia"),
            Pregunta("¿Cuál es el tipo secundario de Gardevoir?", "Pokemon", "Dificil", "Psíquico", "Hada", "Psíquico/Lucha", "Psíquico/Hada", "Psíquico/Hada"),
            Pregunta("¿Qué región pertenece Pokémon Negro y Blanco?", "Pokemon", "Dificil", "Kalos", "Galar", "Unova", "Alola", "Unova"),
            Pregunta("¿Qué Pokémon puede cambiar de forma según el clima?", "Pokemon", "Dificil", "Castform", "Ditto", "Kecleon", "Zoroark", "Castform"),

            Pregunta("¿Quién es el creador de Ultron?", "Marvel", "Dificil", "Hank Pym", "Bruce Banner", "Tony Stark", "Reed Richards", "Hank Pym"),
            Pregunta("¿Cuál es el nombre real de Hulk?", "Marvel", "Dificil", "Bruce Wayne", "Bruce Banner", "Clark Kent", "Tony Stark", "Bruce Banner"),
            Pregunta("¿Qué raza es Thanos?", "Marvel", "Dificil", "Asgardiano", "Eterno", "Kree", "Inhumano", "Eterno"),
            Pregunta("¿Quién mata a Thanos en Avengers: Endgame?", "Marvel", "Dificil", "Iron Man", "Thor", "Captain America", "Scarlet Witch", "Thor"),
            Pregunta("¿Cómo se llama el martillo de Beta Ray Bill?", "Marvel", "Dificil", "Mjolnir", "Stormbreaker", "Gungnir", "Aesir", "Stormbreaker")

        )
    }
}
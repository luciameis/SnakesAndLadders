package com.luciameis.snakesandladders

class Board {

    val endPosition = 25
    val startPosition = 1

    val ladders = mapOf(
        3 to 11,
        6 to 17,
        9 to 18,
        10 to 12,
    )

    val snakes = mapOf(
        14 to 4,
        19 to 8,
        22 to 20,
        24 to 16
    )
}
package com.luciameis.snakesandladders

import kotlin.random.Random

class Player(startPosition: Int) {

    var position = startPosition

    fun rollDie() = Random.nextInt(1,7)
}
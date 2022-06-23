package com.luciameis.snakesandladders

class SnakesAndLadders {

    private val board = Board()
    private val player = Player(board.startPosition)

    fun start() {

        while (!player.hasWon()) {
            println("The initial position is ${player.position}")

            val roll = player.rollDie()
            println("The player rolls $roll")

            updatePlayerPosition(roll)
            println("The current position is ${player.position}\n")
        }

        println("Player has won!!!")
    }

    private fun Player.hasWon() = position >= board.endPosition

    private fun updatePlayerPosition(roll: Int) {
        val newPosition = player.position + roll
        player.position = applyShortcuts(newPosition)
    }

    private fun applyShortcuts(currentPosition: Int): Int {

        var endPosition = currentPosition

        board.ladders[currentPosition]?.let {
            println("The player has landed in a ladder 🥳")
            endPosition = it
        }

        board.snakes[currentPosition]?.let {
            println("The player has landed in a snake ☹️")
            endPosition = it
        }

        return endPosition
    }

}
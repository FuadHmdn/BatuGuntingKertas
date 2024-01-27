package fuad.BGK

import kotlin.random.Random

object Game {

    val option = listOf("ROCK", "PAPER", "SCISSORS")

    val optionPickDrawable = mapOf(
        "ROCK" to R.drawable.rockcomputer,
        "PAPER" to R.drawable.papercomputer,
        "SCISSORS" to R.drawable.scissorscomputer
    )

    val rule = mapOf(
        "ROCK-PAPER" to false,
        "ROCK-SCISSORS" to true,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
        "SCISSORS-ROCK" to false,
        "SCISSORS-PAPER" to true
    )

    fun isDraw(from: String, to: String):Boolean = from == to

    fun isWin(from: String, to: String):Boolean = rule["$from-$to"]!!

    fun pickRandomOption(): String = option[Random.nextInt(0,3)]

    fun pickDrawable(option: String) = optionPickDrawable[option]!!
}
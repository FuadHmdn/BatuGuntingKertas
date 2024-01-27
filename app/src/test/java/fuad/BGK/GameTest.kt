package fuad.BGK

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testPickRandom(){

        val option = listOf("ROCK", "PAPER", "SCISSORS")

        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
    }

    @Test
    fun testIsDraw(){
        Assert.assertTrue(Game.isDraw("PAPER", "PAPER"))
        Assert.assertTrue(Game.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(Game.isDraw("SCISSORS", "SCISSORS"))
    }

    @Test
    fun testIsWin(){
        Assert.assertTrue(Game.isWin("PAPER", "ROCK"))
        Assert.assertTrue(Game.isWin("ROCK", "SCISSORS"))
        Assert.assertTrue(Game.isWin("SCISSORS", "PAPER"))

        Assert.assertFalse(Game.isWin("PAPER", "SCISSORS"))
        Assert.assertFalse(Game.isWin("ROCK", "PAPER"))
        Assert.assertFalse(Game.isWin("SCISSORS", "ROCK"))
    }

}
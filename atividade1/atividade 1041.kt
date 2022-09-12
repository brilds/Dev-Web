package atividade1

import java.util.*


object querentaeum {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val x: Float
        val y: Float
        x = input.nextFloat()
        y = input.nextFloat()
        if (x == 0.0f && y == 0.0f) {
            System.out.printf("Origem%n")
        } else if (x.toDouble() == 0.0) {
            System.out.printf("Eixo Y%n")
        } else if (y.toDouble() == 0.0) {
            System.out.printf("Eixo X%n")
        } else if (x > 0.0 && y > 0.0) {
            System.out.printf("Q1%n")
        } else if (x > 0.0 && y < 0.0) {
            System.out.printf("Q4%n")
        } else if (x < 0.0 && y < 0.0) {
            System.out.printf("Q3%n")
        } else {
            System.out.printf("Q2%n")
        }
    }
}
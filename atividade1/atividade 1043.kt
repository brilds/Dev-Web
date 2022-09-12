package atividade1

import java.util.*


object querentaetres {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val a: Float
        val b: Float
        val c: Float
        val perimetro: Float
        val area: Float
        a = input.nextFloat()
        b = input.nextFloat()
        c = input.nextFloat()
        if (b - c < a && a < b + c) {
            if (a - c < b && b < a + c) {
                if (a - b < c && c < a + b) {
                    perimetro = a + b + c
                    System.out.printf("Perimetro = %.1f%n", perimetro)
                }
            }
        } else {
            area = (a + b) * c / 2
            System.out.printf("Area = %.1f%n", area)
        }
        input.close()
    }
}
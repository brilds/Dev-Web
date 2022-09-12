import java.util.Scanner

object trintaeoito {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val CACHORRO_QUENTE = 4.00
        val X_SALADA = 4.50
        val X_BANCON = 5.00
        val TORRADA_SIMPLES = 2.00
        val REFRIGERANTE = 1.50
        val a: Int
        val b: Int
        var total: Double
        a = input.nextInt()
        b = input.nextInt()
        if (a == 1) {
            total = b * CACHORRO_QUENTE
            System.out.printf("Total: R$ %.2f%n", total)
        }
        if (a == 2) {
            total = b * X_SALADA
            System.out.printf("Total: R$ %.2f%n", total)
        }
        if (a == 3) {
            total = b * X_BANCON
            System.out.printf("Total: R$ %.2f%n", total)
        }
        if (a == 4) {
            total = b * TORRADA_SIMPLES
            System.out.printf("Total: R$ %.2f%n", total)
        }
        if (a == 5) {
            total = b * REFRIGERANTE
            System.out.printf("Total: R$ %.2f%n", total)
        }
        input.close()
    }
}
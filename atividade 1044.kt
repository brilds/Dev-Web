import java.util.Scanner

object quarentaequatro {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val a: Int
        val b: Int
        val resto: Int
        a = input.nextInt()
        b = input.nextInt()
        resto = Math.max(a, b) % Math.min(a, b)
        if (resto == 0) {
            System.out.printf("Sao Multiplos%n")
        } else {
            System.out.printf("Nao sao Multiplos%n")
        }
        input.close()
    }
}
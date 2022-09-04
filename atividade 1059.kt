import java.util.Scanner

object cinquentataenove {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        var numerosPares = 1
        System.out.printf("⬇Numeros Pares⬇")
        System.out.printf("%n")
        System.out.printf("%n")
        while (numerosPares <= 100) {
            if (numerosPares % 2 == 0) {
                System.out.printf("%d%n", numerosPares)
            }
            numerosPares++
        }
        input.close()
    }
}
import java.util.Scanner

object sessentaesete {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val x: Int
        x = input.nextInt()
        for (i in 1..x) {
            if (i % 2 != 0) {
                System.out.printf("%d%n", i)
            }
        }
        input.close()
    }
}
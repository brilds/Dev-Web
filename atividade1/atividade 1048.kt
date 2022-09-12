import java.util.Scanner

object quarentaeoito {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val salarioColaborador: Float
        var reajuste: Float
        var novoSalario: Float

        salarioColaborador = input.nextFloat() //imputscanner para proximo numero
        if ((salarioColaborador >= 0.0f) and (salarioColaborador <= 400.00f)) {
            reajuste = salarioColaborador * 0.15f
            novoSalario = reajuste + salarioColaborador
            System.out.printf("Novo salario: %.2f%n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f%n", reajuste)
            System.out.printf("Em percentual: 15 %%%n")
        }
        if ((salarioColaborador > 400.00f) and (salarioColaborador <= 800.00f)) {
            reajuste = salarioColaborador * 0.12f
            novoSalario = reajuste + salarioColaborador
            System.out.printf("Novo salario: %.2f%n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f%n", reajuste)
            System.out.printf("Em percentual: 12 %%%n")
        }
        if (salarioColaborador > 800.00f && salarioColaborador <= 1200.00f) {
            reajuste = salarioColaborador * 0.10f
            novoSalario = reajuste + salarioColaborador
            System.out.printf("Novo salario: %.2f%n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f%n", reajuste)
            System.out.printf("Em percentual: 10 %%%n")
        }
        if (salarioColaborador > 1200.00f && salarioColaborador <= 2000.00f) {
            reajuste = salarioColaborador * 0.07f
            novoSalario = reajuste + salarioColaborador
            System.out.printf("Novo salario: %.2f%n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f%n", reajuste)
            System.out.printf("Em percentual: 7 %%%n")
        }
        if (salarioColaborador > 2000.00f) {
            reajuste = salarioColaborador * 0.04f
            novoSalario = reajuste + salarioColaborador
            System.out.printf("Novo salario: %.2f%n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f%n", reajuste)
            System.out.printf("Em percentual: 4 %%%n")
        }
        input.close()
    }
}
import java.util.*
//OBS: DIGITE UM NUMERO E APERTE ENTER, APOS DIGITE O OUTRO E APERTE ENTER PARA MOSTRAR O RESULTADO (NAO ENTENDI POR QUE O FLOAT N ESTA PEGANDO EX: 2.5)
object querentaeum {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val x: Float
        val y: Float
        println("Informe o primeiro número: ")
        x = input.nextFloat()
        println("Informe o segundo número: ")
        y = input.nextFloat()
        if (x == 0.0f && y == 0.0f) {

            System.out.printf("Origem%n")
        } else if (x.toDouble() == 0.0) {
            System.out.printf("Eixo Y%n")
        } else if (y.toDouble() == 0.0) {
            System.out.printf("Eixo X%n")
        } else if (x > 0.0 && y > 0.0) {
            System.out.printf("Quadrante: Q1%n")
        } else if (x > 0.0 && y < 0.0) {
            System.out.printf("Quadrante: Q4%n")
        } else if (x < 0.0 && y < 0.0) {
            System.out.printf("Quadrante: Q3%n")
        } else {
            System.out.printf("Quadrante: Q2%n")
        }
    }
}
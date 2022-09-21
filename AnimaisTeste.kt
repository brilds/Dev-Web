package AtividadePOO

import java.util.*


object AnimaisTeste {
    @JvmStatic
    fun main(args: Array<String>) {
        var op = 0
        val sc = Scanner(System.`in`)
        val horse = Cavalo("Pé de Pano", 10)
        val dog = Cachorro("Caramelo", 3)
        val p = Preguica("Preguicinha", 5)
        println("\nQual animal você deseja?")
        println("\n1. Cavalo")
        println("\n2. Cachorro")
        println("\n3. Preguiça")
        op = sc.nextInt()
        when (op) {
            1 -> {
                horse.imprimirInfo(null, op)
                horse.CavaloCorrer()
                horse.EmitirSom(null)
            }

            2 -> {
                dog.imprimirInfo(null, op)
                dog.CachorroCorrer()
                dog.EmitirSom(null)
            }

            3 -> {
                p.imprimirInfo(null, op)
                p.PreguicaAnda()
                p.EmitirSom(null)
            }

            else -> {
                println("Opção Inválida.")
            }
        }
    }
}
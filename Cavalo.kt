package AtividadePOO

class Cavalo(n: String?, idade: Int) : Animais(n, idade) {
    fun CavaloCorrer() {
        println("\nO $nome vai correr agora!")
        println("\nPocotó, pocotó, pocotó...")
    }

    override fun EmitirSom(som: String?) {
        println("\nO $nome vai relinchar")
        println("\niiirrrrí\niiirrrrí\niiirrrrí")
    }

    override fun imprimirInfo(nome: String?, idade: Int) {
        println("\nO cavalo $nome tem $idade anos.")
    }
}
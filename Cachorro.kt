package AtividadePOO

class Cachorro(n: String?, idade: Int) : Animais(n, idade) {
    fun CachorroCorrer() {
        println("\nO $nome vai correr agora!")
        println("\nruf ruf ruf...")
    }

    override fun EmitirSom(som: String?) {
        println("\nO $nome vai latir")
        println("\nau au au\nau au au\nau au au")
    }

    override fun imprimirInfo(nome: String?, idade: Int) {
        println("\nO cachorro $nome tem $idade anos.")
    }
}

package AtividadePOO

class Preguica(n: String?, idade: Int) : Animais(n, idade) {
    fun PreguicaAnda() {
        println("\nA $nome esta subindo na árvore bem devagarzinho...")
    }

    override fun EmitirSom(som: String?) {
        println("\nA $nome vai emitir seu som preguiçoso")
        println("\nZZZzzzzz\nZZZZzzzzz\nZZZZZzzzZZZ")
    }

    override fun imprimirInfo(nome: String?, idade: Int) {
        println("\nA preguiça $nome tem $idade anos.")
    }
}
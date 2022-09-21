package AtividadePOO

abstract class Animais(n: String?, idade: Int) {
    var nome: String?
    var idade: Int

    init {
        nome = n
        this.idade = idade
    }

    abstract fun EmitirSom(som: String?)
    abstract fun imprimirInfo(
        nome: String?,
        idade: Int,
    )
}
package bankdio

class Pessoa {
    var nome: String = "Luis"

    var cpf: String = "000.000.001.02"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val luis = Pessoa()

 println(luis.pessoaInfo())

}
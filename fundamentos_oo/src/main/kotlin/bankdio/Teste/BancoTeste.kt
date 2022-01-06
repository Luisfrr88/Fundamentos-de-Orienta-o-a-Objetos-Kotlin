package bankdio.Teste

import bankdio.Banco

fun main() {
    val bankdio = Banco("LFBANK",12)

    println(bankdio.nome)
    println(bankdio.numero)
    println(bankdio.info())
}
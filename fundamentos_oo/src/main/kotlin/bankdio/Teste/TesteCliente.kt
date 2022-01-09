package bankdio.Teste

import bankdio.ClienteTipo

fun main() {
        val josh = Cliente(
            nome = "Josh da Silva",
            cpf = "001.002.003-004",
            clienteTipo = ClienteTipo.PF,
            senha = "123456"
        )
    println(josh)
    TesteAutenticacao().autentica(josh)
}
package bankdio.Teste

import bankdio.Gerente

fun main() {
    val luis = Gerente(nome = "Luis Fernando Gostoso", cpf = "001.002.003-004", Salario = 11250.0)

    imprimeRelatorioAuxilio.imprime(luis)

}
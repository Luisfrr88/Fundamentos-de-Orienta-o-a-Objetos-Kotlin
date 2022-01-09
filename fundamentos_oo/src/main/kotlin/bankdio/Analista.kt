package bankdio

import java.math.BigDecimal

class Analista(nome: String, cpf: String, Salario: Double) : Funcionario(nome, cpf, Salario) {

    override fun calculoAuxilio() = Salario * 0.1
}

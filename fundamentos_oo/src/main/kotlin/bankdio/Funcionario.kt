package bankdio

import java.math.BigDecimal

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    val Salario: Double


 ) : Pessoa(nome, cpf){
     protected abstract fun calculoAuxilio(): Double
    override fun toString(): String ="""
        Nome: $nome
        Cpf: $cpf
        Salário: $Salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()

 }





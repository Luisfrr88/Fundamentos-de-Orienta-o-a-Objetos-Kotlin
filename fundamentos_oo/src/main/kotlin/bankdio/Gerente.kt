package bankdio

class Gerente(nome: String, cpf: String, Salario: Double) : Funcionario(nome,cpf,Salario){

    override fun calculoAuxilio(): Double = Salario * 0.4
}
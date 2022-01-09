package bankdio

class Gerente(
    nome: String,
    cpf: String,
    Salario: Double,
    val senha: String
) : Funcionario(nome,cpf,Salario,),Logavel{
    override fun calculoAuxilio(): Double = Salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}

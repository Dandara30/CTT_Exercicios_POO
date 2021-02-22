package exercicio3

sealed class Funcionario(
    val id: String,
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    fun exibirDados(f: Funcionario) {
        return when (f) {
            is Gestor -> println("Cargo atual: Gestor\nId: ${f.id}\nNome: ${f.nome}\nCPF: ${f.cpf}\nSalario Atual: ${f.salario} ")
            is Programador -> println("Cargo atual: Programador\nId: ${f.id}\nNome: ${f.nome}\nCPF: ${f.cpf}\nSalario Atual: ${f.salario} ")
        }
    }

    fun reajusteSalario(f: Funcionario) {
        when (f) {
            is Gestor -> {
                f.salario += f.salario * 0.1
            }

            is Programador -> {
                f.salario += f.salario * 0.2
            }
        }

        println("Salario reajustado com sucesso!\n")
        exibirDados(f)

    }

}

class Gestor(idGestor: String,
             nomeGestor: String,
             cpfGestor: String,
             salarioGestor: Double) : Funcionario(
    id = idGestor,
    nome = nomeGestor,
    cpf = cpfGestor,
    salario = salarioGestor
)

class Programador(idProgramador: String,
             nomeProgramador: String,
             cpfProgramador: String,
             salarioProgramador: Double) : Funcionario(
    id = idProgramador,
    nome = nomeProgramador,
    cpf = cpfProgramador,
    salario = salarioProgramador
)



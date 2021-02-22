import exercicio3.Funcionario
import exercicio3.Gestor
import exercicio3.Programador
import java.util.*

fun menu(listaFuncionario: MutableList<Funcionario>) {

    println("#####################################################################")
    println("                        Gestão de RH                                 ")
    println("#####################################################################")

    println("\n\n")
    println("Menu de Opcoes:\n\n")
    println("[1] Cadastrar funcionário\n")
    println("[2] Pesquisar funcionário\n")

    println("\n\n")

    println("Escolha uma das opcoes acima:\n")
    val scanner = Scanner(System.`in`)
    val opcao = scanner.nextInt()


    when(opcao) {
        1 -> cadastrarFuncionario(listaFuncionario)
        2 -> pesquisarFuncionario(listaFuncionario)
        else -> {
            println("Opcao invalida! Tente novamente")
            menu(listaFuncionario)
        }
    }
}

fun cadastrarFuncionario(listaFuncionario: MutableList<Funcionario>) {

    val scanner = Scanner(System.`in`)

    println("Digite o ID do Funcionario :\n")
    val id = scanner.nextLine()

    println("Digite o Nome do Funcionario :\n")
    val nome = scanner.nextLine()

    println("Digite o CPF do Funcionario :\n")
    val cpf = scanner.nextLine()

    println("Digite o Salário Atual do Funcionario :\n")
    val salarioAtual = scanner.nextDouble()

    println("Digite [1] para Gestor e [2] para Programador :\n")
    val tipoFuncionario = scanner.nextInt()


    val funcionario: Funcionario
    funcionario = if (tipoFuncionario == 1) {
        Gestor(id, nome, cpf, salarioAtual)
    } else {
        Programador(id, nome, cpf, salarioAtual)
    }

    listaFuncionario.add(funcionario)
    println("Funcionario salvo com sucesso!")

    menu(listaFuncionario)

}

fun pesquisarFuncionario(listaFuncionario: MutableList<Funcionario>) {

    val scanner = Scanner(System.`in`)

    println("Digite o ID do Funcionario :\n")
    val id = scanner.nextLine()

    println("Digite [1] para exibir dados e [2] para reajustar salario:\n")
    val opcaoEscolhida = scanner.nextInt()


    for (item in listaFuncionario) {
        if (item.id == id) {

            when(opcaoEscolhida) {
                1 -> item.exibirDados(item)
                2 -> item.reajusteSalario(item)
            }

        }
    }

    menu(listaFuncionario)
}



fun main() {

    val listaFuncionario: MutableList<Funcionario> = mutableListOf()

    menu(listaFuncionario)


}
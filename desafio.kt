// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL } // ainda n está sendo usado

class Usuario //poderia virar uma data class
                                //val talvez seja melhor que var ou vice versa
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
                    //varargs pode ser usado para adicionar multiplos usuarios
    fun matricular(usuario: Usuario) { //quando a função matricular for chamada, o objetivo é que usuario seja adiciojnado na lista de inscritos
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

//substituir o codigo quando terminar

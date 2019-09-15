package br.com.fiap.mastercook.model


data class Receita(
    val title: String,
    val rating: Double,
    val dificuldade:Dificuldade,
    val imageURL: String
)


enum class Dificuldade{
    Fácil,Médio,Difícil
}


data class Ingrediente(
    val nome:String,
    val imageURL: String
)
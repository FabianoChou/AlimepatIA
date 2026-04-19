package com.example.alimepatia.model

data class Membro(
    val id: String,
    val nome: String,
    val tarefasConcluidas: Int,
    val nivelEmpatia: String, // ex: Alto, Médio, Baixo
    val observacoes: String
)

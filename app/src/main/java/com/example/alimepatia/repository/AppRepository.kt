package com.example.alimepatia.repository

import com.example.alimepatia.model.Alimento
import com.example.alimepatia.model.Membro

class AppRepository {

    // Mock data for in-memory storage
    private val alimentos = mutableListOf(
        Alimento("1", "Arroz", 50, "kg", "2023-10-25"),
        Alimento("2", "Feijão", 30, "kg", "2023-10-24"),
        Alimento("3", "Óleo", 15, "litros", "2023-10-20")
    )

    private val membros = mutableListOf(
        Membro("1", "João Silva", 12, "Alto", "Ótimo engajamento nas entregas"),
        Membro("2", "Maria Santos", 8, "Médio", "Precisa de apoio em algumas tarefas")
    )

    fun getAlimentos(): List<Alimento> {
        return alimentos.toList()
    }

    fun addAlimento(alimento: Alimento) {
        alimentos.add(alimento)
    }

    fun getMembros(): List<Membro> {
        return membros.toList()
    }

    fun addMembro(membro: Membro) {
        membros.add(membro)
    }
}

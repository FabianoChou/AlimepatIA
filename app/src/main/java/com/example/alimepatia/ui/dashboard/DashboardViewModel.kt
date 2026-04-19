package com.example.alimepatia.ui.dashboard

import androidx.lifecycle.ViewModel
import com.example.alimepatia.repository.AppRepository

class DashboardViewModel : ViewModel() {
    private val repository = AppRepository()

    fun getAlimentosCount(): Int {
        return repository.getAlimentos().size
    }

    fun getMembrosCount(): Int {
        return repository.getMembros().size
    }
}

package com.example.alimepatia.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.alimepatia.R
import com.example.alimepatia.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DashboardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvAlimentosSummary.text = "Temos ${viewModel.getAlimentosCount()} tipos de alimentos cadastrados no estoque geral."
        binding.tvEquipeSummary.text = "Existem ${viewModel.getMembrosCount()} membros monitorados atualmente."

        binding.btnManageAlimentos.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_alimentosFragment)
        }

        binding.btnManageEquipe.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_equipeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

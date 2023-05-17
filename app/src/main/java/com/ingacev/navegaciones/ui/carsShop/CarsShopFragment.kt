package com.ingacev.navegaciones.ui.carsShop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import com.ingacev.navegaciones.databinding.FragmentCarsShopBinding
import com.ingacev.navegaciones.ui.carsShop.adapter.CarsAdapter
import kotlinx.coroutines.launch

class CarsShopFragment : Fragment() {

    private var _binding: FragmentCarsShopBinding? = null

    private val binding get() = _binding!!

    private val viewModel: CarsShopViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCarsShopBinding.inflate(inflater, container, false)
        val root: View = binding.root

        viewModel.viewModelScope.launch {
            viewModel.getCars()
        }

        return root
    }


    override fun onResume() {
        super.onResume()
        viewModel.data.observe(viewLifecycleOwner) { newData ->
            val adapter = CarsAdapter(newData.vehicles)
            binding.listCarsCarsShop.setAdapter(adapter)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
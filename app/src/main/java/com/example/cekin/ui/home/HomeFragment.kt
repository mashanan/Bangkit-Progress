package com.example.cekin.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cekin.databinding.FragmentHomeBinding
import com.example.cekin.ui.Profile.EditProfilePage
import com.example.cekin.ui.Profile.ProfilePage
import com.example.cekin.ui.Supply.SupplyPage
import com.example.cekin.ui.chart.ChartPage

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profilepagebtn.setOnClickListener {
            val intent = Intent(requireContext(), ProfilePage.ProfilePage::class.java)
            startActivity(intent)
        }

        binding.squareButton1.setOnClickListener {
            val intent = Intent(requireContext(), SupplyPage::class.java)
            startActivity(intent)
        }

        binding.squareButton2.setOnClickListener {
            val intent = Intent(requireContext(), ChartPage::class.java)
            startActivity(intent)
        }
    }
}
package com.example.cekin.ui.Supply

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cekin.databinding.FragmentSupplyBinding
import com.example.cekin.ui.Profile.EditProfilePage
import com.example.cekin.ui.chart.ChartPage

class SupplyFragment : Fragment() {

    private var _binding: FragmentSupplyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val supplyViewModel =
            ViewModelProvider(this).get(SupplyViewModel::class.java)

        _binding = FragmentSupplyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.squareButton1.setOnClickListener {
            val intent = Intent(requireContext(), SupplyPage::class.java)
            startActivity(intent)
        }

    }
}
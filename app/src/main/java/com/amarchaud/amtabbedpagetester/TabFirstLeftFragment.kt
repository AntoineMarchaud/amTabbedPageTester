package com.amarchaud.amtabbedpagetester

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.amarchaud.amtabbedpagetester.databinding.FragmentTabFirstLeftBinding


class TabFirstLeftFragment : Fragment() {

    private var _binding: FragmentTabFirstLeftBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTabFirstLeftBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButtonLeft.setOnClickListener {
            findNavController().navigate(R.id.action_ongletFirstLeftFragment_to_tabSecondLeftFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
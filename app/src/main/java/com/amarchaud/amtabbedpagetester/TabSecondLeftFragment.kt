package com.amarchaud.amtabbedpagetester

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amarchaud.amtabbedpagetester.databinding.FragmentTabSecondLeftBinding
import com.amarchaud.amtabbedpagetester.databinding.FragmentTabSecondRightBinding

class TabSecondLeftFragment : Fragment() {

    private var _binding: FragmentTabSecondLeftBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTabSecondLeftBinding.inflate(inflater)
        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
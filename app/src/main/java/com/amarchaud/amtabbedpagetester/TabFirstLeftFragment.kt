package com.amarchaud.amtabbedpagetester

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_tab_first_left.*
import kotlin.reflect.KProperty




class TabFirstLeftFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).bottom_nav?.visibility = View.VISIBLE

        return inflater.inflate(R.layout.fragment_tab_first_left, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButtonLeft.setOnClickListener {
            findNavController().navigate(R.id.action_ongletFirstLeftFragment_to_tabSecondLeftFragment)
        }
    }
}
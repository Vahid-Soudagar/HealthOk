package com.example.healthok.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.healthok.adapters.CategoriesAdapter
import com.example.healthok.databinding.FragmentTelemedicineFragmentBinding
import com.example.healthok.utils.DemoData


class TelemedicineFragment : Fragment() {

    private lateinit var binding: FragmentTelemedicineFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTelemedicineFragmentBinding.inflate(layoutInflater)
        val view = binding.root

        val list = DemoData.categories

        val adapter = CategoriesAdapter(data = list)
        val layoutManager = LinearLayoutManager( requireContext(), LinearLayoutManager.HORIZONTAL, false)

        binding.horizontalRecyclerView.layoutManager = layoutManager
        binding.horizontalRecyclerView.adapter = adapter
        return view
    }


}
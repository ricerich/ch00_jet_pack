package com.example.ch00_jet_pack


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import com.example.ch00_jet_pack.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return FragmentThreeBinding.inflate(inflater, container, false).root
        return inflater.inflate(R.layout.fragment_three2, container, false)
    }
}
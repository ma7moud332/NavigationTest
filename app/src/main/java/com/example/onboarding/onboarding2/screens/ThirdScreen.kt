package com.example.onboarding.onboarding2.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onboarding.R
import com.example.onboarding.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {

    lateinit var binding: FragmentThirdScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentThirdScreenBinding.inflate(inflater, container, false)

        binding.finsh.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingFinished()
        }

        return binding.root
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}
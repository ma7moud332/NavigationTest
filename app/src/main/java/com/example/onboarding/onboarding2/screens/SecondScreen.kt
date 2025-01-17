package com.example.onboarding.onboarding2.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.onboarding.R
import com.example.onboarding.databinding.FragmentSecondScreenBinding
import com.example.onboarding.databinding.FragmentViewPagerBinding


class SecondScreen : Fragment() {

    lateinit var binding: FragmentSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSecondScreenBinding.inflate(inflater, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.next2.setOnClickListener {

            viewPager?.currentItem = 2
        }

        return binding.root
    }

}
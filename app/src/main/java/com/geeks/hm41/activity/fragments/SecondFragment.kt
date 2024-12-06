package com.geeks.hm41.activity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.geeks.hm41.databinding.FragmentHomeBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userSecondFragment = args.user

        binding.etName.text = userSecondFragment.name
        binding.etEmail.text = userSecondFragment.email
        binding.etPassword.text = userSecondFragment.password
    }
}
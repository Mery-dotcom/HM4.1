package com.geeks.hm41.activity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.hm41.activity.data.User
import androidx.navigation.fragment.findNavController
import com.geeks.hm41.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners(): View? {
        binding.buttonSend.setOnClickListener {
            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val user = User(name,email, password)
            val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment(user)
            findNavController().navigate(
            action
            )
        }

        return view
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }
}
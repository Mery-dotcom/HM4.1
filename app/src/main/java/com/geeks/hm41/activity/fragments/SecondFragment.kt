package com.geeks.hm41.activity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.geeks.hm41.databinding.FragmentSecondBinding
import com.geeks.hm41.fragments.SecondFragmentArgs

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val args : SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userSecondFragment = args.user

        binding.tvName.text = userSecondFragment.name
        binding.tvEmail.text = userSecondFragment.email
        binding.tvPassword.text = userSecondFragment.password
    }
}
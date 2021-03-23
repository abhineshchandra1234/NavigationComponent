package com.eegrab.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnAccept.setOnClickListener {
            val age = etAge.text.toString().toInt()
            val name = etName.text.toString()

            val user = User(name, age)

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user,"abhinesh",99)

            findNavController().navigate(action)
        }
    }
}
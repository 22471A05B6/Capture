package com.example.capture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Locations : Fragment() {
    lateinit var btn1: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_locations, container, false)

        // Initialize the button
        btn1 = view.findViewById(R.id.one)

        // Set up the button click listener to navigate to ThemeFragment
        btn1.setOnClickListener {
            val themeFragment = Themebday()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }

        return view
    }
}

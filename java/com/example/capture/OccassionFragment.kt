package com.example.capture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class OccassionFragment : Fragment() {

    lateinit var btn1: Button
    lateinit var btn2: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_occassion, container, false)

        // Initialize buttons
        btn1 = view.findViewById(R.id.one)
        btn2 = view.findViewById(R.id.two)

        // Set up the first button's click listener (Navigate to Theme Fragment)
        btn1.setOnClickListener {
            navigateToThemeFragment()  // Navigates to Themebday Fragment
        }

        // Set up the second button's click listener (Navigate to Pre-Wedding Fragment)
        btn2.setOnClickListener {
            navigateToPreWeddingFragment()  // Navigates to wdressFragment (Pre-Wedding Fragment)
        }

        return view
    }

    // Function to navigate to Theme Fragment (Themebday)
    private fun navigateToThemeFragment() {
        val themeFragment = Themebday()  // Replace with your actual fragment
        val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, themeFragment, "THEME_FRAGMENT")
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    // Function to navigate to Pre-Wedding Fragment (wdressFragment)
    private fun navigateToPreWeddingFragment() {
        val preWeddingFragment = wdressFragment()  // Replace with your actual fragment
        val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, preWeddingFragment, "PRE_WEDDING_FRAGMENT")
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}

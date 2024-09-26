package com.example.capture

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment() {
    // Declare the button variable
    lateinit var btn1: Button

    // Inflate the fragment's layout and initialize the button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize the button after the view is inflated
        btn1 = view.findViewById(R.id.one)

        return view
    }

    // Handle view actions after the fragment's view has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the button click listener
        btn1.setOnClickListener {
            // Action to be performed when the button is clicked
            var i = Intent(requireContext(),SixthActivity::class.java)
            startActivity(i)
        }
    }
}

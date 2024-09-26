package com.example.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.window.OnBackInvokedDispatcher
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.capture.OccassionFragment
import com.example.capture.R
import com.example.capture.databinding.ActivityFourBinding
import com.example.capture.databinding.ActivityMainBinding

import com.example.capture.HomeFragment
import com.google.android.material.navigation.NavigationView

class FourActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityFourBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.nav_open, R.string.nav_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationDrawer.setNavigationItemSelectedListener(this)

        fragmentManager=supportFragmentManager
        openFragment(HomeFragment())


    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.home -> openFragment(HomeFragment())
            R.id.occ -> openFragment(OccassionFragment())
            R.id.themes-> openFragment(Themebday())
            R.id.loc->openFragment(Locations())
            R.id.costume->openFragment(DressFragment())
            R.id.pg->openFragment(PhotographersFragment())
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            onBackPressedDispatcher.onBackPressed()
        }
    }
    private fun openFragment(fragment:Fragment){
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()

    }
}
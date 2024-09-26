package com.example.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dress : AppCompatActivity() {
    lateinit var b1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dress)
        b1=findViewById(R.id.one)
        b1.setOnClickListener {
            var i=Intent(this,location::class.java)
            startActivity(i)
        }
    }
}
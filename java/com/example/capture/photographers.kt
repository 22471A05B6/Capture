package com.example.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class photographers : AppCompatActivity() {
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photographers)
        btn1=findViewById(R.id.one)
        btn1.setOnClickListener {
            var h=Intent(this,location::class.java)
            startActivity(h)
        }



    }
}
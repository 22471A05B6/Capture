package com.example.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TraditionalActivity : AppCompatActivity() {
    lateinit var b1:Button
    lateinit var b2:Button
    lateinit var b3:Button
    lateinit var b4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traditional)
        b1=findViewById(R.id.one)
        b2=findViewById(R.id.two)
        b3=findViewById(R.id.t)
        b4=findViewById(R.id.i)
        b1.setOnClickListener {
            var i= Intent(this,location::class.java)
            startActivity(i)
        }
        b2.setOnClickListener {
            var j= Intent(this,location::class.java)
            startActivity(j)
        }
        b3.setOnClickListener {
            var k= Intent(this,location::class.java)
            startActivity(k)
        }
        b4.setOnClickListener {
            var l= Intent(this,location::class.java)
            startActivity(l)
        }
    }
}
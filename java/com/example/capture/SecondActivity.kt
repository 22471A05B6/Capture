package com.example.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SecondActivity : AppCompatActivity() {
    lateinit var btn2:Button
    lateinit var user:TextInputEditText
    lateinit var pa:TextInputEditText
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn2=findViewById(R.id.b2)
        user=findViewById(R.id.name)
        pa=findViewById(R.id.pwd)
        btn3=findViewById(R.id.b3)
        btn2.setOnClickListener {
            var i = Intent(this, ThirdActivity::class.java)
            startActivity(i)
        }
        btn3.setOnClickListener {
            var user = user.text.toString()
            var pa = pa.text.toString()
            if (user.isEmpty()) {
                Toast.makeText(
                    this, "Username should not be empty ", Toast.LENGTH_SHORT
                ).show()

            }
            else if(pa.isEmpty()) {
                Toast.makeText(
                    this,"password should not be empty",Toast.LENGTH_SHORT).show()
            }else{
                var j = Intent(this, FourActivity::class.java)
                startActivity(j)
            }
        }

    }
}
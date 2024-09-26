package com.example.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class ThirdActivity : AppCompatActivity() {
    lateinit var btn3:Button
    lateinit var na:TextInputEditText
   lateinit var email:TextInputEditText
   lateinit var password:TextInputEditText
    lateinit var renter:TextInputEditText
    lateinit var phone:TextInputEditText
    lateinit var cbox:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btn3=findViewById(R.id.b3)
        na=findViewById(R.id.n)
        renter=findViewById(R.id.rp)
        phone=findViewById(R.id.ph)
        cbox=findViewById(R.id.check)
        val email= findViewById <com.google.android.material.textfield.TextInputEditText>(R.id.e)
        val password = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.p)
        val btn3 = findViewById<com.google.android.material.button.MaterialButton>(R.id.b3)


        btn3.setOnClickListener {
            var na=na.text.toString()
            val email = email.text.toString()
            val password= password.text.toString()
            var renter=renter.text.toString()
            var phone=phone.text.toString()
            if (na.isEmpty()){
                Toast.makeText(this,"Name is Required",Toast.LENGTH_SHORT).show()
            }
            if (!isEmailValid(email)) {
                Toast.makeText(this,"Enter valid EmailId",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!isPasswordValid(password)) {
                Toast.makeText(this,"Password should Contain 6 characters",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                var i=Intent(this,FourActivity::class.java)
                startActivity(i)
            }
        }
    }

    private fun isEmailValid(email: String): Boolean {
        val emailRegex = Regex("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}\$")
        return emailRegex.matches(email)
    }

    private fun isPasswordValid(password: String): Boolean {
        val minLength = 6
        return password.length >= minLength



    }
}


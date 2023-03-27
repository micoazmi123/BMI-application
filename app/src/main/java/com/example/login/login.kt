package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var et_user_name = findViewById(R.id.inputUsername) as EditText
        var et_password = findViewById(R.id.inputPassword) as EditText
        var btn_submit = findViewById(R.id.btnLogin) as Button
        var btn_reset = findViewById(R.id.btnReset) as Button
        var btn_regis = findViewById(R.id.btnRegis) as Button


        btn_regis.setOnClickListener{
            val intent=Intent (this,Register::class.java)
            startActivity(intent)
        }
        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
            Toast.makeText(this, "Silahkan isi kembali username dan password", Toast.LENGTH_SHORT).show()
        }

        btn_submit.setOnClickListener {
            val user_name = et_user_name.text.toString();
            val password = et_password.text.toString();

            if (user_name.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().signInWithEmailAndPassword(user_name,password)
                .addOnCompleteListener{

                    if (!it.isSuccessful){ return@addOnCompleteListener
                        val intent = Intent (this, menu_utama::class.java)
                        startActivity(intent)
                    }
                    else
                        Toast.makeText(this, "Succesfully Login", Toast.LENGTH_SHORT).show()
                    val intent = Intent (this, menu_utama::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener{
                    Log.d("Main", "Failed Login: ${it.message}")
                    Toast.makeText(this, "Email/Password incorrect", Toast.LENGTH_SHORT).show()


                }

        }

            }









    }












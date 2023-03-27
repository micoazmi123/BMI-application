package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.firebase.database.core.view.View

class menu_utama : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
        var hitung=findViewById<ImageView>(R.id.imageView2)
        var quest= findViewById<ImageView>(R.id.imageView3)

        hitung.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        quest.setOnClickListener {
            val intent=Intent(this,Quest::class.java)
            startActivity(intent)
        }



    }


}
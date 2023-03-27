package com.example.login

import android.content.Intent
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Quest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest)
        var quest2=findViewById<ImageView>(R.id.imageView4)
        var quest1=findViewById<ImageView>(R.id.imageView5)
        var quest3=findViewById<ImageView>(R.id.imageView6)
        var quest4=findViewById<ImageView>(R.id.imageView7)




        quest2.setOnClickListener {
            val intent= Intent(this,quest_pushup::class.java)
            startActivity(intent)
            quest2.setImageResource(R.drawable.pushupcomplete)
            Toast.makeText(this, "Challange ini sesuai kejujuran masing2 ya ", Toast.LENGTH_SHORT).show()
        }
        quest1.setOnClickListener {
            val intent= Intent(this,quest_run::class.java)
            startActivity(intent)
            quest1.setImageResource(R.drawable.runcomplete)
            Toast.makeText(this, "Challange ini sesuai kejujuran masing2 ya ", Toast.LENGTH_SHORT).show()

        }
        quest3.setOnClickListener {
            val intent= Intent(this,quest_skipping::class.java)
            startActivity(intent)
            quest3.setImageResource(R.drawable.skipcomplete)
            Toast.makeText(this, "Challange ini sesuai kejujuran masing2 ya ", Toast.LENGTH_SHORT).show()

        }
        quest4.setOnClickListener {
            val intent=Intent(this,quest_noeat::class.java)
            startActivity(intent)
            quest4.setImageResource(R.drawable.eat1)
            Toast.makeText(this, "Challange ini sesuai kejujuran masing2 ya ", Toast.LENGTH_SHORT).show()
        }


    }
}
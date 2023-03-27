package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class hasil_bmi : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_bmi)
        val recalculate= findViewById<Button>(R.id.recalculate)
        val KUNCI="age"
        val KUNCI4="bmi"



        val pesan = intent.getStringExtra(KUNCI)
        val idPesanMasuk= findViewById<TextView>(R.id.age)
        idPesanMasuk.text= pesan


        val pesan4 = intent.getStringExtra(KUNCI4)
        val idPesanMasuk4= findViewById<TextView>(R.id.your_bmi)
        idPesanMasuk4.text=pesan4

        /*
        val BMI = Math.round(intent.getFloatExtra("bmi", 0f) * 100 / 100).toFloat()


        val category = findViewById<TextView>(R.id.category)
        val category1 = Category()
        category.setText(category1.getCategory(BMI))

        val condition = findViewById<TextView>(R.id.condition)
        val condition1 = Condition()
        condition.setText(condition1.getCategory(BMI))*/




        recalculate.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }




}
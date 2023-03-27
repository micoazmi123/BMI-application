package com.example.login

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val female_text = findViewById<TextView>(R.id.female)
        val male_text = findViewById<TextView>(R.id.male)
        val reset=findViewById<Button>(R.id.reset2)
        val height=findViewById<EditText>(R.id.etHeight)
        val weight=findViewById<EditText>(R.id.etWeight)
        val btn=findViewById<Button>(R.id.button)
        val result=findViewById<TextView>(R.id.textView4)
        val age=findViewById<TextView>(R.id.age)

        val age_plus=findViewById(R.id.age_plus)as RelativeLayout
        val age_minus=findViewById(R.id.age_minus)as RelativeLayout
        var count_age=19

        btn.setOnClickListener {
            val h:Float=height.text.toString().toFloat()/100
            val w:Float=weight.text.toString().toFloat()
            val answer:Float=w/(h*h)


            result.text=answer.toString()
            val intent = Intent(this, hasil_bmi::class.java)
            intent.putExtra("bmi", result.text.toString())
            intent.putExtra("age", age.text.toString())
            startActivity(intent)

        }

        male_text.setOnClickListener{
            male_text.setTextColor(Color.parseColor("#FFFFFF"))
            male_text.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.male_white, 0, 0)

        }
        female_text.setOnClickListener {
            female_text.setTextColor(Color.parseColor("#FFFFFF"))
            female_text.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.female_white, 0, 0)
        }

        reset.setOnClickListener {
            male_text.setTextColor(Color.parseColor("#8D8E99"))
            male_text.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.male, 0, 0)
            female_text.setTextColor(Color.parseColor("#8D8E99"))
            female_text.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.female, 0, 0)
            weight.setText("50")
            height.setText("0")
            Toast.makeText(this, "Telah di Reset", Toast.LENGTH_SHORT).show()


        }

        age_plus.setOnClickListener {
            count_age++
            age.setText(count_age.toString())

        }
        age_minus.setOnClickListener {
            count_age--
            age.setText(count_age.toString())

        }

    }
}
package com.example.threebuttonsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         tv = findViewById(R.id.tv)

        var et1 = findViewById<EditText>(R.id.et1)
        var btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener{ Toast.makeText(this, "${et1.text}", Toast.LENGTH_SHORT).show()}

        var et2 = findViewById<EditText>(R.id.et2)
        var btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener{tv.text = et2.text}

        var et3 = findViewById<EditText>(R.id.et3)
        var btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener{
            tv.text = et3.text
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
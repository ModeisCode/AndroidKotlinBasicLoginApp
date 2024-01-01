package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val label = findViewById<TextView>(R.id.textView2)
        val btn = findViewById<Button>(R.id.button)


        btn.setOnClickListener{
            var userName = findViewById<TextView>(R.id.editTextText).text.toString()
            if (userName.equals("admin")) {
                label.setText("successful")
            }

        }


    }





}
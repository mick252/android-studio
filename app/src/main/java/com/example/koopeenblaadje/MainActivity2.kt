package com.example.koopeenblaadje

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nummer = findViewById<EditText>(R.id.hoeveelheid)

        val num = nummer.text.toString()

        val knop = findViewById<Button>(R.id.button)
        knop.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("boomnummer", num)

            startActivity(intent)

        }
//
//        val editText = findViewById<EditText>(R.id.hoeveelheid)
//        val button = findViewById<Button>(R.id.button)
//
//        button.setOnClickListener {
//            val getal = editText.text.toString()
//
//            val intent = Intent(this, MainActivity3::class.java)
//            intent.putExtra("mijnGetal", getal)
//
//            startActivity(intent)
//        }

    }

}
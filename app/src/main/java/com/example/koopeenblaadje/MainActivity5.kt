package com.example.koopeenblaadje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import android.widget.TextView


class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nummer1 = intent.getStringExtra("blaadjenummer").toString()

        val tekst = findViewById<TextView>(R.id.textView7)

        tekst.text = "U koos voor blaadje $nummer1"

        val knop = findViewById<Button>(R.id.button6)
        knop.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}
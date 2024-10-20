package com.novalinaputri.uts_novalinaputri

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    private lateinit var btnmkn: Button
    private lateinit var sign: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        btnmkn = findViewById(R.id.btnmkn)
        sign = findViewById(R.id.sign)

        sign.setOnClickListener {
            val intent = Intent(this, PageLogin::class.java)
            startActivity(intent)}

        btnmkn.setOnClickListener {
            val intent = Intent(this, RecycleMakan::class.java)
            startActivity(intent)}


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
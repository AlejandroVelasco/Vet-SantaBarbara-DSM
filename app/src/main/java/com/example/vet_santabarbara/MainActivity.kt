package com.example.vet_santabarbara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listarDoctorBtn: Button = findViewById(R.id.btnDoctor)
        listarDoctorBtn.setOnClickListener {
            val intent = Intent(this, Listar_Doctor::class.java)
            startActivity(intent)
        }
    }
}
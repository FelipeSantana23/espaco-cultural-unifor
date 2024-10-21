package com.example.espacocultural

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.appcompat.app.AlertDialog

class MainActivity13 : AppCompatActivity() {

    private lateinit var backIcon: ImageView
    private lateinit var confIcon: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        backIcon = findViewById(R.id.back_icon)
        confIcon = findViewById(R.id.settings_icon)


        /// Configuração do ícone de voltar
        backIcon.setOnClickListener {
            // Volta para a tela MainActivity
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        /// config
        confIcon.setOnClickListener {
            // Vai para a tela config
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

    }
}
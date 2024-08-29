package com.example.tp1_arqmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val buttonNavigate = findViewById<Button>(R.id.button_registro)
        buttonNavigate.setOnClickListener {
            // Crear un Intent para navegar a la SecondActivity
            val intent = Intent(this, RegistroUsuarioActivity ::class.java)
            startActivity(intent) // Iniciar la nueva actividad
        }
    }

}




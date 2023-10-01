package com.example.registrousuarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PantallaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        val btnCrearUsuario = findViewById<Button>(R.id.btnCrear)
        val btnCancelar: Button = findViewById(R.id.btnCancelar)

        btnCrearUsuario.setOnClickListener{
            //Toast.makeText(applicationContext, "Hiciste click en el boton", Toast.LENGTH_LONG).show()
            val productScreen= Intent(this, Bienvenida::class.java)
            startActivity(productScreen)

        };

        btnCancelar.setOnClickListener{
            Toast.makeText(this,"El usuario esta intentando cancelar el registro", Toast.LENGTH_LONG).show();
        }

    }
}
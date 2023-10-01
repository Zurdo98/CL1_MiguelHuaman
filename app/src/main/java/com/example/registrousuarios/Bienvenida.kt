package com.example.registrousuarios

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val btnSalir: Button = findViewById(R.id.btnSalir)

        btnSalir.setOnClickListener{
            val titleMsg: String = "Confirmación"
            val bodyMsg: String="*** ¿Está seguro que desea abandonar la aplicación? ***"
            showModalConfirmExist(titleMsg,bodyMsg);
        }
    }
    private fun showModalConfirmExist(titleMsg: String, bodyMsg: String) {
        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.ventana_dialogo)
        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val titleModal: TextView = dialogConfirm.findViewById(R.id.modalTitulo)
        val bodyMsgModal: TextView = dialogConfirm.findViewById(R.id.modalMensaje)

        val btnSi:Button= dialogConfirm.findViewById(R.id.btnModalSi)
        val btnNo:Button= dialogConfirm.findViewById(R.id.btnModalNo)

        titleModal.text=titleMsg
        bodyMsgModal.text= bodyMsg

        btnSi.setOnClickListener{
            val pantallaPrincipal = Intent(this, PantallaPrincipal::class.java)
            startActivity(pantallaPrincipal)
        }

        btnNo.setOnClickListener{
            dialogConfirm.dismiss()
        }
        dialogConfirm.show();

    }
}
package com.example.uts201804007

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Isi_Inten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi__inten)

        val t_nim: TextView = findViewById(R.id.t_nim)
        val t_nama: TextView = findViewById(R.id.t_nama)
        val t_nomor: TextView = findViewById(R.id.t_hp)
        val t_email: TextView = findViewById(R.id.t_email)
        val t_hobi: TextView = findViewById(R.id.t_hobi)
        val btn_intentExpilcitBundle: Button = findViewById(R.id.btncall)


        t_nim.setText(intent.getStringExtra("nim"))
        t_nama.setText(intent.getStringExtra("nama"))
        t_nomor.setText(intent.getStringExtra("nomor"))
        t_email.setText(intent.getStringExtra("email"))
        t_hobi.setText(intent.getStringExtra("hobi"))

        btn_intentExpilcitBundle.setOnClickListener {
            val panggil_nomor = t_nomor.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }
    }
}
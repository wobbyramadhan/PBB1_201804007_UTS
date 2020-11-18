package com.example.uts201804007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val Bundle = intent.extras
        val a: TextView =findViewById(R.id.view)
        a.setText(Bundle?.getString("uname"))

        val btn_login: Button = findViewById(R.id.btn_web)
        btn_login.setOnClickListener{
            val intent = Intent (this, Web::class.java)
            startActivity(intent)
        }

        val btn_profil: Button = findViewById(R.id.btn_profil)
        btn_profil.setOnClickListener{
            val intent = Intent (this, Profil::class.java)
            startActivity(intent)
        }

        val btn_logininten: Button = findViewById(R.id.btn_logininten)
        btn_logininten.setOnClickListener{
            val intent = Intent (this, Inten2::class.java)
            startActivity(intent)
        }

        val btn_recylview: Button = findViewById(R.id.btn_recylview)
        btn_recylview.setOnClickListener{
            val intent = Intent (this, RycleviewCard::class.java)
            startActivity(intent)
        }


    }
}
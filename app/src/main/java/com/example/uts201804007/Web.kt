package com.example.uts201804007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_web.*

class Web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val Webku: WebView = findViewById(R.id. webku)
        webku.settings.javaScriptEnabled = true
        //  webjaket.loadUrl("file:///D:/Dosen/PakMuasa/webbaru/sepatu2.html")
        webku.loadUrl("file:///android_asset/webbaru/home.html")
    }
}
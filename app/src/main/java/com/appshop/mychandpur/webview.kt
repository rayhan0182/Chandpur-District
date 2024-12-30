package com.appshop.mychandpur

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appshop.mychandpur.databinding.ActivityWebviewBinding

class webview : AppCompatActivity() {

    lateinit var binding: ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebviewBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val url1 = intent.getStringExtra("paddress")

      binding.url.apply {

          binding.url.loadUrl("$url1")

          binding.url.settings.javaScriptEnabled

      }







    }
}
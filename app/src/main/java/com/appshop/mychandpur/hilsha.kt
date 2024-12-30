package com.appshop.mychandpur

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appshop.mychandpur.databinding.ActivityHilshaBinding

class hilsha : AppCompatActivity() {

     lateinit var binding: ActivityHilshaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHilshaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.website.setOnClickListener {


            val intent = Intent(this@hilsha,webview::class.java)

            intent.putExtra("paddress","https://bdilish.com/")

            startActivity(intent)


        }

        binding.website2.setOnClickListener {


            val intent = Intent(this@hilsha,webview::class.java)

            intent.putExtra("paddress","https://chandpurfish.weebly.com/")

            startActivity(intent)

        }

        binding.website3.setOnClickListener {

            val internt = Intent(this@hilsha,webview::class.java)

            internt.putExtra("paddress","https://onlinefishbazar.com/product-category/ilish/")

            startActivity(internt)

        }

        binding.website4.setOnClickListener {

            val intent = Intent(this@hilsha,webview::class.java)

            intent.putExtra("paddress","https://onlinefishbazar.com/")

            startActivity(intent)

        }






    }
}
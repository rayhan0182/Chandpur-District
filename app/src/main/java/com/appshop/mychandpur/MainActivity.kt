package com.appshop.mychandpur

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appshop.mychandpur.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.listOne.setOnClickListener {

       val intent = Intent(this@MainActivity,About_cp::class.java)

       startActivity(intent)

        }


       binding.listTwo.setOnClickListener {


           val intent = Intent(this@MainActivity,tour_place::class.java)

           startActivity(intent)

       }


        binding.listThree.setOnClickListener {


            val intent = Intent(this@MainActivity,hilsha::class.java)

            startActivity(intent)


        }



    }
}
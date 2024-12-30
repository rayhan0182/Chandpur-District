package com.appshop.mychandpur

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appshop.mychandpur.databinding.ActivityAboutCpBinding

class About_cp : AppCompatActivity() {

    lateinit var binding : ActivityAboutCpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutCpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tv2.text = vidatas.datas[0]

        binding.bbtn.setOnClickListener {


            val intent = Intent(this@About_cp,MainActivity::class.java)

            startActivity(intent)


        }


        binding.nbtn.setOnClickListener {


           binding.tv2.text = vidatas.datas[1]

           binding.bbtn.setOnClickListener {

               binding.tv2.text = vidatas.datas[0]

               binding.bbtn.setOnClickListener {


                   val intent = Intent(this@About_cp,MainActivity::class.java)

                   startActivity(intent)


               }


           }





            binding.nbtn.setOnClickListener {

                binding.tv2.text = vidatas.datas[2]

                binding.bbtn.setOnClickListener {

                    binding.tv2.text = vidatas.datas[1]

                    binding.bbtn.setOnClickListener {

                        binding.tv2.text = vidatas.datas[0]


                        binding.bbtn.setOnClickListener {


                            val intent = Intent(this@About_cp,MainActivity::class.java)

                            startActivity(intent)


                        }



                    }


                }

                binding.nbtn.setOnClickListener {


                    binding.tv2.text = vidatas.datas[3]

                    binding.bbtn.setOnClickListener {

                        binding.tv2.text = vidatas.datas[2]

                        binding.bbtn.setOnClickListener {

                            binding.tv2.text = vidatas.datas[1]

                            binding.bbtn.setOnClickListener {

                                binding.tv2.text = vidatas.datas[0]

                                binding.bbtn.setOnClickListener {

                                    val intent = Intent(this@About_cp,MainActivity::class.java)

                                    startActivity(intent)

                                }


                            }




                        }


                    }



                }


            }



        }


    }
}
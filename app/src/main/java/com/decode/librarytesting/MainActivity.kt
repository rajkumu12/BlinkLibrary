package com.decode.librarytesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.decode.librarytesting.databinding.ActivityMainBinding
import com.decode.mylibrary.BlinkEffect

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonView.setOnClickListener{
            BlinkEffect.blink(binding.buttonView)
        }




    }
}
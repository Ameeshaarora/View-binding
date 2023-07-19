package com.ameesha.fragmentregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ameesha.fragmentregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnValidate?.setOnClickListener {
            if (binding?.etName?.text?.toString().isNullOrEmpty()){
                binding?.etName?.error="Enter your name"
            }
            else if (binding?.etCollegeName?.text?.toString().isNullOrEmpty()){
                binding?.etCollegeName?.error="Enter your Address"
            }
            else
                Toast.makeText(this,"validate",Toast.LENGTH_SHORT).show()
        }
    }
}
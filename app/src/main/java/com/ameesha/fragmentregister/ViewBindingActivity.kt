package com.ameesha.fragmentregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ameesha.fragmentregister.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    var binding : ActivityViewBindingBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_binding)
    }
}
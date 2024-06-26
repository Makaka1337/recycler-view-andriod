package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = Adapter()

        binding.button.setOnClickListener{
            val text = binding.editTextText.text
            if(text.toString().isNotEmpty()){
                adapter.addValue(text.toString())
            }
        text.clear()
        }
    }
}
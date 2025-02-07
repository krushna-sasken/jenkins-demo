package com.joynext.sasken.myjenkinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joynext.sasken.myjenkinproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val counterTV = binding.counter

        binding.add.setOnClickListener {
            val currentVal = counterTV.text.toString().toInt()
            if (currentVal < 100) {
                counterTV.text = (currentVal + 1).toString()
            }
        }

        binding.subtract.setOnClickListener {
            val currentVal = counterTV.text.toString().toInt()
            if (currentVal > 0) {
                counterTV.text = (currentVal - 1).toString()
            }
        }
    }
}
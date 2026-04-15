package com.example.seaapps.pertemuan5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seaapps.databinding.ActivityScrollBinding

class ScrollActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
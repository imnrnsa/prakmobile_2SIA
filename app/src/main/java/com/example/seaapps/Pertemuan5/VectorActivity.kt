package com.example.seaapps.pertemuan5

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seaapps.databinding.ActivityVectorBinding

class VectorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVectorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // improvisasi: ubah warna icon
        binding.imageView.setColorFilter(Color.RED)
    }
}
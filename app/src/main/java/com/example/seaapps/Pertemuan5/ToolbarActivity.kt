package com.example.seaapps.pertemuan5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seaapps.databinding.ActivityToolbarBinding

class ToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "Toolbar"
    }
}
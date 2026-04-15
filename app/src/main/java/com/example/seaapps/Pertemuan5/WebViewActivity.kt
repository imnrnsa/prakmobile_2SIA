package com.example.seaapps.pertemuan5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seaapps.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.settings.javaScriptEnabled = true
        binding.webView.loadUrl("https://www.google.com")

        binding.btnReload.setOnClickListener {
            binding.webView.reload()
        }
    }
}
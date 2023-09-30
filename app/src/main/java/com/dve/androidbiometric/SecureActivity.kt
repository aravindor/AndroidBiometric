package com.dve.androidbiometric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dve.androidbiometric.databinding.ActivitySecureBinding

class SecureActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}
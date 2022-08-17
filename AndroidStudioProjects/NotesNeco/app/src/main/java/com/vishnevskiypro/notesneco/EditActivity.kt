package com.vishnevskiypro.notesneco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.vishnevskiypro.notesneco.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater).also { setContentView(it.root) }


        binding.fabAddPhoto.setOnClickListener {
            binding.constraintLayout.isVisible = true
            binding.fabAddPhoto.isVisible = false
        }

        binding.btnDeleteImage.setOnClickListener {
            binding.constraintLayout.isVisible = false
            binding.fabAddPhoto.isVisible = true
        }

    }
}
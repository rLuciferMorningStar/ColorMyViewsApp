package com.lessontwo.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lessontwo.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.constraintLayout
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
                R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)

                R.id.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}
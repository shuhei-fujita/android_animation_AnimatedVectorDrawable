package com.syuheifujita.android_animation_2

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var rocketAnimation: AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rocketImage = findViewById<ImageView>(R.id.iv_rocket).apply {
            setBackgroundResource(R.drawable.animatorvectordrawable)
            rocketAnimation = background as AnimatedVectorDrawable
        }

        rocketImage.setOnClickListener({ rocketAnimation.start() })
    }
}

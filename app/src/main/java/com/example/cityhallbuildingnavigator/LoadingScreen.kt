package com.example.cityhallbuildingnavigator

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar

class LoadingScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
        setContentView(R.layout.activity_loading_screen)


//        val currentProgress = 1000
//        val progress = findViewById<ProgressBar>(R.id.pb_loading)
//        progress.max = 1000
//
//        ObjectAnimator.ofInt(progress, "progress", currentProgress)
//            .setDuration(4500)
//            .start()


//        val imageView = findViewById<ImageView>(R.id.image_view)
//        val rotation = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f)
//        rotation.duration = 5000
//        val animatorSet = AnimatorSet()
//        animatorSet.playTogether(rotation)
//        animatorSet.start()


        android.os.Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}
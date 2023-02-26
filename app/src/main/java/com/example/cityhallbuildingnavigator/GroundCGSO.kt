package com.example.cityhallbuildingnavigator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class GroundCGSO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
        setContentView(R.layout.activity_ground_cgso)

        val officeDirection = findViewById<ImageButton>(R.id.btn_home)
        officeDirection.setOnClickListener {
            finish()
        }
    }
}
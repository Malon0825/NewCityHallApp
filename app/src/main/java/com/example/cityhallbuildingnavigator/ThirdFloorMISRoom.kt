package com.example.cityhallbuildingnavigator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ThirdFloorMISRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_floor_misroom)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()


        val officeDirection = findViewById<ImageButton>(R.id.btn_home)
        officeDirection.setOnClickListener {
            finish()
        }
    }
}
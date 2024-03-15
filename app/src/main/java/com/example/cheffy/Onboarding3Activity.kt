package com.example.cheffy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding3Activity : AppCompatActivity() {

    lateinit var btn_onb3start : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        btn_onb3start = findViewById(R.id.btn_onb3start)
        btn_onb3start.setOnClickListener {
            // Start OnboardingActivity2
            startActivity(Intent(this, ExploreActivity::class.java)) }
    }
}


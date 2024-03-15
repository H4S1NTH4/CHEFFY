
package com.example.cheffy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding1Activity : AppCompatActivity() {

    lateinit var btn_onb1next : Button
    lateinit var btn_onb1skip : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        btn_onb1next = findViewById(R.id.btn_onb1next)
        btn_onb1skip = findViewById(R.id.btn_onb1skip)

        btn_onb1next.setOnClickListener {
            // Start OnboardingActivity2
            startActivity(Intent(this, Onboarding2Activity::class.java)) }
        btn_onb1skip.setOnClickListener{
            //skip to the explore screen
            startActivity(Intent(this, ExploreActivity::class.java))}

    }
}


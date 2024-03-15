package com.example.cheffy
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding2Activity : AppCompatActivity() {

    lateinit var btn_onb2next : Button
    lateinit var btn_onb2skip : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        btn_onb2next = findViewById(R.id.btn_onb2next)
        btn_onb2skip = findViewById(R.id.btn_onb2skip)

        btn_onb2next.setOnClickListener {
            // Start OnboardingActivity2
            startActivity(Intent(this, Onboarding3Activity::class.java)) }

        btn_onb2skip.setOnClickListener{
            //skipping to explore screen
            startActivity(Intent(this, ExploreActivity::class.java)) }

    }
}


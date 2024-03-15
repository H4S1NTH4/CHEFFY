package com.example.cheffy

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val logoImageView: ImageView = findViewById(R.id.logo)
        // Call the animation
        FadeNspin.spinAnimate(logoImageView)

        //val logoTextView: ImageView = findViewById(R.id.logo)


        // Delay starting the OnboardingActivity1
        val animationDuration = 2000L // Animation duration in milliseconds
        Handler().postDelayed({
            // Navigate to OnboardingActivity1
            val intent = Intent(this, Onboarding1Activity::class.java)
            startActivity(intent)
            finish()
        }, animationDuration)
    }
}

object FadeNspin {
    fun spinAnimate(logoImageView: ImageView) {

        //fade in animation
        val fadeInAnimator = ObjectAnimator.ofFloat(logoImageView, "alpha", 0f, 1f)
        fadeInAnimator.duration = 1000

        //rotation animation
        val rotationAnimator = ObjectAnimator.ofFloat(logoImageView, "rotation", 0f, 360f)
        rotationAnimator.duration = 1000
        //Combine animations
        val animatorSet = AnimatorSet()
        animatorSet.playTogether(fadeInAnimator, rotationAnimator)

        animatorSet.start()
    }

   /* object SwipeUp {
        fun swipup(logoTextView: ImageView) {

            //fade in animation
            val fadeInAnimator = ObjectAnimator.ofFloat(logoImageView, "alpha", 0f, 1f)
            fadeInAnimator.duration = 1000

            //rotation animation
            val rotationAnimator = ObjectAnimator.ofFloat(logoImageView, "rotation", 0f, 360f)
            rotationAnimator.duration = 1000
            //Combine animations
            val animatorSet = AnimatorSet()
            animatorSet.playTogether(fadeInAnimator, rotationAnimator)

            animatorSet.start()
        } */
}


/* package com.example.cheffy

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Access the logoImageView after setContentView
        val logoImageView: ImageView = findViewById(R.id.logo)
        // Call the animation function from LogoAnimator
        FadeNspin.spinAnimate(logoImageView)

        val logoTextView: ImageView = findViewById(R.id.logo)

        // Delay starting the OnboardingActivity1 until after the animation finishes
        val animationDuration = 2000L // Animation duration in milliseconds
        Handler().postDelayed({
            // Navigate to OnboardingActivity1
            val intent = Intent(this, Onboarding1Activity::class.java)
            startActivity(intent)
            finish() // Finish the current activity to prevent going back
        }, animationDuration)
    }
}

object FadeNspin {
    fun spinAnimate(logoImageView: ImageView) {

        //fade in animation
        val fadeInAnimator = ObjectAnimator.ofFloat(logoImageView, "alpha", 0f, 1f)
        fadeInAnimator.duration = 1000

        //rotation animation
        val rotationAnimator = ObjectAnimator.ofFloat(logoImageView, "rotation", 0f, 360f)
        rotationAnimator.duration = 1000
        //Combine animations
        val animatorSet = AnimatorSet()
        animatorSet.playTogether(fadeInAnimator, rotationAnimator)

        animatorSet.start()
    }
}

*/
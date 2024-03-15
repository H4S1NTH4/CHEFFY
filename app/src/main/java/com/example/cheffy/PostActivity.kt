package com.example.cheffy

import BottomNavigationActivity
import android.os.Bundle

class PostActivity : BottomNavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_post)
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_post
    }
}

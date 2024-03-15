package com.example.cheffy

import BottomNavigationActivity
import android.os.Bundle

class ListingActivity : BottomNavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_listing)
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_listing
    }
}




package com.example.cheffy

import BottomNavigationActivity
import android.os.Bundle

class ProfileActivity : BottomNavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_profile
    }
    }

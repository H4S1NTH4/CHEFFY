package com.example.cheffy

import BottomNavigationActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class CommunityActivity : BottomNavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_community)


        val spinner1: Spinner = findViewById(R.id.com_spinner1)
        val items1 = resources.getStringArray(R.array.spinner1_items)
        val adapter1 = ArrayAdapter(this, R.layout.spinner_dropdown_item, items1)
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1.adapter = adapter1
        spinner1.setSelection(0)

        val spinner2: Spinner = findViewById(R.id.com_spinner2)
        val items2 = resources.getStringArray(R.array.spinner2_items)
        val adapter2 = ArrayAdapter(this, R.layout.spinner_dropdown_item, items2)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter = adapter2
        spinner2.setSelection(0)

        val spinner3: Spinner = findViewById(R.id.com_spinner3)
        val items3 = resources.getStringArray(R.array.spinner3_items)
        val adapter3 = ArrayAdapter(this, R.layout.spinner_dropdown_item, items3)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner3.adapter = adapter3
        spinner3.setSelection(0)

    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_community
    }
}

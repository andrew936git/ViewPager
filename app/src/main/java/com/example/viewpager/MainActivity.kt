package com.example.viewpager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var viewPagerVP: ViewPager2
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        adapter = ViewPagerAdapter(this, Picture.pictureList)
        viewPagerVP = findViewById(R.id.viewPagerVP)
        viewPagerVP.adapter = adapter
    }
}
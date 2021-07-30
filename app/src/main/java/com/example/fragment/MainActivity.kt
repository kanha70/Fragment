package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        val fragment1: Button = findViewById(R.id.btnFragment1)
        fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()

            }
            val fragment2: Button = findViewById(R.id.btnFragment2)
            fragment2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, secondFragment)
                    commit()
                }

            }
        }
    }
}
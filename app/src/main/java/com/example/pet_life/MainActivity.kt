package com.example.pet_life

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.annotation.SuppressLint //quick fix "Local variable name 'my_image' should not contain underscores"
import android.view.MotionEvent
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.util.Log

class MainActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility") //quick fix "Local variable name 'my_image' should not contain underscores"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val my_image = findViewById<FloatingActionButton>(R.id.fab)
        my_image.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, ev: MotionEvent): Boolean {
                // Perform tasks here

                //mScaleDetector.onTouchEvent(ev)
                Log.d("TACH", "message!!!!!!!!!!!!!!!!")


                return true
            }
        })

    }

}
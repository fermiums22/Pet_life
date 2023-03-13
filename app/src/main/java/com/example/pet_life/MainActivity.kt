package com.example.pet_life

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility") //quick fix "Local variable name 'my_image' should not contain underscores"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val my_image = findViewById<FloatingActionButton>(R.id.fab)
        my_image.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, ev: MotionEvent): Boolean {
                //Log.d("TACH", "TACH")
                when (ev.action){
                    MotionEvent.ACTION_DOWN or MotionEvent.ACTION_MOVE -> {
                        val screenX: Float = v.x + ev.getX()
                        val screenY: Float = v.y + ev.getY()
                        //Log.d("TACH", String.format(Locale.US, "screenX = %f", screenX))
                        my_image.translationX = screenX - my_image.width/2
                        my_image.translationY = screenY - my_image.height/2
                    }
                    MotionEvent.ACTION_UP -> {
                        ObjectAnimator.ofFloat(my_image, "translationX", (my_image.width).toFloat()).apply {
                            duration = 200
                            start()
                        }
                        ObjectAnimator.ofFloat(my_image, "translationY", (my_image.height).toFloat()).apply {
                            duration = 200
                            start()
                        }
                    }
                }
                return true
            }
        })

    }

}
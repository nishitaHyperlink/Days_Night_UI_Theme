package com.example.dayandnightthemeapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mahfa.dnswitch.DayNightSwitch
import com.mahfa.dnswitch.DayNightSwitchListener

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sun = findViewById<ImageView>(R.id.sun)
        val moon = findViewById<ImageView>(R.id.moon)
        val dayLand = findViewById<ImageView>(R.id.day_landscape)
        val nightLand = findViewById<ImageView>(R.id.night_landscape)
        val daySky = findViewById<View>(R.id.day_bg)
        val nightSky = findViewById<View>(R.id.night_bg)
        val dayNightSwitch = findViewById<DayNightSwitch>(R.id.day_night_switch)



       /* dayNightSwitch.setOnClickListener(object : DayNightSwitchListener {
            override fun onSwitch(is_night: Boolean) {
                TODO("Not yet implemented")
            }
        })

        */

        dayNightSwitch.setListener(object : DayNightSwitchListener {
            override fun onSwitch(is_night: Boolean) {
                if (is_night) {
                    sun.animate().translationY(600f).setDuration(1000)
                    moon.animate().translationY(500f).setDuration(1000)
                    dayLand.animate().alpha(0f).setDuration(1300)
                    daySky.animate().alpha(0f).setDuration(1300)
                }
                else
                {
                    sun.animate().translationY(-110f).setDuration(1000)
                    moon.animate().translationY(-100f).setDuration(1000)
                    dayLand.animate().alpha(1f).setDuration(1300)
                    daySky.animate().alpha(1f).setDuration(1300)
                }
                }
            })
    }
}










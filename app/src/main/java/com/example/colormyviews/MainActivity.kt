package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var box_one: TextView
    lateinit var box_two: TextView
    lateinit var box_three: TextView
    lateinit var box_four: TextView
    lateinit var box_five: TextView
    lateinit var btnRed: Button
    lateinit var btnYellow: Button
    lateinit var btnGreen: Button
    lateinit var constraint: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        box_one = findViewById(R.id.box_one)
        box_two = findViewById(R.id.box_two)
        box_three = findViewById(R.id.box_tree)
        box_four = findViewById(R.id.box_four)
        box_five = findViewById(R.id.box_five)
        btnRed = findViewById(R.id.button_red)
        btnYellow = findViewById(R.id.button_yellow)
        btnGreen = findViewById(R.id.button_green)
        constraint = findViewById(R.id.constraint_layout)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_one, box_two, box_three, box_four,
            box_five, constraint, btnRed, btnYellow, btnGreen)

        for (item in clickableViews) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View?) {
        when (view?.id) {
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            R.id.box_tree -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button_red -> box_three.setBackgroundResource(android.R.color.holo_red_light)
            R.id. button_yellow -> box_two.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.button_green -> box_five.setBackgroundResource(android.R.color.holo_green_light)
            else -> view?.setBackgroundColor(Color.LTGRAY)
        }
    }
}
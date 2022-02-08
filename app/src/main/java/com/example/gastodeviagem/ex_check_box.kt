package com.example.assetinventory

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ex_check_box.*
import kotlinx.android.synthetic.main.ex_check_box.view.*

@Suppress("DEPRECATION")
class ex_check_box : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex_check_box)

        checkBlack.setOnClickListener(this)
        checkWhite.setOnClickListener(this)
        checkBlue.setOnClickListener(this)
        checkGreen.setOnClickListener(this)
        checkPink.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val id = v.id
        //if (ValidationCheck) {
        if (id == R.id.checkBlack) {
            if (checkBlack.isChecked) {
                checkWhite.isChecked = false
                checkBlue.isChecked = false
                checkGreen.isChecked = false
                checkPink.isChecked = false
                car_icon.setColorFilter(resources.getColor(R.color.black))
            }
        }
        if (id == R.id.checkWhite) {
            if (checkWhite.isChecked) {
                checkBlack.isChecked = false
                checkBlue.isChecked = false
                checkGreen.isChecked = false
                checkPink.isChecked = false
                car_icon.setColorFilter(resources.getColor(R.color.white))
            }
        }
        if (id == R.id.checkBlue) {
            if (checkBlue.isChecked) {
                checkBlack.isChecked = false
                checkWhite.isChecked = false
                checkGreen.isChecked = false
                checkPink.isChecked = false
                car_icon.setColorFilter(resources.getColor(R.color.blue))
            }
        }
        if (id == R.id.checkGreen) {
            if (checkGreen.isChecked) {
                checkBlack.isChecked = false
                checkWhite.isChecked = false
                checkBlue.isChecked = false
                checkPink.isChecked = false
                car_icon.setColorFilter(resources.getColor(R.color.green))
            }
        }
        if (id == R.id.checkPink) {
            if (checkPink.isChecked) {
                checkBlack.isChecked = false
                checkWhite.isChecked = false
                checkBlue.isChecked = false
                checkGreen.isChecked = false
                car_icon.setColorFilter(resources.getColor(R.color.pink))
            }
        }
    }
}
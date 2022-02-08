package com.example.assetinventory

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(this)
        buttonExCheck.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonCalculate) {
            calculate()
        }
        if (id == R.id.buttonExCheck){
            val intent = Intent(
                this, ex_check_box::class.java)
                        startActivity (intent)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calculate() {

        if (validationOK()) {
            try {
                val distance = editDistance.text.toString().toFloat()
                val price = editPrice.text.toString().toFloat()
                val autonomy = editAutonomy.text.toString().toFloat()

                val totalValue = (distance * price) / autonomy
                textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"

            } catch (number: NumberFormatException) {
                Toast.makeText(this, getString(R.string.enter_valid_values), Toast.LENGTH_LONG)
                    .show()
            }
        } else {
            Toast.makeText(this, getString(R.string.Fill_in_all_fields), Toast.LENGTH_LONG).show()
        }
    }

    private fun validationOK(): Boolean = editDistance.text.toString() !== ""
            && editPrice.text.toString() !== ""
            && editAutonomy.text.toString() !== ""
            && editAutonomy.text.toString() !== "0"
}
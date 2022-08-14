package com.bugrahanuslu.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number1 = number_1.text.toString().toDoubleOrNull()
        var number1="123213213213"
    }


    fun plus(view: View) {
        var number1 = number_1.text.toString().toDoubleOrNull()
        var number2 = number_2.text.toString().toDoubleOrNull()
        if (number1==null||number2==null){

        }else{
            result.text = (number1!! + number2!!).toString()
        }


    }

    fun minus(view: View) {
        var number1 = number_1.text.toString().toDoubleOrNull()
        var number2 = number_2.text.toString().toDoubleOrNull()
        if (number1==null||number2==null){

        }
        else{
            result.text = (number1!! - number2!!).toString()
        }

    }

    fun divide(view: View) {
        var number1 = number_1.text.toString().toDoubleOrNull()
        var number2 = number_2.text.toString().toDoubleOrNull()
        if (number1==null||number2==null){

        }else{
            result.text = (number1!! / number2!!).toString()
        }

    }

    fun multiply(view: View) {
        var number1 = number_1.text.toString().toDoubleOrNull()
        var number2 = number_2.text.toString().toDoubleOrNull()
        if (number1==null||number2==null){

        }
        else{
            result.text = (number1!! * number2!!).toString()
        }

    }

    fun clear(view: View) {

        result.text = null
        number_1.text = null
        number_2.text = null

    }
}

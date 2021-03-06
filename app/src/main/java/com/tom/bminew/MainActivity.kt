package com.tom.bminew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.tom.bminew.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bHelp
        ed_weight
    }
    fun bmi(view: View){
        val weight=ed_weight.text.toString().toFloat()
        val height=ed_height.text.toString().toFloat()
        val bmi=weight / (height*height)
        Log.d("BMI",bmi.toString()) //Logcat是偵錯用的，d:debug、i:info、e:error
    }
}
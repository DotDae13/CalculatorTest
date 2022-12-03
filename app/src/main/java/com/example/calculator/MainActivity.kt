package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{ calculateResult() }
    }

    private fun calculateResult() {
        val firstNumber = binding.firstNumberInput.text.toString()
        val secondNumber = binding.secondNumberInput.text.toString()

        val result = when (binding.radioOptions.checkedRadioButtonId) {
            R.id.additionButton -> firstNumber.toDouble() + (secondNumber.toDouble())
            R.id.differenceButton -> firstNumber.toDouble() - secondNumber.toDouble()
            else -> firstNumber.toDouble() * secondNumber.toDouble()
        }
        binding.resultText.text = result.toString()

    }
}
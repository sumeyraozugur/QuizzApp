package com.sum.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast

import com.sum.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener {
            if(binding.input.text.toString().isEmpty()){
                Toast.makeText(this, "Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constant.USER_NAME,binding.input.text.toString())
                startActivity(intent)
                finish()

            }
        }





    }
}
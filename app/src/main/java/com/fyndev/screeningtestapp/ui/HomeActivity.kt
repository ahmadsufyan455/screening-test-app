package com.fyndev.screeningtestapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.utils.EXTRA_NAME

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        findViewById<Button>(R.id.btn_next).setOnClickListener {
            val edName = findViewById<EditText>(R.id.ed_input_name)
            if (edName.text.toString().isEmpty()) {
                edName.error = "Isi nama dulu"
                edName.requestFocus()
            } else {
                isPalindrome(edName.text.toString())
                val intent = Intent(this, ChooseActivity::class.java).apply {
                    putExtra(
                        EXTRA_NAME,
                        edName.text.toString()
                    )
                }
                startActivity(intent)
            }
        }
    }

    private fun isPalindrome(name: String) {
        if (name.reversed() == name) {
            Toast.makeText(this, "isPalindrome", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "not palindrome", Toast.LENGTH_LONG).show()
        }
    }
}
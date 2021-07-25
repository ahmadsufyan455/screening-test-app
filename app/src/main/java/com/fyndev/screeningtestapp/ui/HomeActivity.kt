package com.fyndev.screeningtestapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.utils.EXTRA_NAME
import com.google.android.material.textfield.TextInputEditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btn_next).setOnClickListener {
            val edName = findViewById<TextInputEditText>(R.id.ed_input_name)
            if (edName.text.toString().isEmpty()) {
                edName.error = "Isi nama dulu"
                edName.requestFocus()
            } else {
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
}
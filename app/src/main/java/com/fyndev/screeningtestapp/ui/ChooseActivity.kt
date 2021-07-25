package com.fyndev.screeningtestapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.ui.event.EventActivity
import com.fyndev.screeningtestapp.ui.guest.GuestActivity
import com.fyndev.screeningtestapp.utils.EVENT_NAME
import com.fyndev.screeningtestapp.utils.EXTRA_NAME
import com.fyndev.screeningtestapp.utils.GUEST_BIRTHDATE
import com.fyndev.screeningtestapp.utils.GUEST_NAME

class ChooseActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra(EXTRA_NAME)
        val eventName = intent.getStringExtra(EVENT_NAME)
        val guestName = intent.getStringExtra(GUEST_NAME)
        val birthDate = intent.getStringExtra(GUEST_BIRTHDATE)?.split("-")?.map { it.trim() }

        val btnEvent = findViewById<Button>(R.id.btn_event)
        val btnGuest = findViewById<Button>(R.id.btn_guest)
        findViewById<TextView>(R.id.tv_name).text = "Nama : $name"

        btnEvent.setOnClickListener {
            val intent = Intent(this, EventActivity::class.java).apply {
                putExtra(EXTRA_NAME, name)
            }
            startActivity(intent)
        }

        btnGuest.setOnClickListener {
            val intent = Intent(this, GuestActivity::class.java).apply {
                putExtra(EXTRA_NAME, name)
            }
            startActivity(intent)
        }

        if (eventName != null) {
            btnEvent.text = eventName
        }

        if (guestName != null) {
            btnGuest.text = guestName
        }

        if (birthDate != null) {
            if (birthDate[2].toInt() % 2 == 0 && birthDate[2].toInt() % 3 == 0) {
                Toast.makeText(this, "iOS", Toast.LENGTH_LONG).show()
            } else if (birthDate[2].toInt() % 3 == 0) {
                Toast.makeText(this, "android", Toast.LENGTH_LONG).show()
            } else if (birthDate[2].toInt() % 2 == 0) {
                Toast.makeText(this, "blackberry", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "feature phone", Toast.LENGTH_LONG).show()
            }
        }
    }
}
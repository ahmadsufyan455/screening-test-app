package com.fyndev.screeningtestapp.ui.guest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.utils.EXTRA_NAME
import kotlin.math.sqrt

class GuestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra(EXTRA_NAME) as String

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[GuestViewModel::class.java]
        val guestAdapter = GuestAdapter(name)
        guestAdapter.setData(viewModel.getGuests())

        findViewById<RecyclerView>(R.id.rv_guest).apply {
            layoutManager = GridLayoutManager(this@GuestActivity, 2)
            setHasFixedSize(true)
            adapter = guestAdapter
        }
    }
}
package com.fyndev.screeningtestapp.ui.event

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.utils.EXTRA_NAME

class EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra(EXTRA_NAME) as String

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[EventViewModel::class.java]
        val eventAdapter = EventAdapter(name)
        eventAdapter.setData(viewModel.getEvents())

        findViewById<RecyclerView>(R.id.rv_event).apply {
            layoutManager = LinearLayoutManager(this@EventActivity)
            setHasFixedSize(true)
            adapter = eventAdapter
        }
    }
}
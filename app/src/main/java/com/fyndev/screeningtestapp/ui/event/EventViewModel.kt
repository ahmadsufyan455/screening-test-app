package com.fyndev.screeningtestapp.ui.event

import androidx.lifecycle.ViewModel
import com.fyndev.screeningtestapp.model.Event
import com.fyndev.screeningtestapp.utils.DataDummy

class EventViewModel : ViewModel() {
    fun getEvents(): List<Event> = DataDummy.getEventDummy()
}
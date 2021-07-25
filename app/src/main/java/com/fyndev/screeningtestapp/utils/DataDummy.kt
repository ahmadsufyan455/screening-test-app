package com.fyndev.screeningtestapp.utils

import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.model.Event
import com.fyndev.screeningtestapp.model.Guest

object DataDummy {
    fun getEventDummy(): List<Event> {
        val events = ArrayList<Event>()

        events.add(Event(R.drawable.a, "Virtual Tour", "12 Mei 2021"))
        events.add(Event(R.drawable.b, "Color Run", "5 Juni 2021"))
        events.add(Event(R.drawable.c, "Fun Main", "30 Juni 2021"))
        events.add(Event(R.drawable.d, "Kampus Merdeka", "17 Agustus 2021"))
        return events
    }

    fun getGuestDummy(): List<Guest> {
        val guests = ArrayList<Guest>()

        guests.add(Guest(1, "Andi", "2014-01-01", R.drawable.g1))
        guests.add(Guest(2, "Budi", "2014-02-02", R.drawable.g2))
        guests.add(Guest(3, "Charlie", "2014-03-03", R.drawable.g3))
        guests.add(Guest(4, "Dede", "2014-06-06", R.drawable.g4))
        guests.add(Guest(5, "Joko", "2014-02-12", R.drawable.g5))
        return guests
    }
}
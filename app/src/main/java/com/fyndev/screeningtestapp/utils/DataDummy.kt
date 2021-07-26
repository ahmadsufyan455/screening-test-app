package com.fyndev.screeningtestapp.utils

import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.model.Event
import com.fyndev.screeningtestapp.model.Guest

object DataDummy {
    fun getEventDummy(): List<Event> {
        val events = ArrayList<Event>()

        events.add(
            Event(
                R.drawable.a,
                "Event-1",
                "12 Mei 2021",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean volutpat odio ut mattis efficitur. Vestibulum non mauris pellentesque, pellentesque dui ac, aliquet ligula. Cras ultrices orci in nisl tristique,",
                -8.6722944,
                115.212997
            )
        )
        events.add(
            Event(
                R.drawable.b,
                "Event-2",
                "5 Juni 2021",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean volutpat odio ut mattis efficitur. Vestibulum non mauris pellentesque, pellentesque dui ac, aliquet ligula. Cras ultrices orci in nisl tristique,",
                -8.673253,
                115.2152394
            )
        )
        events.add(
            Event(
                R.drawable.c,
                "Event-3",
                "30 Juni 2021",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean volutpat odio ut mattis efficitur. Vestibulum non mauris pellentesque, pellentesque dui ac, aliquet ligula. Cras ultrices orci in nisl tristique,",
                -8.6699905,
                115.2161818
            )
        )
        events.add(
            Event(
                R.drawable.d,
                "Event-4",
                "17 Agustus 2021",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean volutpat odio ut mattis efficitur. Vestibulum non mauris pellentesque, pellentesque dui ac, aliquet ligula. Cras ultrices orci in nisl tristique,",
                -8.6736252,
                115.2141693
            )
        )
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
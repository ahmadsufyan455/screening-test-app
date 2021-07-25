package com.fyndev.screeningtestapp.ui.guest

import androidx.lifecycle.ViewModel
import com.fyndev.screeningtestapp.model.Guest
import com.fyndev.screeningtestapp.utils.DataDummy

class GuestViewModel : ViewModel() {
    fun getGuests(): List<Guest> = DataDummy.getGuestDummy()
}
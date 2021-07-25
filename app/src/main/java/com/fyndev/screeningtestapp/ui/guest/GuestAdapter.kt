package com.fyndev.screeningtestapp.ui.guest

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.model.Guest
import com.fyndev.screeningtestapp.ui.ChooseActivity
import com.fyndev.screeningtestapp.utils.EXTRA_NAME
import com.fyndev.screeningtestapp.utils.GUEST_BIRTHDATE
import com.fyndev.screeningtestapp.utils.GUEST_NAME

class GuestAdapter(private val name: String) : RecyclerView.Adapter<GuestAdapter.ViewHolder>() {

    private val listGuest = ArrayList<Guest>()

    fun setData(guests: List<Guest>) {
        listGuest.clear()
        listGuest.addAll(guests)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_guest, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GuestAdapter.ViewHolder, position: Int) {
        holder.bind(listGuest[position], name)
    }

    override fun getItemCount(): Int = listGuest.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvName = view.findViewById<TextView>(R.id.tv_guest_name)
        private val imgGuest = view.findViewById<ImageView>(R.id.img_guest)

        fun bind(guest: Guest, name: String) {
            tvName.text = guest.name
            imgGuest.setImageResource(guest.image)
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, ChooseActivity::class.java).apply {
                    putExtra(GUEST_NAME, guest.name)
                    putExtra(GUEST_BIRTHDATE, guest.birthdate)
                    putExtra(EXTRA_NAME, name)
                }
                itemView.context.startActivity(intent)
            }
        }
    }
}
package com.fyndev.screeningtestapp.ui.event

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fyndev.screeningtestapp.R
import com.fyndev.screeningtestapp.model.Event
import com.fyndev.screeningtestapp.ui.ChooseActivity
import com.fyndev.screeningtestapp.utils.EVENT_NAME
import com.fyndev.screeningtestapp.utils.EXTRA_NAME

class EventAdapter(private val name: String) : RecyclerView.Adapter<EventAdapter.ViewHolder>() {

    private val listEvent = ArrayList<Event>()

    fun setData(events: List<Event>) {
        listEvent.clear()
        listEvent.addAll(events)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listEvent[position], name)
    }

    override fun getItemCount(): Int = listEvent.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imgEvent = view.findViewById<ImageView>(R.id.img_event)
        private val eventName = view.findViewById<TextView>(R.id.tv_event_name)
        private val eventDate = view.findViewById<TextView>(R.id.tv_event_date)
        private val eventDesc = view.findViewById<TextView>(R.id.tv_desc)

        fun bind(event: Event, name: String) {
            imgEvent.setImageResource(event.image)
            eventName.text = event.name
            eventDate.text = event.date
            eventDesc.text = event.desc
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, ChooseActivity::class.java).apply {
                    putExtra(EVENT_NAME, event.name)
                    putExtra(EXTRA_NAME, name)
                }
                itemView.context.startActivity(intent)
            }
        }
    }
}
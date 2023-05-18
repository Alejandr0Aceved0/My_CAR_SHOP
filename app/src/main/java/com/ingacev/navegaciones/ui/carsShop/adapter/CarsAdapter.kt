package com.ingacev.navegaciones.ui.carsShop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ingacev.navegaciones.R
import com.ingacev.navegaciones.model.Vehicle

class CarsAdapter(private val cars: List<Vehicle>) : RecyclerView.Adapter<CarsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cars_shop, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cars[position])
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val brandTextView: TextView = itemView.findViewById(R.id.brandCarTv)
        private val modelTextView: TextView = itemView.findViewById(R.id.modelCarTv)
        private val stateTextView: TextView = itemView.findViewById(R.id.statusCarTv)
        private val imageView: ImageView = itemView.findViewById(R.id.photoCarImgv)

        fun bind(vehicle: Vehicle) {
            // Set values for each view in the layout for each item
            brandTextView.text = vehicle.brand
            modelTextView.text = vehicle.model.toString()
            stateTextView.text = vehicle.state
            Glide.with(itemView.context)
                .load(vehicle.image)
                .into(imageView)
        }
    }
}

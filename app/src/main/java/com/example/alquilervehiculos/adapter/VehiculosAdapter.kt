package com.example.alquilervehiculos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquilervehiculos.R
import com.example.alquilervehiculos.Vehiculos
import com.example.alquilervehiculos.VehiculosProvider.Companion.vehiculosList

class VehiculosAdapter(vehiculosList: List<Vehiculos>) : RecyclerView.Adapter<VehiculosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiculosViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return VehiculosViewHolder(layoutInflater.inflate(R.layout.item_vehiculo,parent,false))
    }

    override fun getItemCount(): Int {
        return vehiculosList.size
    }

    override fun onBindViewHolder(holder: VehiculosViewHolder, position: Int) {
        val item = vehiculosList[position]
        holder.render(item)
    }

}
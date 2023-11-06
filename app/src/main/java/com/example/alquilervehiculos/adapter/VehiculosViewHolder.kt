package com.example.alquilervehiculos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquilervehiculos.Vehiculos
import com.example.alquilervehiculos.databinding.ItemVehiculoBinding

class VehiculosViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemVehiculoBinding.bind(view)
    fun render(vehiculoModel: Vehiculos) {
        // Relacionamos el id de los layouts que hemos creado en item_vehiculos y los asociamos con los elementos del recyclerview
        binding.NombreVehiculo.text = vehiculoModel.nombre
        binding.PlazasVehiculo.text = vehiculoModel.plazas
        binding.CapacidadVehiculo.text = vehiculoModel.capacidad

        // El Glide nos muestra la imagen de nuestro vehiculo por medio de la URL que le hemos puesto
        Glide.with(binding.ImagenVehiculo.context).load(vehiculoModel.photo).into(binding.ImagenVehiculo)
    }
}
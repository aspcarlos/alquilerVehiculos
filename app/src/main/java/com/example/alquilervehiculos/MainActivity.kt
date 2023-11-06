package com.example.alquilervehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquilervehiculos.adapter.VehiculosAdapter
import com.example.alquilervehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter=VehiculosAdapter(VehiculosProvider.vehiculosList)

        // BOTON OCULTAR EL RECYCLERVIEW DE VEHICULOS
        binding.btMostrarVehiculos.setOnClickListener{
            // Para hacer el RecyclerView invisible
            binding.recycler.setVisibility(View.INVISIBLE);

            // Para hacer el RecyclerView visible
            binding.recycler.setVisibility(View.VISIBLE);
        }

        // BOTON GUARDAR VEHICULOS
        var DialogoV = DialogoVehiculos()

        binding.btGuardarVehiculos.setOnClickListener{
            DialogoV.show(supportFragmentManager, "Dialogo")
        }
    }
}
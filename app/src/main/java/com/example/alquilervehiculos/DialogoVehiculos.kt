package com.example.alquilervehiculos

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class DialogoVehiculos: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmacion"
            val content = "¿Desea guardar los datos?"
            val builder: AlertDialog.Builder= AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->
                    //Callback para el ok
                    Toast.makeText(requireActivity().applicationContext,
                        "Datos Guardados", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    //Callback para el Cancel
                    Toast.makeText(requireActivity().applicationContext,
                        "Accion cancelada", Toast.LENGTH_SHORT).show()
                }

            return builder.create()}
    }
}
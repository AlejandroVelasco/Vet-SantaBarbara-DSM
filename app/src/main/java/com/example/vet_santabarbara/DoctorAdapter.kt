package com.example.vet_santabarbara

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.vet_santabarbara.models.Doctor

class DoctorAdapter(private val doctores: List<Doctor>, val onItemClickListener: (Doctor) -> Unit) : RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder>() {

    class DoctorViewHolder(val view: View, val onItemClickListener: (Doctor) -> Unit) : RecyclerView.ViewHolder(view) {
        // Referencias a los elementos de la UI del CardView, por ejemplo:
        private val doctorNameTextView: TextView = view.findViewById(R.id.doctorNameTextView)
        private val doctorSpecialtyTextView: TextView = view.findViewById(R.id.doctorSpecialtyTextView)

        // Método para asociar datos del objeto Doctor con elementos de la UI
        fun bind(doctor: Doctor) {
            doctorNameTextView.text = doctor.nombre_completo
            doctorSpecialtyTextView.text = doctor.especialidad
            itemView.setOnClickListener {
                // Llama al listener cuando se hace clic en el CardView
                onItemClickListener.invoke(doctor)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_doctor, parent, false)
        return DoctorViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        holder.bind(doctores[position])
    }

    override fun getItemCount() = doctores.size
}

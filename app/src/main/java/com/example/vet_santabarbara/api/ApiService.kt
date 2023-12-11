package com.example.vet_santabarbara.api

import com.example.vet_santabarbara.models.Doctor
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("doctores")
    fun getDoctores(): Call<List<Doctor>>

    @GET("doctores/{doctorId}")
    fun getDoctorDetails(@Path("doctorId") doctorId: Int): Call<Doctor>

    @POST("doctores/modificar/{id}")
    fun modificarDoctor(@Path("id") doctorId: Int, @Body doctor: Doctor): Call<Doctor>
    @POST("doctores/nuevo")
    fun crearDoctor(@Body doctor: Doctor): Call<Doctor>
}
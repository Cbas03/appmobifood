package com.sebasconstantin.mobifood.signin.data.network.response

import com.google.gson.annotations.SerializedName

data class SignInResponse (@SerializedName("name") val name: String,
                           @SerializedName("surname") val surname: String,
                           @SerializedName("genre") val genre: String,
                           @SerializedName("birthdate") val birthdate: String,
                           @SerializedName("phone") val phoneNumber: String,
                           @SerializedName("email") val email: String,
                           @SerializedName("password") val password: String)

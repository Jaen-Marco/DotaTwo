package com.project.dotatwo.model

import com.google.gson.annotations.SerializedName

data class TeamListResponse(
        val name: String,
        val wins: Int,
        val losses: Int,
        @SerializedName("logo_url") val logo: String
)

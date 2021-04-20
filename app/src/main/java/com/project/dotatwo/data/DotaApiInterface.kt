package com.project.dotatwo.data

import com.project.dotatwo.model.TeamListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DotaApiInterface {
    @GET("teams/{team_id}")
    fun getTeamItem(@Path("team_id")id:Int) :Call<TeamListResponse>

    @GET("teams")
    fun getListTeam() :Call<TeamListResponse>
}
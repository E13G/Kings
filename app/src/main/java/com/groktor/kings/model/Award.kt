package com.groktor.kings.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "awards")
data class Award(
        @PrimaryKey
        @field:SerializedName("id") val id: Long,
        @field:SerializedName("name") val name: String,
        @field:SerializedName("picture") val picture: String)
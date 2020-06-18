package com.nico.taskapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_entity")
data class Task(
    @PrimaryKey(autoGenerate = true)
     var id : Int ,
     var name: String,
     var content: String,
     var creationDate: String,
     var isCompleted: Boolean)
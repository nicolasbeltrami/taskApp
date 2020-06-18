package com.nico.taskapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_entity")
data class Task(
 @PrimaryKey(autoGenerate = true)
     var id : Int,
 @ColumnInfo(name="name") var name: String,
 @ColumnInfo(name="content")var content: String,
 @ColumnInfo(name="creationDate") var creationDate: String,
 @ColumnInfo(name="isComplete")var isCompleted: Boolean)
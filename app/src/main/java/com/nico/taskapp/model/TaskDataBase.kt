package com.nico.taskapp.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities=[Task :: class], version = 1)
abstract class TaskDataBase : RoomDatabase() {
    abstract fun TaskDao():TaskDao
}
package com.nico.taskapp.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities=[Task :: class], version = 1)
abstract class TaskDataBase : RoomDatabase() {
    abstract fun TaskDao():TaskDao

    companion object{
        @Volatile
        private var INSTACE:TaskDataBase? = null

        fun getInstance(context: Context):TaskDataBase{
            synchronized(this){
                var instance = INSTACE
                if (instance == null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        TaskDataBase::class.java,
                        "task_database"
                    ).fallbackToDestructiveMigration()
                        .build()
                    INSTACE = instance
                }
                return instance
            }
        }

    }
}
package com.nico.taskapp.model

import androidx.room.*

@Dao
interface TaskDao {
    @Query("SELECT * FROM task_entity")
    fun getAllTask(): MutableList<Task>

    @Insert
    fun addTask(taskEntity : Task):Long

    @Query("SELECT * FROM task_entity where id like :id")
    fun getTaskById(id: Long): Task

    @Update
    fun updateTask(taskEntity: Task):Int

    @Delete
    fun deleteTask(taskEntity: Task):Int
}
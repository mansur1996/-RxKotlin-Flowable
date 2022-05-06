package com.example.rxkotlin.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.rxkotlin.entity.User
import io.reactivex.Flowable

@Dao
interface UserDao {

    @Insert
    fun addUser(user: User)

    @Query("select * from user_table")
    fun getAllUsers() : Flowable<List<User>>
}
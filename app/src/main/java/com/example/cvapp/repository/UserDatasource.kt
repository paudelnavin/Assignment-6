package com.example.cvapp.repository

import com.example.cvapp.domains.User

interface UserDatasource {
    fun save(user: User) : String?
    fun find(id:String) : User?
    fun edit(user: User) : String
    fun editBio(userId: String, text : String)
    fun delete(user: User) : String
    fun findAll() : List<User>
    fun addAchievement(s: String, toString: String)
}
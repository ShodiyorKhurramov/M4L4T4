package com.example.m4l4t4

import java.io.Serializable

class User(val name: String, val surname: String, val middleName: String): Serializable {

    override fun toString(): String {
        return "$name $surname $middleName"
    }

}
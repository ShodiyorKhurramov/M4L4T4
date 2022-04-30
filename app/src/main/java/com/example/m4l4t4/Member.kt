package com.example.m4l4t4



import java.io.Serializable

class Member(private val isMember: Boolean): Serializable {
    override fun toString(): String {
        return isMember.toString()
    }
}
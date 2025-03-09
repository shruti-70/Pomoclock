package com.example.productivity

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
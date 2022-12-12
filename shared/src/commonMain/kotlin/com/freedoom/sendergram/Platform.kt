package com.freedoom.sendergram

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
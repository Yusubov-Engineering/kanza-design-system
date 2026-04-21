package com.thisisyusub.kanzadesignsystem

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
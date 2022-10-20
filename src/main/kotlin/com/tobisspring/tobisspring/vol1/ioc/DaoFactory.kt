package com.tobisspring.tobisspring.vol1.ioc

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

class UserDao(
    private val connectionMarker: ConnectionMarker
) {

    fun add() {
        val con = connectionMarker.makeConnection()
    }

    fun get(id: String) {
        val con = connectionMarker.makeConnection()
    }
}

@Configuration
class DaoFactory {

    @Bean
    fun userDao(): UserDao {
        return UserDao(connectionMaker())
    }

    @Bean
    fun connectionMaker(): ConnectionMarker {
        return DConnectionMaker()
    }
}
package com.tobisspring.tobisspring.vol1.ioc

import java.sql.Connection

interface ConnectionMarker {
    fun makeConnection(): Connection
}

class DConnectionMaker : ConnectionMarker {
    override fun makeConnection(): Connection {
        TODO("Not yet implemented")
    }
}

class NConnectionMaker : ConnectionMarker {
    override fun makeConnection(): Connection {
        TODO("Not yet implemented")
    }
}
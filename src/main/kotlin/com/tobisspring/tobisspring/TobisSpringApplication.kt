package com.tobisspring.tobisspring

import com.tobisspring.tobisspring.vol1.ioc.DaoFactory
import com.tobisspring.tobisspring.vol1.ioc.UserDao
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
class TobisSpringApplication

fun main(args: Array<String>) {
    runApplication<TobisSpringApplication>(*args)
    val context = AnnotationConfigApplicationContext(DaoFactory::class.java)
    val userDao = context.getBean("userDao", UserDao::class.java)
    println("break")
}

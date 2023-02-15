package com.taskapp.taskapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskAppApplication

fun main(args: Array<String>) {
    runApplication<TaskAppApplication>(*args)
}

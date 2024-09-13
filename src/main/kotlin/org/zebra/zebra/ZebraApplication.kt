package org.zebra.zebra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZebraApplication

fun main(args: Array<String>) {
    runApplication<ZebraApplication>(*args)
}

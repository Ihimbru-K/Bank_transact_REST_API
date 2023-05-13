package com.kboyspringboot.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KboyApplication

fun main(args: Array<String>) {
	runApplication<KboyApplication>(*args)
}

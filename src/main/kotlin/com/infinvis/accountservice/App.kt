package com.infinvis.accountservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class InfinvisAccountServiceApplication

fun main(args: Array<String>) {
	runApplication<InfinvisAccountServiceApplication>(*args)
}

package org.tryout.practice

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<PracticeApplication>().with(TestcontainersConfiguration::class).run(*args)
}

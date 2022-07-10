package org.example.kmp.reproducer.app

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.kmp.reproducer.lib.Model

fun main() {
    val model = Model("id")
    val serialized = Json.encodeToString(model)
    println(serialized)
}

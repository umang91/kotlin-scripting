#!/usr/bin/env kotlin

/**
 * This script demonstrates including library dependency.
 * The script reads contents on the file using okio library and converts the JSON content to a data class using Gson.
 */

// Link(s) to the repository
@file:Repository("https://repo.maven.apache.org/maven2/")
// Library Dependencies
@file:DependsOn(
    "com.squareup.okio:okio:3.6.0",
    "com.google.code.gson:gson:2.10.1"
)

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.buffer
import java.lang.StringBuilder

data class Item(val key1: String, val key2: String)
class Items(val items: Array<Items>)

/**
 * Read the contents of a file and returns the contents as a string.
 */
fun readFile(fileName: String): String {
    val fileContent = StringBuilder()
    FileSystem.SYSTEM.source(fileName.toPath()).use { fileSource ->
        fileSource.buffer().use { bufferedFileSource ->
            while (true) {
                val line = bufferedFileSource.readUtf8Line() ?: break
                fileContent.append(line)
            }
        }
    }
    return fileContent.toString()
}

val fileData = readFile("sample.json")
val typeToken = object : TypeToken<List<Item>>() {}.type
val items = Gson().fromJson<List<Item>>(fileData, typeToken)
println(items)
#!/usr/bin/env kotlin

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

/**
 * This is a common utility script that can be imported by other scripts.
 */

/**
 * Executes the given command on bash shell and prints the output on the standard output i.e. terminal
 * @param command command to be executed on the bash shell.
 */
fun executeCommandOnShell(command: String) {
    val process = ProcessBuilder("/bin/bash", "-c", command).inheritIO().start()
    process.waitFor()
}

/**
 * Executes the given command on bash shell and returns the output as a string.
 * @param command command to be executed on the shell
 * @return [String] output/result of the command execution in string format.
 */
fun executeCommandOnShell(command: String): String {
    val process = ProcessBuilder("/bin/bash", "-c", command).start()
    val reader = BufferedReader(InputStreamReader(process.inputStream))
    var line: String? = ""
    val builder = StringBuilder()
    while (reader.readLine().also { line = it } != null) {
        builder.append(line).append(System.getProperty("line.separator"))
    }
    return builder.toString()
}
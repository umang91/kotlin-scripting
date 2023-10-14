#!/usr/bin/env kotlin

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

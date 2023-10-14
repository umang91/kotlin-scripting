#!/usr/bin/env kotlin

/**
 * This scripts demonstrates how to access command line arguments passed while running a kotlin script.
 * If arguments are not passed the snippet prints no arguments found else prints out all the arguments.
 */

if (args.isEmpty()) {
    println("No command line arguments passed")
} else {
    println("Arguments passed: ")
    for (arg in args) {
        println(arg)
    }
}
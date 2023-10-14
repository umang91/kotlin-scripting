#!/usr/bin/env kotlin

/**
 * Path to the file(s) to be imported.
 * You can import multiple files like
 * @file:Import("<file1>", "<file2>", "<file3>")
 */
@file:Import("common-utils.main.kts")

// The method is defined in the file that was imported.
executeCommandOnShell("ls")
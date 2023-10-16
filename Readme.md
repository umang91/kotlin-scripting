## Kotlin Scripting

This repository contains sample scripts demonstrating the features of Kotlin Scripting.

## Basics

In Kotlin 1.3.70 introduced the ability to run Kotlin scripts from the command line. Just name the file `<*>.main.kts` i.e. suffix the file with `.main.kts` and simply run the file as shown below

```shell
kotlin my-file.main.kts
```

A simple script would look like below

```kotlin
#!/usr/bin/env kotlin 

println("Hello World, from kotlin script")
```

Refer to the [Medium Article](https://medium.com/@umang91/scripting-in-kotlin-eaf01750bbee) for more understanding on Kotlin Scripting.

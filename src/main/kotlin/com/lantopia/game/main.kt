package com.lantopia.game

import org.lwjgl.Sys


/**
 * @author Mark McKenna &lt;mark.denis.mckenna@gmail.com&gt;
 * @version 0.1
 * @since 14/06/2015
 */

fun main(args: Array<String>) {
    println(System.getProperty("java.library.path"))
    Sys.alert("Alert", "Hello, world")
}

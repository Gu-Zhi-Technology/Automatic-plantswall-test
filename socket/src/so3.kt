package com.example.myapplication

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.lang.Exception
import java.net.Socket
import kotlin.system.exitProcess
class socket {
    fun main(args: Array<String>) {
        val host = "127.0.0.1"
        val port = 8000
        try {

            Thread {
                ClientSocket(host, port).update()
            }.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    class ClientSocket(host: String, port: Int) : Socket(host, port) {
        var reader = BufferedReader(InputStreamReader(inputStream))
        var writer = PrintWriter(outputStream, true)

        fun update() {
            ReadHandler(reader).build()
            while (true) {

                val msg = readLine()
                if (msg == "exit") exitProcess(0)

                writer.println(msg)
            }
        }


        class ReadHandler(var reader: BufferedReader) : Thread() {
            fun build(): ReadHandler {
                start()
                return this
            }

            override fun run() {
                while (true) {

                    val line = reader.readLine()
                    if (line!=null)
                        println(line)



                }
            }
        }
    }

}
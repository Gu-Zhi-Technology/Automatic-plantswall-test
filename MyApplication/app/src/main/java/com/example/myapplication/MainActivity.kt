package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.net.Socket
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val host = "200.1.1.79"
    val port = 2339
    var sum = ""

    fun  show(sum:String){
        val textView: TextView =  findViewById(R.id.textView)
        textView.text = sum.toString()

    }

    fun press(view: View) {
        show("111")
        Thread(Runnable {
            //Thread.sleep(1000)
            //while (true) {
                //show("222")
                sum = ClientSo(host, port).run().toString()

            //}
        }).start()
        show(sum)



    }
    //fun sds(view: View) {
        //show(sum)
    //}
}
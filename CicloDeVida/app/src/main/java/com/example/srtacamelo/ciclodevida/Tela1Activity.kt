package com.example.srtacamelo.ciclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btact2.setOnClickListener{
            //Toast.makeText(this,"Tela 2",Toast.LENGTH_LONG).show()
            val i = Intent(this, Tela2Activity::class.java)
            startActivity(i)


        }
    }

    public override fun onPause() {
        super.onPause()
        Log.e("Tela1", "::onPause() sendo chamado")
    }

    public override fun onStop() {
        super.onStop()
        Log.e("Tela","::onStop() sendo chamado")
    }

    public override fun onStart() {
        super.onStart()
        Log.e("Tela","::onStart() sendo chamado")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.e("Tela","::onDestroy() sendo chamado")
    }


}

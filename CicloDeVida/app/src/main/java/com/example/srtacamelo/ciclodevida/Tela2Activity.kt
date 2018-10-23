package com.example.srtacamelo.ciclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log


class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val it = intent

    }

    public override fun onStart() {
        super.onStart()
        Log.e("Tela","::onStart() sendo chamado")

    }

    public override fun onResume() {
        super.onResume()
        Log.e("Tela","::onResume() sendo chamado")

    }

    public override fun onPause() {
        super.onPause()
        Log.e("Tela1", "::onPause() sendo chamado")

    }

    public override fun onStop() {
        super.onStop()
        Log.e("Tela","::onStop() sendo chamado")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.e("Tela","::onDestroy() sendo chamado")
    }
}

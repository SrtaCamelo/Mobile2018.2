package com.example.srtacamelo.eventinternalization

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_calcular.setOnClickListener{
        calcular()
            showResult()
        //Toast.makeText(this,"TESTE",Toast.LENGTH_SHORT).show()
            // Toast.makeText(this,gas_text.text.toString(),Toast.LENGTH_LONG).show()

        }




    }
    fun calcular(){
        var gas = gas_text.text.toString().toDouble()
        var alc = alc_text.text.toString().toDouble()

        if((gas* 0.7) < alc){
            result = R.string.best_gas
            //Toast.makeText(this,best_gas.text.toString(),Toast.LENGTH_SHORT).show()
        }
        else if(alc < (gas* 0.7)){
            result = R.string.best_alc
        }
        else{
            result = R.string.no_best
        }
    }
    fun showResult(){
        if(this.result == R.string.best_gas){
            tvResult.text = getString(R.string.best_gas)
        }
        else if(this.result == R.string.best_alc){
            tvResult.text = getString(R.string.best_alc)
        }
        else{
            tvResult.text = getString(R.string.no_best)
        }
    }
}

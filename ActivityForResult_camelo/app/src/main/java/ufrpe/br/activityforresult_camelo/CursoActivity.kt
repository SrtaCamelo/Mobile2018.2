package ufrpe.br.activityforresult_camelo

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_curso.*
import android.widget.Toast
import android.widget.RadioGroup
import android.widget.RadioButton
import android.content.Intent


class CursoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var radioGroup: RadioGroup
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curso)

        radioGroup = findViewById(R.id.radioGroup)

        //Se o botão selecionar for clicado
        selectBt.setOnClickListener{
            val intent = Intent()
        //Se não existe uma opção selecionada
            var id: Int = radioGroup.checkedRadioButtonId
            if(id == -1){
                Toast.makeText(applicationContext,"Você Precisa Selecionar uma opção!",
                        Toast.LENGTH_SHORT).show()
            }
            //Se existe uma opção selecionada
            else{
                val selected: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
                val cursoSelected = selected.text.toString()
                Toast.makeText(this,cursoSelected,Toast.LENGTH_LONG).show()
                intent.putExtra("course",cursoSelected)
                setResult(1, intent)
                finish()

            }

        }
    }
}

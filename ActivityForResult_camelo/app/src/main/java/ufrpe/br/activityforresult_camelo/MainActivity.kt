package ufrpe.br.activityforresult_camelo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.content.Intent
import android.R.attr.button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val PICK_COURSE_REQUEST = 5
    val RESULT_OK = 1
    val RASULT_BAD = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cursoBt.setOnClickListener{
            val pickCurso = Intent(this, CursoActivity::class.java)
            intent.putExtra("course", cursoBt.text.toString())
            startActivityForResult(pickCurso, PICK_COURSE_REQUEST)


        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK){
            //Toast.makeText(this,"RESULT OK", Toast.LENGTH_LONG).show()
            if(requestCode == PICK_COURSE_REQUEST){
                val curso = data?.extras?.getString("course")
                cursoBt.setText(curso)
            }

        }

    }
}

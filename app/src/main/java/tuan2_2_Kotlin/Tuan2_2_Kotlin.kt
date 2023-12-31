package tuan2_2_Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.projecta.R

class Tuan2_2_Kotlin : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_kotlin)
        txt1= findViewById(R.id.tuan22txt1)
        txt2= findViewById(R.id.tuan22txt2)
        btn1= findViewById(R.id.tuan22btn)
        btn1!!.setOnClickListener(View.OnClickListener {
            var i= Intent(this@Tuan2_2_Kotlin,
                Tuan2_2_Kotlin_Second::class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
        })
    }
}
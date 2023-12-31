package tuan2_2_Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.projecta.R

class Tuan2_2_Listview : AppCompatActivity() {
    var lv:ListView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_listview)
        lv = findViewById(R.id.tuan22lv)
        //ng du lieu
        val arr= arrayOf("item1", "item2", "item3", "so4", "so 5", "so 6", "item7", "7")
        //adapter
        val ad= ArrayAdapter(this,
            android.R.layout.simple_list_item_1,arr)
        //hien thi lv
        lv!!.adapter= ad
    }
}
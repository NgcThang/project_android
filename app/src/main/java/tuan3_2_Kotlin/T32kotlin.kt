package tuan3_2_Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.projecta.R

class T32kotlin : AppCompatActivity() {
    var adap:Tuan32AdapterKotlin? = null
    var ls: ArrayList<Tuan32ContactKotlin> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t32kotlin)
        var lv=findViewById<ListView>(R.id.tuan32lvKotlin)//anh xa
        //tao nguon du lieu
        ls.add(Tuan32ContactKotlin("Nguyen Van A","17", R.drawable.android))
        ls.add(Tuan32ContactKotlin("Tran Thi B","18", R.drawable.apple))
        ls.add(Tuan32ContactKotlin("Pham Van C","17", R.drawable.facebook))
        ls.add(Tuan32ContactKotlin("Le Van Do Kien","35", R.drawable.chrome))
        ls.add(Tuan32ContactKotlin("Kim Ri Cha","38", R.drawable.kimchi))
        ls.add(Tuan32ContactKotlin("Bay Gio Kem Muoi","22", R.drawable.kimbap))
        ls.add(Tuan32ContactKotlin("Sa Ti","36", R.drawable.firefox))
        //gan vao adapter
        adap= Tuan32AdapterKotlin(this,ls)
        lv.adapter= adap
    }
}
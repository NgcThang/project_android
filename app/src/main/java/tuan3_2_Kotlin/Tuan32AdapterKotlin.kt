package tuan3_2_Kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.projecta.R

class Tuan32AdapterKotlin(context: Context, ls:ArrayList<Tuan32ContactKotlin>):BaseAdapter() {
    var ls:ArrayList<Tuan32ContactKotlin> = ls
    var context: Context = context
    //lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }
    //lay ve itme hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }
    //lay ve id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    //tao view va gan du leu cho view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        var vax:ViewAX
        //tao view, gan dulieu
        //neu chua co view thi tao view moi, neu co view roi thi sdung view cu
        if(convertView == null)
        {
            vax = ViewAX()
            //generate layout
            c= LayoutInflater.from(context).inflate(R.layout.tuan32_item_view,null)
            //anh xa tung tphan cua layout
            vax.img_hinh = c.findViewById(R.id.tuan312ItemHinh)
            vax.tv_ten = c.findViewById(R.id.tuan312ItemTen)
            vax.tv_tuoi = c.findViewById(R.id.tuan312ItemTuoi)
            //tao template lan sau sdung
            c.tag=vax
        }
        else
        {
            vax=c!!.tag as ViewAX
            //lay view cu ra sdung
        }
        // gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text=ls[position].ten!!
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        return c!!
    }
    //khai bao (template), lop anh xa item view
    inner class ViewAX{
        var img_hinh: ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null

    }
}
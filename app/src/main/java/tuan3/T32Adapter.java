package tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projecta.R;

import java.util.ArrayList;
import java.util.Base64;

public class T32Adapter extends BaseAdapter {
    private ArrayList<T32Contact> ls;
    private Context context;

    public T32Adapter(ArrayList<T32Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    //lay ve sluong item
    @Override
    public int getCount() {
        return ls.size();
    }

    //lay ve ite
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    //lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    //tao view va gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //tao view
        ViewAX vax;
        //neu chua co view thi tao view moi
        if(convertView ==null){
            vax = new ViewAX();
            //anh xa layout
            convertView= LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item
            ,null);
            //ah xa tung tphan trong layout
            vax.img_hinh = convertView.findViewById(R.id.t32ItemHinh);
            vax.tv_ten = convertView.findViewById(R.id.t32ItemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.t32ItemTuoi);
            //tao template de lan sau sudung
            convertView.setTag(vax);
        }
        //neu da co view roi thi su dung lai view cu
        else{
            vax = (ViewAX) convertView.getTag(); //lay view cu
        }
        // gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView; //tra ve ket qua
    }
    //dinh nghia view
    class ViewAX{
        ImageView img_hinh;
        TextView    tv_ten, tv_tuoi;
    }
}

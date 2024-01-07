package tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.projecta.R;

import java.util.ArrayList;

public class Tuan32 extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32);
        lv= findViewById(R.id.tuan32Lv);
        //tao nguon dulieu
        ls.add(new T32Contact("Nguyen van a","18",R.drawable.apple));
        ls.add(new T32Contact("Tran van b","16",R.drawable.android));
        ls.add(new T32Contact("Vu van c","17",R.drawable.facebook));
        ls.add(new T32Contact("Nguyen thi d","22",R.drawable.chrome));
        ls.add(new T32Contact("Nguyen van y","32",R.drawable.firefox));
        ls.add(new T32Contact("Nguyen van x","11",R.drawable.hp));
        //tao adapter
        adapter = new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}
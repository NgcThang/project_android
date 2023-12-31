package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.projecta.R;

public class tuan2_2 extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22);
        lv=findViewById(R.id.tuan22Listview);
        //nguon du lieu
        String[] arr= new String[]{"Tuan1","Tuan2","Tuan3","Tuan4","Tuan5","Tuan6","abc"};
        //adapter
        ArrayAdapter<String> adapter=
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        //hien thi len listview
        lv.setAdapter(adapter);
    }
}
package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.projecta.R;

public class tuan2_1Second extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_second);
        tv1=findViewById(R.id.tuan21tv1);
        //don du lieu
        Intent i1=getIntent();
        //do hang
        String chuoi1= i1.getExtras().getString("so1");
        String chuoi2= i1.getExtras().getString("so2");
        //
        float so1= Float.parseFloat(chuoi1);
        float so2= Float.parseFloat(chuoi2);
        float tong= so1+so2;
        //hien thi kqua
        tv1.setText(String.valueOf(tong));
    }
}
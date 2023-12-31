package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.projecta.R;

public class tuan2_1 extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21);
        txt1=findViewById(R.id.tuan21txt1);
        txt2=findViewById(R.id.tuan21txt2);
        btn1=findViewById(R.id.tuan21btn1);
        //tao su kien khi click btn
        btn1.setOnClickListener(v->{
            //dinh huong di chuyen
            Intent i=new Intent(tuan2_1.this,
                    tuan2_1Second.class);
            //dua du lieu vao
            i.putExtra("so1", txt1.getText().toString());
            i.putExtra("so2", txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}
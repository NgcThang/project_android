package tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projecta.R;

public class btap1 extends AppCompatActivity {
    //anh xa control textview sang code java
    TextView tvt1;//khai bao textview
    EditText txt1, txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btap1);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        btn1=findViewById(R.id.btn1);
        tvt1=findViewById(R.id.tvt1);//anh xa textview
        //xuly su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();
        });
        //tvt1.setText("So thu nhat");
    }

    private void tinhTong() { //dn ham tinh tong
        //lay dlieu nhap vao tu edittext1 va 2
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        float tong= so1+so2;
        //in kqua ra man hinh
        tvt1.setText(String.valueOf(tong));
    }
}
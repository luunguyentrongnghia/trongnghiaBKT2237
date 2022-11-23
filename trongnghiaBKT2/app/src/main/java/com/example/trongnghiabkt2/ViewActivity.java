package com.example.trongnghiabkt2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {
    private ImageView imageView;
    TextView TenKH,Tenthuong,Dactinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        imageView=findViewById(R.id.image);
        TenKH=findViewById(R.id.tenkh);
        Tenthuong=findViewById(R.id.tenthuong);
        Dactinh=findViewById(R.id.dactinh);

//        Glide.with(getApplicationContext()).load(surl).into(surl);


        imageView.setImageResource(getIntent().getIntExtra("Surl", 0));
        TenKH.setText(getIntent().getStringExtra("TenKH").toString());
        Tenthuong.setText(getIntent().getStringExtra("Tenthuong").toString());
        Dactinh.setText(getIntent().getStringExtra("Dactinh").toString());

    }
}
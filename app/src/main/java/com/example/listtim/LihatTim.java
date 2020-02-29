package com.example.listtim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class LihatTim extends AppCompatActivity {

    private TextView textnama, textdes;
    private ImageView imagegambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_tim);
        String namaTim = getIntent().getStringExtra("namatim");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        int logoTim = (getIntent().getIntExtra("logotim",0));

        textnama = findViewById(R.id.tv_lihat1);
        textdes = findViewById(R.id.tv_lihat2);
        imagegambar = findViewById(R.id.iv_lihat);

        textnama.setText(namaTim);
        textdes.setText(deskripsi);
        Glide.with(getApplicationContext()).load(logoTim).into(imagegambar);
    }
}

package com.example.trashclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KonfirmasiActivity extends AppCompatActivity {

    private TextView tvNama, tvTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        tvNama = findViewById(R.id.tv_nama);
        tvTelepon = findViewById(R.id.et_telepon);

        Intent terima = getIntent();
        String terimaNama = terima.getStringExtra("amplopNama");
        String terimaTelepon = terima.getStringExtra("amplopTelepon");

        tvNama.setText(terimaNama);
        tvTelepon.setText(terimaTelepon);

    }
}
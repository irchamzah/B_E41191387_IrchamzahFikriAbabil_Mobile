package com.example.trashclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNama, etTelepon;
    private Button btnSimpan, btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_nama);
        etTelepon = findViewById(R.id.et_telepon);
        btnSimpan = findViewById(R.id.btn_simpan);
        btnShare = findViewById(R.id.btn_share);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String telepon = etTelepon.getText().toString();

                if (nama.trim().equals("")) {
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else if (telepon.trim().equals("")) {
                    etTelepon.setError("Nomor Telepon Tidak Boleh Kosong");
                }
                else {
                    Intent kirim = new Intent(MainActivity.this, KonfirmasiActivity.class);
                    kirim.putExtra("amplopNama", nama);
                    kirim.putExtra("amplopTelepon", telepon);
                    startActivity(kirim);
                }
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "aaaaaaaaa");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}
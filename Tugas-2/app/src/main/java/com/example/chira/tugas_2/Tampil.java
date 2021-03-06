package com.example.chira.tugas_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tampil extends AppCompatActivity implements View.OnClickListener {

    TextView TNIM, Tnama, VNIM, Vnama;
    String get_nim, get_nama;
    Button back;
    Intent kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_krs);
        back = (Button) findViewById(R.id.btn_back);
        back.setOnClickListener(this);


        TNIM = (TextView) findViewById(R.id.txtNIM);
        Tnama = (TextView) findViewById(R.id.txtNama);
        VNIM = (TextView) findViewById(R.id.VNIM);
        Vnama = (TextView) findViewById(R.id.Vnama);

        Bundle b = getIntent().getExtras();

        get_nim = b.getString("parse_nim");
        get_nama = b.getString("parse_nama");

        VNIM.setText("" + get_nim);
        Vnama.setText("" + get_nama);
    }

    @Override
    public void onClick(View v) {
        kembali = new Intent(this, Krs.class);
        startActivity(kembali);
    }
}
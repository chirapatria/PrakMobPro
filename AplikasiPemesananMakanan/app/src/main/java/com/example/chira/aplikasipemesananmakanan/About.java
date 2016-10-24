package com.example.chira.aplikasipemesananmakanan;

/**
 * Created by chira on 23/10/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class About extends AppCompatActivity {

    TextView nama, nim;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_main);

        nama = (TextView) findViewById(R.id.txtNama);
        nim = (TextView) findViewById(R.id.txtNim);
        back = (Button) findViewById(R.id.buttonBck);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bck = new Intent(About.this, MainActivity.class);
                startActivity(bck);
            }
        });

    }
}



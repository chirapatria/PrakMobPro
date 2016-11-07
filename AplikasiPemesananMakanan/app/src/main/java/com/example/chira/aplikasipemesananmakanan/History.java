package com.example.chira.aplikasipemesananmakanan;

/**
 * Created by chira on 25/10/16.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class History extends AppCompatActivity {
    private TextView tv_detail_krs;
    private String detail_booking;
    private Button btn_kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_booking);
        tv_detail_krs = (TextView)
                findViewById(R.id.tv_detail_krs);
        btn_kembali = (Button) findViewById(R.id.btn_kembali);
        final Bundle krsArrayList = getIntent().getExtras();
//final ArrayList<String> stringArray = new ArrayList<>(); //no need for this line
        ArrayList<String> krsArray = krsArrayList.getStringArrayList("KRS"); //just declare and assign
        detail_booking="";
        for (int i=0; i<krsArray.size(); i++){
            detail_booking += krsArray.get(i) + "\n";
        }
        tv_detail_krs.setText(detail_booking);
        btn_kembali.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
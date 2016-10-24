package com.example.chira.aplikasipemesananmakanan;

/**
 * Created by chira on 23/10/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListMakanan extends AppCompatActivity {

    int[] gambar={
            R.drawable.cilok,
            R.drawable.cimol,
            R.drawable.seblak,
            R.drawable.awug,
            R.drawable.surabi,
    };

    ListView list;

    String[] judul ={
            "cilok",
            "cimol",
            "Seblak",
            "Awug",
            "Surabi",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);


        // Inisialisasi CustomAdapter dengan Array yang telah dibuat
        CustomAdapter adapter = new CustomAdapter(this, gambar, judul);

        // Inisialisasi ListView
        list = (ListView) findViewById(R.id.ListGambar);

        // set Adapter ke dalam ListView
        list.setAdapter(adapter);

        // action ketika ListView di klik
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub

                Intent deskripsi = new Intent(ListMakanan.this, DeskripsiMakanan.class);
                startActivity(deskripsi);

                // String untuk mengambil judul pada Listview
                String Slecteditem = judul[position];

                // menampilkan judul dengan Toast
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
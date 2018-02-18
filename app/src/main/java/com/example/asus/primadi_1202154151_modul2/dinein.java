package com.example.asus.primadi_1202154151_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.primadi_1202154151_modul2_1.R;

import java.util.ArrayList;

public class dinein extends AppCompatActivity {
    private Spinner noMeja;
    private TextView nama;
    private String lblNoMeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        nama = (TextView)findViewById(R.id.txtNamaDineIn);
        noMeja = (Spinner)findViewById(R.id.txtNoMeja);
        ArrayList<String> list = isiDataMeja();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        noMeja.setAdapter(dataAdapter);
    }
    public ArrayList<String> isiDataMeja() {
        int maks = 20;
        ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i <= maks; i++) {
            data.add("Meja " + i);
        }
        return data;
    }

    public void pilihsekarang(View view) {
        String nomormeja, namapemesan;
        nomormeja = String.valueOf(noMeja.getSelectedItem());
        namapemesan = nama.getText().toString();
        Toast.makeText(this, nomormeja+" atas Nama "+namapemesan+" Dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DaftarMenu.class));
    }
}

package com.example.asus.primadi_1202154151_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.primadi_1202154151_modul2_1.R;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DetailMenu extends AppCompatActivity {
    private ArrayList<MenuModel> daftar;
    private String idMenu;
    private TextView nama, harga, deskripsi;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        nama = (TextView)findViewById(R.id.DetailNama);
        harga = (TextView)findViewById(R.id.DetailHarga);
        deskripsi = (TextView)findViewById(R.id.DetailDeskripsi);
        gambar = (ImageView) findViewById(R.id.DetailGambar);
//
        daftar = DaftarMenu.menuList;
        Intent q = getIntent();
        idMenu = q.getStringExtra("MenuID");
        Log.d("DETAILED MENU","ID:"+idMenu);
        MenuModel menu = daftar.get(Integer.parseInt(idMenu));
        nama.setText(menu.getNama());
        setTitle(menu.getNama());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(menu.getHarga()) +",- / Porsi");
        deskripsi.setText(menu.getDeskripsi());
        gambar.setImageResource(menu.getGambar());
    }
}

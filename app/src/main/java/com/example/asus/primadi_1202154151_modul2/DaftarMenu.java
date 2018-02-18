package com.example.asus.primadi_1202154151_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asus.primadi_1202154151_modul2_1.R;

import java.util.ArrayList;
import java.util.LinkedList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterList menuAdapter;
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private AdapterList mAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new AdapterList(menuList);
        recyclerView.setAdapter(menuAdapter);
//        recyclerView.addOnItemTouchListener(new RecycleView.Item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Nasi Goreng Spesial", 11000, R.drawable.nasigoreng, "Nasi Goreng + Ayam"));
        data.add(new MenuModel("Nasi Goreng Sate Ayam", 21273, R.drawable.satekambing, "Nasi Goreng + Sate Ayam"));
        data.add(new MenuModel("Rendang", 14000, R.drawable.rendang, "Rendang + Nasi"));
        data.add(new MenuModel("Mie Goreng", 14000, R.drawable.miegoreng, "Mie Goreng"));
        data.add(new MenuModel("Ayam Goreng", 18040, R.drawable.ayam, "Ayam Goreng + Nasi"));
        data.add(new MenuModel("Sayur Jengkol", 18182, R.drawable.jengkol, "Sayur Jengkol + Nasi khas Warung"));
        data.add(new MenuModel("Soto Ayam", 19909, R.drawable.soto, "Soto + Nasi"));
        data.add(new MenuModel("Soto Ayam", 19909, R.drawable.soto, "Soto + Nasi"));
        return data;

    }
}

package com.example.asus.primadi_1202154151_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.asus.primadi_1202154151_modul2_1.R;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pilihsekarang(View view) {
        startActivity(new Intent(this, DaftarMenu.class));
    }
}

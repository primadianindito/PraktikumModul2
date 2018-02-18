package com.example.asus.primadi_1202154151_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.asus.primadi_1202154151_modul2_1.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup)findViewById(R.id.radioPilihMenu);
        Toast.makeText(this,"PRIMADI ANIDNITO_1202154151",Toast.LENGTH_SHORT).show();
    }

    public void pesan(View view) {
        int go = radioGroup1.getCheckedRadioButtonId();
        switch (go){
            case R.id.bungkus:
                Toast.makeText(this,"Bungkus",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TakeAway.class)); break;
            case R.id.makanditempat:
                Toast.makeText(this,"Makan Ditempat",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,dinein.class)); break;
            default:break;
        }
    }
}


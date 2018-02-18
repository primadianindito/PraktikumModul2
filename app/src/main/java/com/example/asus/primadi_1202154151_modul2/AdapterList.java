package com.example.asus.primadi_1202154151_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.primadi_1202154151_modul2_1.R;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Asus on 2/18/2018.
 */

public class AdapterList extends RecyclerView.Adapter<AdapterList.WordViewHolder>  {

    class WordViewHolder extends RecyclerView.ViewHolder {
        private TextView nama,harga,ID;
        private ImageView Gambar;


        public WordViewHolder(View itemView) {
            super(itemView);
            ID = (TextView)itemView.findViewById(R.id.lblListID);
             nama = (TextView)itemView.findViewById(R.id.lblListNama);
            harga = (TextView)itemView.findViewById(R.id.lblListHarga);
            Gambar = (ImageView)itemView.findViewById(R.id.lblListGambar);

        }
    }
    private ArrayList<MenuModel> dataList;

    public AdapterList(ArrayList<MenuModel> list) {
        this.dataList = list;
        Log.d("Jumlah Menu","Size: "+getItemCount());
    }

    @Override
    public AdapterList.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemlist, parent, false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterList.WordViewHolder holder, int position) {
        holder.ID.setText(""+position);
        holder.nama.setText(dataList.get(position).getNama());
        holder.harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.Gambar.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String klik = holder.ID.getText().toString();
                Log.d("ItemMenuCLICKED","ID:"+klik);
                Toast.makeText(v.getContext(), "Memilih Menu '"+dataList.get(Integer.parseInt(klik)).getNama()+"'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID",""+klik);
                v.getContext().startActivity(i);

            }
        });
    }


    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

}





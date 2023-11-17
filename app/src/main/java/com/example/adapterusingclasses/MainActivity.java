package com.example.adapterusingclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPays;
    ArrayList<Pays> paysArrayList = new ArrayList<>();

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPays = findViewById(R.id.lvPays);

        paysArrayList.add(new Pays(R.drawable.palestine,"Pound","PP"));
        paysArrayList.add(new Pays(R.drawable.algeria,"Algerian Dinar","DZD"));
        paysArrayList.add(new Pays(R.drawable.afghanistan,"Afghani","AFN"));
        paysArrayList.add(new Pays(R.drawable.saudiarabia,"Saudi Riyal","SAR"));
        paysArrayList.add(new Pays(R.drawable.belgium,"Euro","EUR"));
        paysArrayList.add(new Pays(R.drawable.benin,"CFA FRANC","XOF"));
        paysArrayList.add(new Pays(R.drawable.brazil,"Brazilian real","BRL"));
        paysArrayList.add(new Pays(R.drawable.ivorycoast,"CFA Franc","XOF"));

        adapter = new MyAdapter(this,paysArrayList);
        lvPays.setAdapter(adapter);
    }

}
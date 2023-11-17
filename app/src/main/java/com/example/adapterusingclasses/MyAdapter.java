package com.example.adapterusingclasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    ArrayList<Pays> paysData = new ArrayList<Pays>();

    Context context;

    MyAdapter(Context context,ArrayList<Pays> paysData) {
        this.context = context;
        this.paysData = paysData;
    }

    @Override
    public int getCount() {
        return paysData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.customview, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView currency = (TextView) view.findViewById(R.id.textViewTop);
            TextView codeISO = (TextView) view.findViewById(R.id.textViewBottom);

            imageView.setImageResource(paysData.get(position).getImg());
            currency.setText(paysData.get(position).getCurrency());
            codeISO.setText(paysData.get(position).getCode_ISO());

        }
        return view;
    }
}






















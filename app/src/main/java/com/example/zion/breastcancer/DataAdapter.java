package com.example.zion.breastcancer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zion on 10/11/2015.
 */
public class DataAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public DataAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler{
        ImageView pic;
        TextView name;
    }

    @Override
    public void add(Object object){
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount(){
        return this.list.size();
    }

    @Override
    public Object getItem(int position){
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row;
        DataHandler handler;
        row = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            handler.pic = (ImageView) row.findViewById(R.id.photos);
            handler.name = (TextView) row.findViewById(R.id.names);
            row.setTag(handler);
        }
        else{
            handler = (DataHandler)row.getTag();
        }

        DataProvider dataProvider = (DataProvider) this.getItem(position);
        handler.pic.setImageResource(dataProvider.getPhotoResource());
        handler.name.setText(dataProvider.getNames());

        return row;
    }
}

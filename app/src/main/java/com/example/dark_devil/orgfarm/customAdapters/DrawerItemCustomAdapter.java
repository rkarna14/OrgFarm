package com.example.dark_devil.orgfarm.customAdapters;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dark_devil.orgfarm.ObjectDrawerItem;
import com.example.dark_devil.orgfarm.R;

/**
 * Created by dark-devil on 11/24/14.
 */

public class DrawerItemCustomAdapter extends ArrayAdapter<ObjectDrawerItem>{
    Context mContext;
    int layoutResourceId;
    ObjectDrawerItem data[] = null;

    public DrawerItemCustomAdapter(Context mContext, int layoutResourceId, ObjectDrawerItem[] data){
        super(mContext, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId, parent, false);
        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewName);
        ObjectDrawerItem menu = data[position];
        imageViewIcon.setImageResource(menu.icon);
        textViewName.setText(menu.name);
        return listItem;
    }
}

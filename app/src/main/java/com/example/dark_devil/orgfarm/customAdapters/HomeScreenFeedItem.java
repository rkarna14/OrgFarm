package com.example.dark_devil.orgfarm.customAdapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dark_devil.orgfarm.HomeFragment;
import com.example.dark_devil.orgfarm.R;
import com.example.dark_devil.orgfarm.apiClasses.SellersAdvertisement;

/**
 * Created by dark-devil on 11/25/14.
 */
public class HomeScreenFeedItem extends ArrayAdapter<SellersAdvertisement>{
    Context mContext;
    int layoutResourceId;
    SellersAdvertisement advertisements[] = null;

    public HomeScreenFeedItem(Context mContext, int layoutResourceId, SellersAdvertisement[] advertisement){
        super(mContext, layoutResourceId, advertisement);
        this.mContext = mContext;
        this.layoutResourceId = layoutResourceId;
        this.advertisements = advertisement;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View feedListItem = convertView;
        LayoutInflater inflater = ((Activity)mContext).getLayoutInflater();
        inflater.inflate(layoutResourceId, parent, false);
        if(feedListItem==null){
            feedListItem = inflater.inflate(R.layout.sellers_advertisement_feed, null);
        }
        ImageView profile_pic = (ImageView) feedListItem.findViewById(R.id.profile_pic);
        TextView user_name = (TextView) feedListItem.findViewById(R.id.user_name);
        TextView advertisement_text = (TextView) feedListItem.findViewById(R.id.advertisement_text);
        SellersAdvertisement singleAD = advertisements[position];
        profile_pic.setImageResource(R.drawable.user);
        advertisement_text.setText("is selling "+singleAD.maxQtyForSale+" Kgs of "+singleAD.productName+" at base price of "+ singleAD.base_price);
        user_name.setText(singleAD.farmerName);
        return feedListItem;
    }
}

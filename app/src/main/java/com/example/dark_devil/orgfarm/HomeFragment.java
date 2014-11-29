package com.example.dark_devil.orgfarm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.dark_devil.orgfarm.apiClasses.SellersAdvertisement;
import com.example.dark_devil.orgfarm.customAdapters.HomeScreenFeedItem;

/**
 * Created by dark-devil on 11/24/14.
 */
public class HomeFragment extends Fragment{
    public ListView feedItemsList;
    public HomeScreenFeedItem a;
    public HomeFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TabHost home_fragment_tabhost = (TabHost) rootView.findViewById(R.id.home_fragment_tabhost);
        home_fragment_tabhost.setup();
        TabHost.TabSpec specs = home_fragment_tabhost.newTabSpec("tag1");
        specs.setIndicator("Sellers");
        specs.setContent(R.id.Sellers);
        home_fragment_tabhost.addTab(specs);

        specs = home_fragment_tabhost.newTabSpec("tag2");
        specs.setIndicator("Buyers");
        specs.setContent(R.id.Buyers);
        home_fragment_tabhost.addTab(specs);

        SellersAdvertisement[] advertisementList = new SellersAdvertisement[20];
        for(int i=0; i<20;i++){
            if(i%2==0)
                advertisementList[i] = new SellersAdvertisement("Ramesh", 20, 30, "Potato",20, 30,"2014-10-20", "2014-10-10", 30 );
            else
                advertisementList[i] = new SellersAdvertisement("Suresh", 20, 30, "Potato",20, 30,"2014-10-20", "2014-10-10", 30 );
        }
        HomeScreenFeedItem adapter = new HomeScreenFeedItem(getActivity(), R.layout.sellers_advertisement_feed, advertisementList);
        feedItemsList = (ListView) rootView.findViewById(R.id.home_feed_list_sellers);
        feedItemsList.setAdapter(adapter);
        return rootView;
    }
}

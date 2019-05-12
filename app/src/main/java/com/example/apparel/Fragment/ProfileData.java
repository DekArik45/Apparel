package com.example.apparel.Fragment;

import com.example.apparel.ProductActivity;

import java.util.ArrayList;

public class ProfileData {

    public static String[][] data = new String[][]{
            {"Adji Nur", "adji@gmail.com", "adji", "adji123", "link"},
            {"Ari M", "ari@gmail.com", "ari", "ari123", "link"},
            {"Gusade Taruna", "gusade@gmail.com", "gusade", "gusade123", "link"}

    };

    public static ArrayList<ProfileFragment> getListData(){
        ProfileFragment profileFragment = null;
        ArrayList<ProfileFragment> list = new ArrayList<>();
        for (String[] aData : data) {
            profileFragment = new ProfileFragment();
            profileFragment.setNamaUser(aData[0]);
            profileFragment.setEmailUser(aData[1]);
            profileFragment.setUsername(aData[2]);
            profileFragment.setPassword(aData[3]);
            profileFragment.setFotoUser(aData[4]);

            list.add(profileFragment);
        }

        return list;
    }
}

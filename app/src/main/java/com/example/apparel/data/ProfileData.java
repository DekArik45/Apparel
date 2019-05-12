package com.example.apparel.data;

import com.example.apparel.model.UserModel;

import java.util.ArrayList;

public class ProfileData {

    public static String[][] data = new String[][]{
            {"Adji Nur", "adji@gmail.com", "adji", "adji123", "link"},
            {"Ari M", "ari@gmail.com", "ari", "ari123", "link"},
            {"Gusade Taruna", "gusade@gmail.com", "gusade", "gusade123", "link"}

    };

    public static ArrayList<UserModel> getListData(){
        UserModel userData = null;
        ArrayList<UserModel> list = new ArrayList<>();
        for (String[] aData : data) {
            userData = new UserModel();
            userData.setNamaUser(aData[0]);
            userData.setEmailUser(aData[1]);
            userData.setUsername(aData[2]);
            userData.setPassword(aData[3]);
            userData.setFotoUser(aData[4]);

            list.add(userData);
        }

        return list;
    }
}

package com.example.tolymolyapp.common;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class LoadJsonFromAssets {
    private Context mContext;

    public String loadJsonFromAssets(String fileName){
        String json = null;
        try {
            InputStream is = mContext.getAssets().open(""+fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}

package com.example.nwuser.hillsidegarden;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nwuser on 2015/11/12.
 */
public class Page1 extends PageBase {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.page1,null);
    }
}

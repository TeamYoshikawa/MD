package com.example.nwuser.hillsidegarden;

/**
 * Created by nwuser on 2015/11/11.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nwuser.hillsidegarden.R;
public class Page0 extends PageBase{

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.page0,null);
    }
}

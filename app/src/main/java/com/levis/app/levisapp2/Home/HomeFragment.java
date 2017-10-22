package com.levis.app.levisapp2.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.levis.app.levisapp2.R;

import java.util.ArrayList;

/**
 * Created by juancamilovilladagamboa on 10/21/17.
 */

public class HomeFragment extends android.support.v4.app.Fragment {

    private static final String TAG = "HomeFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }
}

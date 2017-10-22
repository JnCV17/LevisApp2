package com.levis.app.levisapp2.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.levis.app.levisapp2.R;

/**
 * Created by juancamilovilladagamboa on 10/21/17.
 */

public class MessagesFragment extends android.support.v4.app.Fragment {

    private static final String TAG = "MessagesFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_messages, container, false);
        return view;
    }
}

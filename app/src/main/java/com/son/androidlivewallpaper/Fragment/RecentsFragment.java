package com.son.androidlivewallpaper.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.son.androidlivewallpaper.R;


public class RecentsFragment extends Fragment {
    private static RecentsFragment INSTANCE = null;


    public RecentsFragment() {
        // Required empty public constructor
    }
    public static RecentsFragment getInstance(){
        if(INSTANCE==null)
            INSTANCE = new RecentsFragment();
        return INSTANCE;
    }

    public static RecentsFragment newInstance(String param1, String param2) {
        RecentsFragment fragment = new RecentsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recents, container, false);
    }
}
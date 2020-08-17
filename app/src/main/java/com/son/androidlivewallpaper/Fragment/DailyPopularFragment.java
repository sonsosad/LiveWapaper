package com.son.androidlivewallpaper.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.son.androidlivewallpaper.R;


public class DailyPopularFragment extends Fragment {

    private static DailyPopularFragment INSTANCE = null;

    public DailyPopularFragment() {
        // Required empty public constructor
    }
    public static DailyPopularFragment getInstance(){
        if(INSTANCE==null)
            INSTANCE = new DailyPopularFragment();
        return INSTANCE;
    }

    public static DailyPopularFragment newInstance(String param1, String param2) {
        DailyPopularFragment fragment = new DailyPopularFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_daily_popular, container, false);
    }
}
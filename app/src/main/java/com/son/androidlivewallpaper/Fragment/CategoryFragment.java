package com.son.androidlivewallpaper.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.son.androidlivewallpaper.R;

public class CategoryFragment extends Fragment {
    private static CategoryFragment INSTANCE=null;

    public CategoryFragment() {
        // Required empty public constructor
    }

    public static CategoryFragment getInstance(){
        if(INSTANCE==null)
            INSTANCE = new CategoryFragment();
        return INSTANCE;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }
}
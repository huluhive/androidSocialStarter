package com.huluhive.user.fbandgooglelogin.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huluhive.user.fbandgooglelogin.R;

/**
 * Created by User on 4/5/2017.
 */
public class TeamFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.team_fragment,container,false);
        return view;
    }
}

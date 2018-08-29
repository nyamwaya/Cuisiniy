package nyamwaya.com.cuisiniy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import nyamwaya.com.cuisiniy.R;

/**
 * Created by jafam on 9/20/2017.
 */

public class ProfileFragment extends Fragment {
    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        mToolbar = view.findViewById(R.id.profileToolbar);
        mCollapsingToolbarLayout= view.findViewById(R.id.collapsing_toolbar);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.toolbar_default, menu);


        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
}


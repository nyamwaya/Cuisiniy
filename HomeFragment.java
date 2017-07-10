package nyamwaya.com.cuisiniy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyamwaya.com.cuisiniy.R;

/**
 * Created by jafam on 7/8/2017.
 */

public class HomeFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mLinearLayoutManager = new LinearLayoutManager(getContext());

        return view;
    }
}

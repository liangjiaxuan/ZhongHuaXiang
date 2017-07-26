package com.rongwei.zhonghuaxiang.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rongwei.zhonghuaxiang.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SmallSurpriseFragment extends Fragment {


    public SmallSurpriseFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_small_surprise, container, false);

    }

}

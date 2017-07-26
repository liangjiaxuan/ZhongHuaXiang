package com.rongwei.zhonghuaxiang.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.rongwei.zhonghuaxiang.bean.TestBean;

import java.util.List;

/**
 * Created by Administrator on 2017/6/11.
 */

public class TestAdapter extends BaseAdapter {
    private List<TestBean>data;
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

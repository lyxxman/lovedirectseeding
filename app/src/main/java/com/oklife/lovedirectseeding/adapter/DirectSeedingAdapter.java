package com.oklife.lovedirectseeding.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.oklife.lovedirectseeding.model.DirectSeeding;

import java.util.ArrayList;

/**
 * @author ly
 * @version V1.0
 * @Package com.oklife.lovedirectseeding.adapter
 * @Description: 直播适配器
 * @date 2017/6/13 15:45
 */

public class DirectSeedingAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<DirectSeeding> mDatas = new ArrayList<DirectSeeding>();

    public DirectSeedingAdapter(Context mContext, ArrayList<DirectSeeding> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

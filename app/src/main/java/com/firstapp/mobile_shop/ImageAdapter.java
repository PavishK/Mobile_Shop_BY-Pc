package com.firstapp.mobile_shop;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return thumbImages.length;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10, 10, 10, 10);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
    public Integer[] thumbImages = {
            R.drawable.apple, R.drawable.baseline_android_24,
            R.drawable.ic_camera,R.drawable.ia_headphone,
            R.drawable.lock,R.drawable.ia_review,
            R.drawable.ic_mic,R.drawable.ia_mobile,
            R.drawable.ia_ai,R.drawable.ia_cpu,
            R.drawable.ia_game,R.drawable.ia_signal,
            R.drawable.ia_video

    };
}
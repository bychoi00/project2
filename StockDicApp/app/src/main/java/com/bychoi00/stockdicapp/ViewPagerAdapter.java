package com.bychoi00.stockdicapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

public class ViewPagerAdapter extends PagerAdapter {

    int[] images_resources = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6
            , R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13
            , R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20
            , R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27
            , R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34
            , R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41
            , R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48};


    private Context ctx;
    private LayoutInflater inflater;

    public ViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return images_resources.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_item, container, false);

        ImageView image = (ImageView) itemView.findViewById(R.id.imageView);
        image.setImageResource(images_resources[position]);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }

}

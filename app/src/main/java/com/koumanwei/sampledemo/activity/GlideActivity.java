package com.koumanwei.sampledemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.koumanwei.sampledemo.R;
import com.koumanwei.sampledemo.adapter.GlideAdapter;

/**
 * 展示glide图片缓存框架的使用
 * GitHub地址：https://github.com/bumptech/glide
 */
public class GlideActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new GlideAdapter(this));
    }
}

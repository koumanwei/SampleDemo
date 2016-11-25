package com.koumanwei.sampledemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.koumanwei.sampledemo.R;
import com.koumanwei.sampledemo.adapter.ItemDecorationAdapter;
import com.koumanwei.sampledemo.bean.CityBean;
import com.koumanwei.sampledemo.view.TitleItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ItemDecorationActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<CityBean> cityList;
    private static final String[] CITY_LIST = new String[]{
            "北京市", "天津市", "上海市", "重庆市", "河北省",
            "山西省", "辽宁省", "吉林省", "江苏省", "浙江省",
            "安徽省", "福建省", "江西省", "山东省", "河南省",
            "湖北省", "湖南省", "广东省", "海南省", "四川省",
            "贵州省", "云南省", "陕西省", "甘肃省", "青海省 ",
            "台湾省", "黑龙江省", "内蒙古自治区", "广西壮族自治区", "西藏自治区",
            "宁夏回族自治区", "新疆维吾尔自治区", "香港特别行政区", "澳门特别行政区"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_decoration);
        initCityData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // 设置布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 设置adapter
        ItemDecorationAdapter adapter = new ItemDecorationAdapter(this, cityList);
        // 设置分割线
        recyclerView.addItemDecoration(new TitleItemDecoration(this, cityList));
        recyclerView.setAdapter(adapter);
    }

    private void initCityData() {
        cityList = new ArrayList<>();
        cityList.add(new CityBean("A", "安徽省"));
        cityList.add(new CityBean("B", "北京市"));
        cityList.add(new CityBean("C", "重庆市"));
        cityList.add(new CityBean("D", "北京市"));
        cityList.add(new CityBean("E", "北京市"));
        cityList.add(new CityBean("F", "北京市"));
        cityList.add(new CityBean("G", "广东省"));
        cityList.add(new CityBean("H", "湖北省"));
        cityList.add(new CityBean("I", "北京市"));
        cityList.add(new CityBean("J", "江西省"));
        cityList.add(new CityBean("K", "北京市"));
        cityList.add(new CityBean("L", "辽宁省"));
        cityList.add(new CityBean("M", "北京市"));
        cityList.add(new CityBean("N", "内蒙古自治区"));
        cityList.add(new CityBean("O", "北京市"));
        cityList.add(new CityBean("P", "北京市"));
        cityList.add(new CityBean("Q", "青海省"));
        cityList.add(new CityBean("R", "北京市"));
        cityList.add(new CityBean("S", "四川省"));
    }

}

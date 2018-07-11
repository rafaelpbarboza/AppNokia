package com.example.rafael.appnokia.View;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.rafael.appnokia.Model.Task;
import com.example.rafael.appnokia.Presenter.ReciclerOrder;
import com.example.rafael.appnokia.Presenter.View_Pager_Adapter_Order;
import com.example.rafael.appnokia.R;
import com.example.rafael.appnokia.View.Fragment.Fragment_New_Orden;
import com.example.rafael.appnokia.View.Fragment.Fragment_Progress_Order;

import java.util.ArrayList;

public class Order extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        pager=(ViewPager) findViewById(R.id.view_Pager_order);
        tabLayout=(TabLayout)findViewById(R.id.tab_order);
        ArrayList<Fragment>fragments=new ArrayList();
        fragments.add(new Fragment_New_Orden());
        fragments.add(new Fragment_Progress_Order());
        pager.setAdapter(new View_Pager_Adapter_Order(getSupportFragmentManager(),fragments));
        tabLayout.setupWithViewPager(pager);
        tabLayout.getTabAt(0).setText(R.string.tab_new_order);
        tabLayout.getTabAt(1).setText(R.string.tab_progress);
    }
}

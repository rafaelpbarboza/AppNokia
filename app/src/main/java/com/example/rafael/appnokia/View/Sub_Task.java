package com.example.rafael.appnokia.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.rafael.appnokia.Model.Pojo_Sub_Task;
import com.example.rafael.appnokia.Presenter.Recicler_sub_Task;
import com.example.rafael.appnokia.R;

import java.util.ArrayList;


public class Sub_Task extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__task);
        Bundle b=getIntent().getExtras();
        ArrayList<Pojo_Sub_Task>pojo_sub_tasks=b.getParcelableArrayList("sub_task");
        GridLayoutManager grid=new GridLayoutManager(this,2);
        if(toolbar==null){
            toolbar=(Toolbar)findViewById(R.id.toolbar_sub_task);
            setSupportActionBar(toolbar);
            toolbar.setTitle(R.string.status);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerView=(RecyclerView) findViewById(R.id.Recicler_sub_task);
        recyclerView.setAdapter(new Recicler_sub_Task(pojo_sub_tasks,this));
        recyclerView.setLayoutManager(grid);

    }
}

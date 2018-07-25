package com.example.rafael.appnokia.View;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.rafael.appnokia.Model.Pojo_Task_to_be;
import com.example.rafael.appnokia.Presenter.Recicler_task_to_do;
import com.example.rafael.appnokia.R;

import java.util.ArrayList;

public class Task_to_be extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_to_be);
        Bundle b=getIntent().getExtras();
        ArrayList<Pojo_Task_to_be> pojo_task_to_bes=b.getParcelableArrayList("task_to_be");
        LinearLayoutManager linear=new LinearLayoutManager(this);
        recyclerView=(RecyclerView)findViewById(R.id.Recicler_sub_task_to_be);
        recyclerView.setAdapter(new Recicler_task_to_do(pojo_task_to_bes,this));
        recyclerView.setLayoutManager(linear);
    }
}

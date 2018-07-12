package com.example.rafael.appnokia.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rafael.appnokia.Model.Pojo_Sub_Task;
import com.example.rafael.appnokia.R;

import java.util.ArrayList;


public class Sub_Task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__task);
        Bundle b=getIntent().getExtras();
        ArrayList<Pojo_Sub_Task>pojo_sub_tasks=b.getParcelableArrayList("sub_task");

    }
}

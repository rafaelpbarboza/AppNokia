package com.example.rafael.appnokia.View.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rafael.appnokia.Model.Sub_Task;
import com.example.rafael.appnokia.Model.Task;
import com.example.rafael.appnokia.Presenter.ReciclerOrder;
import com.example.rafael.appnokia.R;

import java.util.ArrayList;

public class Fragment_New_Orden extends Fragment{
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_new_order, container, false);
        recyclerView=(RecyclerView) v.findViewById(R.id.ReciclerOrder);
        LinearLayoutManager ln=new LinearLayoutManager(getActivity());
        ln.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(ln);
        recyclerView.setAdapter(new ReciclerOrder(date(),getContext()));
        return v;
    }


    public ArrayList<Task> date(){
        ArrayList<Task> tasks=new ArrayList();
        ArrayList<Sub_Task>sub_tasks=new ArrayList();
        sub_tasks.add(new Sub_Task("Civil works", "https://encrypted-tbn0.gstatic.com/images?q=tbn:" +
                "ANd9GcTx1YUfVD83ygvfptrYl5GDAR30z1g9V_b4GZMYaru1skJ9AaG-Qw", 50));
        sub_tasks.add(new Sub_Task("PSIM","https://cdn.icon-icons.com/icons2/902/PNG/512" +
                "/search_icon-icons.com_69307.png",50));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 14 N 44-73",5,0,sub_tasks));
        tasks.add(new Task("Blog123","calle 116 N 34-43",3,12,sub_tasks));
        tasks.add(new Task("Blog123","calle 121 N 56-45",1,0,sub_tasks));
        return tasks;
    }
}

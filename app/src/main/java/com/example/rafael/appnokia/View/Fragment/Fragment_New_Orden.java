package com.example.rafael.appnokia.View.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rafael.appnokia.Model.Pojo_Sub_Task;
import com.example.rafael.appnokia.Model.Pojo_Task;
import com.example.rafael.appnokia.Model.Pojo_Task_to_be;
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


    public ArrayList<Pojo_Task> date(){
        ArrayList<Pojo_Task> pojoTasks =new ArrayList();

        ArrayList<Pojo_Sub_Task> pojoSub_tasks =new ArrayList();
        ArrayList<Pojo_Task_to_be>pojo_task_to_bes=new ArrayList();
        pojo_task_to_bes.add(new Pojo_Task_to_be("Site Clean","No Starter","12/1/18",2,5,12));
        pojo_task_to_bes.add(new Pojo_Task_to_be("Clean","No Starter","12/1/18",4,5,1));
        pojo_task_to_bes.add(new Pojo_Task_to_be("On Air","Starter","11/13/18",3,2,3));
        pojoSub_tasks.add(new Pojo_Sub_Task("Civil works", "https://d30y9cdsu7xlg0.cloudfront.net/png/791013-200.png", 50,pojo_task_to_bes));
        pojoSub_tasks.add(new Pojo_Sub_Task("PSIM","https://png.icons8.com/metro/1600/work.png",50,pojo_task_to_bes));


        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 14 N 44-73",5,0, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 116 N 34-43",3,12, pojoSub_tasks));
        pojoTasks.add(new Pojo_Task("Blog123","calle 121 N 56-45",1,0, pojoSub_tasks));
        return pojoTasks;
    }
}

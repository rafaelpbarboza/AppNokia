package com.example.rafael.appnokia.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rafael.appnokia.Model.Task;
import com.example.rafael.appnokia.R;

import java.util.ArrayList;

public class Recicler_sub_Task  extends RecyclerView.Adapter<Recicler_sub_Task.Holder>{

    ArrayList<Task>tasks;

    public Recicler_sub_Task(ArrayList<Task> tasks){
        this.tasks=tasks;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.card_sub_task,parent,false);
        return new Holder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Task task=tasks.get(position);


    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class Holder extends ReciclerOrder.ViewHolder{

        public Holder(View v) {
            super(v);
        }
    }
}

package com.example.rafael.appnokia.Presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rafael.appnokia.Model.Pojo_Task_to_be;
import com.example.rafael.appnokia.R;

import java.util.ArrayList;

import smartdevelop.ir.eram.showcaseviewlib.GuideView;

public class Recicler_task_to_do extends RecyclerView.Adapter<Recicler_task_to_do.holder> {

    private ArrayList<Pojo_Task_to_be>pojo_task_to_bes;
    Pojo_Task_to_be pojo;
    private Context context;
    private SharedPreferences.Editor editor;
    private SharedPreferences sharedPref;

    public Recicler_task_to_do (ArrayList<Pojo_Task_to_be>pojo_task_to_bes,Context context){
        this.pojo_task_to_bes=pojo_task_to_bes;
        this.context=context;
        this.pojo=null;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.card_task_to_be,parent,false);
        return new holder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        pojo=pojo_task_to_bes.get(position);
/*
        if(holder.getAdapterPosition()==0){
            sharedPref =context.getSharedPreferences("tutorial",context.MODE_PRIVATE);
            editor = sharedPref.edit();
            if(sharedPref.getInt("estado_sub_to_do",0) == 0) {
                new GuideView.Builder(context)
                        .setTitle("Tarea por realizar")
                        .setContentText("Deslice entre tab \n para ver el estado de las ordenes")
                        .setGravity(GuideView.Gravity.auto) //optional
                        .setDismissType(GuideView.DismissType.outside) //optional - default GuideView.DismissType.targetView
                        .setTargetView(holder.cardView)
                        .setContentTextSize(12)//optional
                        .setTitleTextSize(14)//optional
                        .setGuideListener(new GuideView.GuideListener() {
                            @Override
                            public void onDismiss(View view) {
                                editor.putInt("estado_sub_to_do", 1);
                                editor.commit();
                            }
                        })
                        .build()
                        .show();
            }
        }*/
        holder.name.setText(pojo.getName());
        holder.status.setText(pojo.getStatus());
        holder.day.setText(String.valueOf(pojo.getDay_working()));
        holder.date.setText(pojo.getDate());
        holder.activity.setText(String.valueOf(pojo.getActivity()));

    }

    @Override
    public int getItemCount() {
        return pojo_task_to_bes.size();
    }

    public static class holder extends RecyclerView.ViewHolder{
        private TextView name,status,activity,day,date;
        private CardView cardView;

        public holder(View v) {
            super(v);
            name=v.findViewById(R.id.name_task_to_do);
            status=v.findViewById(R.id.status_task_to_do);
            activity=v.findViewById(R.id.activity_task_to_do);
            day=v.findViewById(R.id.day_task_to_do);
            date=v.findViewById(R.id.date_task_to_do);
            cardView=v.findViewById(R.id.card_task_to_do);
        }
    }
}

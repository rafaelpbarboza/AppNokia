package com.example.rafael.appnokia.Presenter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rafael.appnokia.Model.Pojo_Sub_Task;
import com.example.rafael.appnokia.Model.Pojo_Task;
import com.example.rafael.appnokia.R;
import com.example.rafael.appnokia.View.Task_to_be;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import smartdevelop.ir.eram.showcaseviewlib.GuideView;

public class Recicler_sub_Task  extends RecyclerView.Adapter<Recicler_sub_Task.Holder>{

    private ArrayList<Pojo_Sub_Task> pojo_sub_tasks;
    private Pojo_Sub_Task sub_task;
    private Context context;
    private SharedPreferences.Editor editor;
    private SharedPreferences sharedPref;

    public Recicler_sub_Task(ArrayList<Pojo_Sub_Task> pojoTasks, Context context){
        this.pojo_sub_tasks = pojoTasks;
        this.context=context;
        sub_task=null;
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
        sub_task=pojo_sub_tasks.get(position);


        if(holder.getAdapterPosition()==0){
            sharedPref =context.getSharedPreferences("tutorial",context.MODE_PRIVATE);
            editor = sharedPref.edit();
            if(sharedPref.getInt("estado_sub_actividad",0) == 0) {
                new GuideView.Builder(context)
                        .setTitle("Sub Actividad por realizar")
                        .setContentText("Deslice entre tab \n para ver el estado de las ordenes")
                        .setGravity(GuideView.Gravity.auto) //optional
                        .setDismissType(GuideView.DismissType.outside) //optional - default GuideView.DismissType.targetView
                        .setTargetView(holder.linearLayout)
                        .setContentTextSize(12)//optional
                        .setTitleTextSize(14)//optional
                        .setGuideListener(new GuideView.GuideListener() {
                            @Override
                            public void onDismiss(View view) {
                                editor.putInt("estado_sub_actividad", 1);
                                editor.commit();
                            }
                        })
                        .build()
                        .show();
            }
        }

        holder.title.setText(sub_task.getTitle());
        Picasso.get().load(sub_task.getImage()).into(holder.icon);
        holder.text.setText(String.valueOf(sub_task.getProgress()));
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, Task_to_be.class);
                i.putExtra("task_to_be",sub_task.getPojo_task_to_bes());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pojo_sub_tasks.size();
    }

    public static class Holder extends ReciclerOrder.ViewHolder{
        private TextView title,text;
        private ImageView icon;
        private LinearLayout linearLayout;
        public Holder(View v) {
            super(v);
            title=v.findViewById(R.id.title_sub_task);
            text=v.findViewById(R.id.text_sub_task);
            icon=v.findViewById(R.id.icon_sub_task);
            linearLayout=v.findViewById(R.id.layout_sub_task);
        }
    }
}

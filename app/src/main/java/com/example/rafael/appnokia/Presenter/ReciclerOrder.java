package com.example.rafael.appnokia.Presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.rafael.appnokia.Model.Task;
import com.example.rafael.appnokia.R;
import com.example.rafael.appnokia.View.Sub_Task;

import java.util.ArrayList;

public class ReciclerOrder extends RecyclerView.Adapter<ReciclerOrder.ViewHolder> {
    private ArrayList<Task> tasks;
    private Context context;
    private Task task;

    public ReciclerOrder(ArrayList<Task>tasks,Context contexts) {
        this.tasks=tasks;
        this.context=contexts;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardorder,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        task=tasks.get(position);
        holder.site.setText(task.getSite());
        holder.address.setText(task.getAddress());
        holder.activities.setText(String.valueOf(task.getActivities()));
        holder.status.setText(String.valueOf(task.getStatus()));
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, Sub_Task.class);
                i.putExtra("sub_task",task.getSub_tasks());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView site,address,activities,status;
        private CardView card;

        public ViewHolder(View v) {
            super(v);
            site=(TextView) v.findViewById(R.id.site_work);
            address=(TextView) v.findViewById(R.id.address_work);
            activities=(TextView)v.findViewById(R.id.activities_work);
            status=(TextView)v.findViewById(R.id.status_work);
            card=(CardView)v.findViewById(R.id.card_id);
        }
    }
}

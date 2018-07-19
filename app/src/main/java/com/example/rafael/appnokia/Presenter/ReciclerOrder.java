package com.example.rafael.appnokia.Presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rafael.appnokia.Model.Pojo_Sub_Task;
import com.example.rafael.appnokia.Model.Pojo_Task;
import com.example.rafael.appnokia.R;
import com.example.rafael.appnokia.View.Sub_Task;

import java.io.Serializable;
import java.util.ArrayList;

import smartdevelop.ir.eram.showcaseviewlib.GuideView;

public class ReciclerOrder extends RecyclerView.Adapter<ReciclerOrder.ViewHolder> {
    private ArrayList<Pojo_Task> pojoTasks;
    private Context context;
    private Pojo_Task pojoTask;

    public ReciclerOrder(ArrayList<Pojo_Task> pojoTasks, Context contexts) {
        this.pojoTasks = pojoTasks;
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
        pojoTask = pojoTasks.get(position);
        holder.site.setText(pojoTask.getSite());
        holder.address.setText(pojoTask.getAddress());
        holder.activities.setText(String.valueOf(pojoTask.getActivities()));
        holder.status.setText(String.valueOf(pojoTask.getStatus()));
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, Sub_Task.class);
                i.putExtra("sub_task", pojoTask.getPojoSub_tasks());
                i.putExtra("titulo",pojoTask.getSite());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pojoTasks.size();
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

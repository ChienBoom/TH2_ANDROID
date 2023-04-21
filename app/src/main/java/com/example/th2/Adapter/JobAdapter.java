package com.example.th2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.th2.Model.Job;
import com.example.th2.R;

import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    private Context context;
    private List<Job> list;

    public JobAdapter(Context context, List<Job> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.job_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Job job = list.get(position);
        holder.image.setImageResource(job.getImage());
        holder.code.setText(String.valueOf(job.getCode()));
        holder.name.setText(job.getName());
        holder.content.setText(job.getContent());
        holder.action.setText(job.getAction());
        holder.collab.setText(job.getCollab());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView code, name, content, date, action, collab;
        public ViewHolder(@NonNull View view) {
            super(view);
            image = view.findViewById(R.id.image);
            code = view.findViewById(R.id.code);
            name = view.findViewById(R.id.name);
            content = view.findViewById(R.id.content);
            date = view.findViewById(R.id.date);
            action = view.findViewById(R.id.action);
            collab = view.findViewById(R.id.collab);
        }
    }
}

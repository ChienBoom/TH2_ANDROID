package com.example.th2.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.th2.Adapter.JobAdapter;
import com.example.th2.Model.Job;
import com.example.th2.R;
import com.example.th2.SqlLite.SqlDb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Frag_danhsach extends Fragment {
    JobAdapter adapter;
    RecyclerView recyclerView;
    List<Job> list;
    private SqlDb db;
    public Frag_danhsach(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_danhsach,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = new ArrayList<>();
        db = new SqlDb(getContext());
        db.addJob(new Job(R.drawable.meo1,"cong viec 1","Giat Do","12/12/1212","1","true"));
        db.addJob(new Job(R.drawable.meo2,"cong viec 2","Lau San","12/12/1212","1","true"));
        list = db.GetAllJob();

//        list.add(new Job(R.drawable.meo1,1,"cong viec 1","Giat Do","12/12/1212","1","true"));
//        list.add(new Job(R.drawable.meo1,2,"cong viec 2","Lau San","12/12/1212","1","true"));
//        list.add(new Job(R.drawable.meo1,3,"cong viec 3","Quet Nha","12/12/1212","1","true"));
        recyclerView = view.findViewById(R.id.view);
        LinearLayoutManager manager =  new LinearLayoutManager(view.getContext(),recyclerView.VERTICAL,false);
        adapter = new JobAdapter(view.getContext(),list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

}

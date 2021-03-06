package com.osos.markup.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.osos.markup.ui.Attendance;
import com.osos.markup.R;

import java.util.ArrayList;


public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ClassHolder> {
    Context c;
    ArrayList<String> arrayList;
    Attendance boj;


    public ClassAdapter(Context c, ArrayList<String> arrayList, Attendance obj) {
        this.c = c;
        this.arrayList = arrayList;
        boj = obj;
    }

    @NonNull
    @Override
    public ClassHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(c).inflate(R.layout.classadapter, parent, false);
        return new ClassHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassHolder holder, final int position) {
        holder.obj.setText(arrayList.get(position));


        holder.obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boj.OnClick(arrayList.get(position));

            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    class ClassHolder extends RecyclerView.ViewHolder {

        TextView obj;

        public ClassHolder(@NonNull View itemView) {
            super(itemView);
            obj = itemView.findViewById(R.id.dateNAme);
        }
    }


}

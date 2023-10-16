package com.example.myapplication02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myholder>{
    ArrayList<String> list1;
    Context context1;
    public Myadapter(ArrayList<String> list, Context context){
        list1=list;
        context1=context;
    }
    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context1).inflate(R.layout.item, parent, false);
//        Inflater inflater=new Inflater();
//        inflater.inflate();
//        LayoutInflater.from(context1).inflate(R.layout.item, parent, false);
        Myholder myholder=new Myholder(view);
        myholder.setIsRecyclable(false);
        return myholder;
    }
    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.textView.setText(list1.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }
    class Myholder extends RecyclerView.ViewHolder{
        TextView textView;
        public Myholder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.textView31);
        }
    }
}


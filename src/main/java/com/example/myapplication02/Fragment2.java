package com.example.myapplication02;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

public class Fragment2 extends Fragment {
    Context context;
    List<String> list;
    RecyclerView recyclerView;
    View view;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, container, false);
        recyclerView = view.findViewById(R.id.RecyclerView);
        ArrayList<String> arraylist1 = new ArrayList<String>(Arrays.asList("MathTeacher", "EnglishTeacher", "ChineseTeacher",
                "Father","Mother","Friends","Elysia","Kiana","Rita","Bronya","Kaiwen","Mobius","Eden","Raiden Mei","Yae Sakura","Elieen","Honkai","Genshin","Star","WhyBuildsFly"));
        list = new ArrayList<String>(arraylist1);

        Myadapter myadapter = new Myadapter((ArrayList<String>) list, getContext());
        recyclerView.setAdapter(myadapter);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        return view;
    }
}
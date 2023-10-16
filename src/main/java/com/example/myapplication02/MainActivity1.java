package com.example.myapplication02;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {
    Fragment fragment1, fragment2, fragment3, fragment4;
    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    //Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        linearLayout1 = findViewById(R.id.layou1);
        linearLayout2 = findViewById(R.id.layou2);
        linearLayout3 = findViewById(R.id.layou3);
        linearLayout4 = findViewById(R.id.layou4);

        fragmentManager = getSupportFragmentManager();
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        innitial();
        fragmentshow(fragment1);
        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
        FragmentManager fm;
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    private void fragmentshow(Fragment fragment) {
        fragmentHide();
        FragmentTransaction ft = fragmentManager.beginTransaction()
                .show(fragment);
        ft.commit();
    }

    private void innitial() {

        FragmentTransaction ft = fragmentManager.beginTransaction()
                .add(R.id.content, fragment1)
                .add(R.id.content, fragment2)
                .add(R.id.content, fragment3)
                .add(R.id.content, fragment4);
        ft.commit();
    }

    private void fragmentHide() {
        FragmentTransaction ft = fragmentManager.beginTransaction()
                .hide(fragment1)
//                .hide(fragment1)
                .hide(fragment2)
                .hide(fragment3)
                .hide(fragment4);
        ft.commit();

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.layou1) fragmentshow(fragment1);
        if (view.getId() == R.id.layou2) fragmentshow(fragment2);
        if (view.getId() == R.id.layou3) fragmentshow(fragment3);
        if (view.getId() == R.id.layou4) fragmentshow(fragment4);
    }
}
//        switch (view.getId()) {
//            case R.id.layout1:
//                fragmentshow(fragment1);
//                break;
//            case R.id.layout2:
//                fragmentshow(fragment2);
//                break;
//            case R.id.layout3:
//                fragmentshow(fragment3);
//                break;
//            case R.id.layout4:
//                fragmentshow(fragment4);
//                break;
//            default:
//                break;
//        }


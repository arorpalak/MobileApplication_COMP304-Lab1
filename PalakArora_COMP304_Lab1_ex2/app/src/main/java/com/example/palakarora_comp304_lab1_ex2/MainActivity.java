package com.example.palakarora_comp304_lab1_ex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomFragment bottomFragment;
    ActivitiesFragment activitiesFragment;


    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        if(fragment instanceof BottomFragment){
            bottomFragment = (BottomFragment) fragment;
        }else if(fragment instanceof ActivitiesFragment){
            activitiesFragment = (ActivitiesFragment) fragment;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomFragment.setText("onCreate excecuted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        bottomFragment.setText("onStart excecuted");
    }
}
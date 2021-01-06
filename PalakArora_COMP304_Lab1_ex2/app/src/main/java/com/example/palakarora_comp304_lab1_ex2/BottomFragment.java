package com.example.palakarora_comp304_lab1_ex2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BottomFragment extends Fragment {

    //TextView t = (TextView)getView().findViewById(R.id.main_activity);
    TextView t;
    String message = "Bottom fragment:";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        t = view.findViewById(R.id.main_activity);
        message += " onCreateView executed";
        Toast toast = Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT);
        toast.show();
        return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        message += " onStart executed";
        Toast toast = Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void setText(String message){
        String text = t.getText().toString();
        t.setText(text + "\n " + message);
    }

}
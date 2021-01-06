package com.example.palakarora_comp304_lab1_ex2;



import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

public class ActivitiesFragment extends ListFragment {

    String message = "Activitites fragment:";


    String[] activities = new String[]
            {
                    "AIActivity",
                    "VRActivity"
            };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_activities, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        setListAdapter(adapter);
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


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent;
        if(position == 0){
            intent = new Intent(getActivity(), AIActivity.class);
            startActivity(intent);
        }else if(position == 1){
            intent = new Intent(getActivity(), VRActivity.class);
            startActivity(intent);
        }

    }
}
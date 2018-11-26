package com.example.ahmednaeem.holosimulator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ResultsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.fragment_results, container, false);

        final Button next = (Button) rootView.findViewById(R.id.Nextbtn);
        next.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.container, new HomeFragment()).commit();
                //transaction.addToBackStack(null);
            }
        }));
        return inflater.inflate(R.layout.fragment_results, container, false);
    }

}

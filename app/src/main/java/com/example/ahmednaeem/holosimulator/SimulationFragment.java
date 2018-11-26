package com.example.ahmednaeem.holosimulator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimulationFragment extends Fragment {
    TextView timerTxt;
    int time = 59;

    public void startTimer() {

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timerTxt.setText("14:"+checkDigit(time));
                time--;
            }

            public void onFinish() {
                timerTxt.setText("try again");
            }

        }.start();
    }

    public String checkDigit(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simulation, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        timerTxt = (TextView) getActivity().findViewById(R.id.txtTime);
        // Displaying the user details on the screen
        startTimer();
    }



}

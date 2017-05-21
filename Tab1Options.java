package com.example.arnold.myapplication;

/**
 * Created by Arnold on 5/16/17.
 */

import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.arnold.myapplication.R.layout.tab1options;

public class Tab1Options extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(tab1options, container, false);

        Button one = (Button) rootView.findViewById(R.id.button);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) rootView.findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) rootView.findViewById(R.id.button3);
        three.setOnClickListener(this);
        Button four = (Button) rootView.findViewById(R.id.button4);
        one.setOnClickListener(this);
        Button five = (Button) rootView.findViewById(R.id.button5);
        two.setOnClickListener(this);
        Button six = (Button) rootView.findViewById(R.id.button6);
        three.setOnClickListener(this);
        Button seven = (Button) rootView.findViewById(R.id.button7);
        one.setOnClickListener(this);
        Button eight = (Button) rootView.findViewById(R.id.button8);
        two.setOnClickListener(this);
        Button nine = (Button) rootView.findViewById(R.id.button9);
        three.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                
                break;

            case R.id.button2:

                break;

            case R.id.button3:

                break;

            case R.id.button4:

                break;

            case R.id.button5:

                break;

            case R.id.button6:

                break;

            case R.id.button7:

                break;

            case R.id.button8:

                break;

            case R.id.button9:

                break;

            default:
                break;
        }
    }
}

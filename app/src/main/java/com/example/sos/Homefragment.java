package com.example.sos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Homefragment extends Fragment {

    Button helpButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,
                container, false);


        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.siren);

        helpButton = (Button) view.findViewById(R.id.helpButton);

        helpButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                }
                else
                    mp.start();
            }
        });

        return view;

    }

}

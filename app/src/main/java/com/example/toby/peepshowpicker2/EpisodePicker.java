package com.example.toby.peepshowpicker2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class EpisodePicker extends AppCompatActivity {

    private ArrayList<String> episode;
    private Random random;
    private TextView EpisodeText;
    private static final String TAG = "Picker";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_picker);

        episode = new ArrayList<>(54);
        random = new Random();
        Log.i(TAG, "Application is running");

        episode.add( "Series 1 - Episode 1 - Warring Factions");
        episode.add( "Series 1 - Episode 2 - The Interview");
        episode.add( "Series 1 - Episode 3 - On The Pull");
        episode.add( "Series 1 - Episode 4 - Mark Makes A Friend");
        episode.add( "Series 1 - Episode 5 - Dream Job");
        episode.add( "Series 1 - Episode 6 - Funeral");

        episode.add( "Series 2 - Episode 1 - Dance Class");
        episode.add( "Series 2 - Episode 2 - Jeremy Makes It");
        episode.add( "Series 2 - Episode 3 - Local Hero");
        episode.add("Series 2 - Episode 4 - University Challenge");
        episode.add("Series 2 - Episode 5 - The Man Show");
        episode.add("Series 2 - Episode 6 - Wedding");

        episode.add("Series 3 - Episode 1 - Dance Class");
        episode.add("Series 3 - Episode 2 - Sectioning");
        episode.add("Series 3 - Episode 3 - Shrooming");
        episode.add("Series 3 - Episode 4 - Sisterning");
        episode.add("Series 3 - Episode 5 - Jurying");
        episode.add("Series 3 - Episode 6 - Quantocking");

        episode.add("Series 4 - Episode 1 - Sophies Parents");
        episode.add("Series 4 - Episode 2 - Conference");
        episode.add("Series 4 - Episode 3 - Gym");
        episode.add("Series 4 - Episode 4 - Handyman");
        episode.add("Series 4 - Episode 5 - Holiday");
        episode.add("Series 4 - Episode 6 - The Wedding");

        episode.add("Series 5 - Episode 1 - Burgling");
        episode.add("Series 5 - Episode 2 - Spin War");
        episode.add("Series 5 - Episode 3 - Jeremy Broke");
        episode.add("Series 5 - Episode 4 - Jeremys Mummy");
        episode.add("Series 5 - Episode 5 - Jeremys Manager");
        episode.add("Series 5 - Episode 6 - Marks Women");

        episode.add("Series 6 - Episode 1 - Jeremy at JLB");
        episode.add("Series 6 - Episode 2 - The Test");
        episode.add("Series 6 - Episode 3 - Jeremy in Love");
        episode.add("Series 6 - Episode 4 - The Affair");
        episode.add("Series 6 - Episode 5 - The Party");
        episode.add("Series 6 - Episode 6 - Das Boot");

        episode.add("Series 7 - Episode 1 - St.Hospitals");
        episode.add("Series 7 - Episode 2 - Man Jam");
        episode.add("Series 7 - Episode 3 - A Beautiful Mind");
        episode.add("Series 7 - Episode 4 - Nether Zone");
        episode.add("Series 7 - Episode 5 - Seasonal Beatings");
        episode.add("Series 7 - Episode 6 - New Years Eve");

        episode.add("Series 8 - Episode 1 - Jeremy Therapised");
        episode.add("Series 8 - Episode 2 - Business Secrets of the Pharoahs");
        episode.add("Series 8 - Episode 3 - The Love Bunker");
        episode.add("Series 8 - Episode 4 - Big Mad Andy");
        episode.add("Series 8 - Episode 5 - Chairman Mark");
        episode.add("Series 8 - Episode 6 - Quantocking II");

        episode.add("Series 9 - Episode 1 - The William Morris Years");
        episode.add("Series 9 - Episode 2 - Gregorys Beard");
        episode.add("Series 9 - Episode 3 - Threeism");
        episode.add("Series 9 - Episode 4 - Mole-Mapping");
        episode.add("Series 9 - Episode 5 - Kid Farm");
        episode.add("Series 9 - Episode 6 - Are We Going to Be Alright?");

        Button PickButton = (Button)(findViewById(R.id.button));
        PickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button was pressed");
            }
        });


    }
}

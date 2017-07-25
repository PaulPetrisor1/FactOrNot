package com.cg.factornot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button factButton = (Button) findViewById(R.id.factbutton);
        Button notfactButton = (Button) findViewById(R.id.notfact_button);
        TextView score = (TextView) findViewById(R.id.score);
        TextView scoreText = (TextView) findViewById(R.id.score_text);
        ImageView factImage = (ImageView) findViewById(R.id.fact_image);
        TextView factText = (TextView) findViewById(R.id.fact_text);



    }




}

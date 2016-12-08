package com.example.stephen.testgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Khadyah on 12/8/2016.
 */
public class HelpPopup extends Activity {

    Button B2GButton;

    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.help_popup);

        B2GButton = (Button) findViewById(R.id.B2G);

        B2GButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                startActivity(new Intent(HelpPopup.this, MainActivity.class));

            }
        });

    }

}
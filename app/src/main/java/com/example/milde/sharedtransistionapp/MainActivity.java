package com.example.milde.sharedtransistionapp;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pass data object in the bundle and populate details activity.
        //intent.putExtra(TargetActivity.EXTRA_CONTACT, contact);


        Button btn = (Button)findViewById(R.id.btn_StartTransition);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start(v);

            }

        });

    }

    private void start(View v) {
        Intent intent = new Intent(getApplicationContext(), TargetActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(this, v, "profile");
        startActivity(intent, options.toBundle());
    }

}

package com.cavsci.medres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DurationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duration);
    }

    public void minutes3Clicked(View view) {
        onDurationSelected(0);
    }

    public void minutes5Clicked(View view) {
        onDurationSelected(1);
    }

    public void minutes10Clicked(View view) {
        onDurationSelected(2);
    }

    public void onDurationSelected(int duration) {
        int emotion = getIntent().getIntExtra("emotion", 0);

        startActivity(new Intent(this, MusicPlayerActivity.class)
                .putExtra("duration", duration)
                .putExtra("emotion", emotion));
    }
}
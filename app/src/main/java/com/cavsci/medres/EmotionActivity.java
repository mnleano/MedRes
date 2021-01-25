package com.cavsci.medres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion);
    }

    public void onCopingAnxietyClicked(View view) {
        onEmotionSelected(0);
    }

    public void onStressClicked(View view) {
        onEmotionSelected(1);
    }

    public void onLackSleepClicked(View view) {
        onEmotionSelected(2);
    }

    public void onPositiveEnergyClicked(View view) {
        onEmotionSelected(3);
    }

    public void onFocusClicked(View view) {
        onEmotionSelected(4);
    }

    public void onInnerPeaceClicked(View view) {
        onEmotionSelected(5);
    }

    public void onEmotionSelected(int emotion) {
        startActivity(new Intent(this, DurationActivity.class)
                .putExtra("emotion", emotion));
    }
}
package com.cavsci.medres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class MusicPlayerActivity extends AppCompatActivity {

    private ImageView btnPlay, btnPause;
    private MediaPlayer mediaPlayer;


    public int[][] music = {
            {R.raw.anxiety3, R.raw.anxiety5, R.raw.anxiety10},
            {R.raw.stress3, R.raw.stress5, R.raw.stress10},
            {R.raw.sleep3, R.raw.sleep5, R.raw.sleep10},
            {R.raw.positive_energy3, R.raw.positive_energy5, R.raw.positive_energy10},
            {R.raw.focus3, R.raw.focus5, R.raw.focus10},
            {R.raw.inner_peace3, R.raw.inner_peace5, R.raw.inner_peace10},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);

        int emotion = getIntent().getIntExtra("emotion", 0);
        int duration = getIntent().getIntExtra("duration", 0);

        mediaPlayer = MediaPlayer.create(this, music[emotion][duration]);
        mediaPlayer.setOnCompletionListener(mp -> startActivity(new Intent(MusicPlayerActivity.this, PostCreditsActivity.class)));
    }

    public void onPlayClicked(View view) {
        Log.d("MusicPlayerActivity", "onPlayClicked");
        mediaPlayer.start();

        btnPlay.setVisibility(View.GONE);
        btnPause.setVisibility(View.VISIBLE);

    }

    public void onPauseClicked(View view) {
        Log.d("MusicPlayerActivity", "onPauseClicked");
        mediaPlayer.pause();

        btnPlay.setVisibility(View.VISIBLE);
        btnPause.setVisibility(View.GONE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }
}
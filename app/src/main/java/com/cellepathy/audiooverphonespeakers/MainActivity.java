package com.cellepathy.audiooverphonespeakers;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.media.AudioManager.*;
import static android.os.Build.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onPlayAudioClicked(android.view.View buttonParams)
    {
        Uri audioUri = Uri.parse("android.resource://com.cellepathy.audiooverphonespeakers/" + R.raw.speech);

        Ringtone ringtone = RingtoneManager.getRingtone(this, audioUri);
        ringtone.play();

    }
}

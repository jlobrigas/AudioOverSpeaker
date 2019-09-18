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
import android.provider.AlarmClock;
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
        AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        RingtoneManager ringtoneManager = new RingtoneManager(this);
        ringtoneManager.setType(RingtoneManager.TYPE_ALARM);
        Ringtone ringtone = ringtoneManager.getRingtone(this, audioUri);
        audioManager.setBluetoothScoOn(false);
        audioManager.stopBluetoothSco();
        audioManager.setMode(MODE_IN_CALL);
        audioManager.setSpeakerphoneOn(true);
        ringtone.play();


    }
}

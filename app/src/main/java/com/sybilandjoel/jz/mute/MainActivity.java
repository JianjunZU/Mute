package com.sybilandjoel.jz.mute;

import android.app.Activity;
import android.app.Service;
import android.media.AudioManager;
import android.os.Bundle;


import static android.media.AudioManager.ADJUST_MUTE;
import static android.media.AudioManager.ADJUST_UNMUTE;
import static android.media.AudioManager.FLAG_SHOW_UI;
import static android.media.AudioManager.STREAM_MUSIC;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      AudioManager  audio = (AudioManager) getSystemService(Service.AUDIO_SERVICE);
        if(audio.getRingerMode()==AudioManager.RINGER_MODE_NORMAL){
            audio.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
            audio.setStreamVolume(AudioManager.STREAM_MUSIC,0,1);
        }
        else{
            audio.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            audio.setStreamVolume(AudioManager.STREAM_MUSIC,audio.getStreamMaxVolume(STREAM_MUSIC)/2,1);
           }
        finish();
    }
}

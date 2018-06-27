package com.example.tngu.zmstudy;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;

import java.io.IOException;

public class MusicHelper implements MediaPlayer.OnCompletionListener{
    private MediaPlayer mediaPlayer;
    private AssetManager assetManager;
    private Context context;
    private String mp;

    public MusicHelper(){}

    public MusicHelper(Context context,String mp){
        this.context = context;
        this.mp = mp;
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);

    }

    public void palyer(){
        try {

            assetManager = context.getAssets();
            AssetFileDescriptor fileDescriptor = assetManager.openFd(mp);
            mediaPlayer.setDataSource(fileDescriptor.getFileDescriptor(),
                    fileDescriptor.getStartOffset(),
                    fileDescriptor.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rePlayer(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
        }
    }


    @Override
    public void onCompletion(MediaPlayer mp) {
        mp.release();
    }
}

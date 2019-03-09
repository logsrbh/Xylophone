package com.example.xylophone;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULATION_SOUND =7;
    private final float LEFT_VOLUME =1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP =0;
    private final int PRIORITY =0;
    private final float NORMAL_PLAY_RATE =1.0f;

    private SoundPool mSoundpool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundpool= new SoundPool(NR_OF_SIMULATION_SOUND, AudioManager.STREAM_MUSIC,0);

        mCSoundId = mSoundpool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundpool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundpool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundpool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundpool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundpool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundpool.load(getApplicationContext(),R.raw.note7_b,1);




    }
    public void playC (View v)
    {
        Log.d("Xylophone","Red Button Clicked");
        mSoundpool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
    }

    public void playD (View v)
    {
        mSoundpool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE (View v)
    {
        mSoundpool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playF (View v)
    {
        mSoundpool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playG (View v)
    {
        mSoundpool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playA (View v)
    {
        mSoundpool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playB (View v)
    {
        mSoundpool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}

package com.example.tngu.zmstudy;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_11,
            btn_12, btn_13, btn_14, btn_15, btn_16, btn_17, btn_18, btn_19, btn_20, btn_21, btn_22,
            btn_23, btn_24;
    private Context context;
    private MusicHelper musicHelper;
    private String mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        initView();
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_10.setOnClickListener(this);
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
        btn_17.setOnClickListener(this);
        btn_18.setOnClickListener(this);
        btn_19.setOnClickListener(this);
        btn_20.setOnClickListener(this);
        btn_21.setOnClickListener(this);
        btn_22.setOnClickListener(this);
        btn_23.setOnClickListener(this);
        btn_24.setOnClickListener(this);


    }

    private void initView() {
        btn_1 = findViewById(R.id.zm_1);
        btn_2 = findViewById(R.id.zm_2);
        btn_3 = findViewById(R.id.zm_3);
        btn_4 = findViewById(R.id.zm_4);
        btn_5 = findViewById(R.id.zm_5);
        btn_6 = findViewById(R.id.zm_6);
        btn_7 = findViewById(R.id.zm_7);
        btn_8 = findViewById(R.id.zm_8);
        btn_9 = findViewById(R.id.zm_9);
        btn_10 = findViewById(R.id.zm_10);
        btn_11 = findViewById(R.id.zm_11);
        btn_12 = findViewById(R.id.zm_12);
        btn_13 = findViewById(R.id.zm_13);
        btn_14 = findViewById(R.id.zm_14);
        btn_15 = findViewById(R.id.zm_15);
        btn_16 = findViewById(R.id.zm_16);
        btn_17 = findViewById(R.id.zm_17);
        btn_18 = findViewById(R.id.zm_18);
        btn_19 = findViewById(R.id.zm_19);
        btn_20 = findViewById(R.id.zm_20);
        btn_21 = findViewById(R.id.zm_21);
        btn_22 = findViewById(R.id.zm_22);
        btn_23 = findViewById(R.id.zm_23);
        btn_24 = findViewById(R.id.zm_24);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zm_1:
                mp = "1.mp3";
                startZM(mp);
                break;
            case R.id.zm_2:
                mp = "2.mp3";
                startZM(mp);
                break;
            case R.id.zm_3:
                mp = "3.mp3";
                startZM(mp);
                break;
            case R.id.zm_4:
                mp = "4.mp3";
                startZM(mp);
                break;
            case R.id.zm_5:
                mp = "5.mp3";
                startZM(mp);
                break;
            case R.id.zm_6:
                mp = "6.mp3";
                startZM(mp);
                break;
            case R.id.zm_7:
                mp = "7.mp3";
                startZM(mp);
                break;
            case R.id.zm_8:
                mp = "8.mp3";
                startZM(mp);
                break;
            case R.id.zm_9:
                mp = "9.mp3";
                startZM(mp);
                break;
            case R.id.zm_10:
                mp = "10.mp3";
                startZM(mp);
                break;
            case R.id.zm_11:
                mp = "11.mp3";
                startZM(mp);
                break;
            case R.id.zm_12:
                mp = "12.mp3";
                startZM(mp);
                break;
            case R.id.zm_13:
                mp = "13.mp3";
                startZM(mp);
                break;
            case R.id.zm_14:
                mp = "14.mp3";
                startZM(mp);
                break;
            case R.id.zm_15:
                mp = "15.mp3";
                startZM(mp);
                break;
            case R.id.zm_16:
                mp = "16.mp3";
                startZM(mp);
                break;
            case R.id.zm_17:
                mp = "17.mp3";
                startZM(mp);
                break;
            case R.id.zm_18:
                mp = "18.mp3";
                startZM(mp);
                break;
            case R.id.zm_19:
                mp = "19.mp3";
                startZM(mp);
                break;
            case R.id.zm_20:
                mp = "20.mp3";
                startZM(mp);
                break;
            case R.id.zm_21:
                mp = "21.mp3";
                startZM(mp);
                break;
            case R.id.zm_22:
                mp = "22.mp3";
                startZM(mp);
                break;
            case R.id.zm_23:
                mp = "23.mp3";
                startZM(mp);
                break;
            case R.id.zm_24:
                mp = "24.mp3";
                startZM(mp);
                break;
            default:
                break;
        }
    }

    public void startZM(String mp) {
        if(musicHelper!=null){
            musicHelper.rePlayer();
        }
        context = ShowActivity.this.getApplicationContext();
        musicHelper = new MusicHelper(context, mp);
        musicHelper.palyer();

    }
}

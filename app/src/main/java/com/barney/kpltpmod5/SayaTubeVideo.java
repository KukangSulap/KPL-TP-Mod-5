package com.barney.kpltpmod5;

import android.widget.TextView;

import java.util.Random;

class SayaTubeVideo {

    private int id, PlayCount;
    private String title;
    TextView corona;

    public SayaTubeVideo(String tenka) {
        Random rand = new Random();
        PlayCount = 0;
        id = rand.nextInt(99999);
        title = tenka;
    }

    public void IncreasePlayCount(int PlayCount) {
        this.PlayCount += PlayCount;
    }

    public void PrintVideoDetails() {
        IncreasePlayCount(PlayCount);
        String makan = " id: " + id + "\n title: " + title + "\n PlayCount: " + PlayCount +"\n";
        corona.setText(makan);

    }
}

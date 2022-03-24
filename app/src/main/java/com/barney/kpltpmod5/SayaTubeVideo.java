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

        if (tenka.length() < 100 && tenka.length() > 0) {
            title = tenka;
        } else {
            title = "";
        }
    }

    public void IncreasePlayCount(int PlayCount) {
        //setara checked di C#
        int result = this.PlayCount;
        if (result != this.PlayCount) {
            throw new RuntimeException("play count reach limit: " + PlayCount);
        }

        if (PlayCount <= 100000000){
            this.PlayCount += PlayCount;
        }
    }

    public void PrintVideoDetails() {
        IncreasePlayCount(PlayCount);
        String makan = " id: " + id + "\n title: " + title + "\n PlayCount: " + PlayCount +"\n";
        corona.setText(makan);

    }
}

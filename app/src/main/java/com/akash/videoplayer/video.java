package com.akash.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    VideoView videoView;
    MediaController controller;                     //for control video

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView=findViewById(R.id.mVideoView);

       // controller=new MediaController(this);
       // videoView.setMediaController(controller);    //set controller to videoView

        //provide url of the video which have extention and not use youtube video link
        videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.start();


    }
}
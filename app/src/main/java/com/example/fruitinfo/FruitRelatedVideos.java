package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class FruitRelatedVideos extends AppCompatActivity {

    private VideoView videoView1, videoView2, videoView3;
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_related_videos);

        videoView1 = findViewById(R.id.videoOneId);
        videoView2 = findViewById(R.id.videoTwoId);
        videoView3 = findViewById(R.id.videoThreeId);

        button1 = findViewById(R.id.firstPlayId);
        button2 = findViewById(R.id.secondPlayId);
        button3 = findViewById(R.id.thirdPlayId);

        Uri uriOne, uriTwo,uriThree;
        uriOne = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_one);
        videoView1.setVideoURI(uriOne);
        MediaController mediaControllerOne = new MediaController(this);
        videoView1.setMediaController(mediaControllerOne);
        uriTwo = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_two);
        videoView2.setVideoURI(uriTwo);
        MediaController mediaControllerTwo = new MediaController(this);
        videoView2.setMediaController(mediaControllerTwo);
        uriThree = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_three);
        videoView3.setVideoURI(uriThree);
        MediaController mediaControllerThree = new MediaController(this);
        videoView3.setMediaController(mediaControllerThree);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView1.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView2.start();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView3.start();
            }
        });


    }


}

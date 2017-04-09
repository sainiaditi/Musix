package com.example.android.musix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(AlbumsActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the radio category
        TextView radio = (TextView) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(AlbumsActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });


        // Find the View that shows the now playing category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }


}
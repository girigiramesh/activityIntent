package com.example.apple.activityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", R.drawable.color_red));
        words.add(new Word("mustard yellow",  R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow",  R.drawable.color_dusty_yellow));
        words.add(new Word("green", R.drawable.color_green));
        words.add(new Word("brown", R.drawable.color_brown));
        words.add(new Word("gray",R.drawable.color_gray));
        words.add(new Word("black", R.drawable.color_black));
        words.add(new Word("white", R.drawable.color_white));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
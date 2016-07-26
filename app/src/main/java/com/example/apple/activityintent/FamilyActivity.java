package com.example.apple.activityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", R.drawable.family_father));
        words.add(new Word("mother", R.drawable.family_mother));
        words.add(new Word("son", R.drawable.family_son));
        words.add(new Word("daughter", R.drawable.family_daughter));
        words.add(new Word("older brother", R.drawable.family_older_brother));
        words.add(new Word("younger brother",  R.drawable.family_younger_brother));
        words.add(new Word("older sister", R.drawable.family_older_sister));
        words.add(new Word("younger sister",R.drawable.family_younger_sister));
        words.add(new Word("grandmother ",  R.drawable.family_grandmother));
        words.add(new Word("grandfather", R.drawable.family_grandfather));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

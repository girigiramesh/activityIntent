package com.example.apple.activityintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one",R.drawable.number_one));
        words.add(new Word("two",R.drawable.number_two));
        words.add(new Word("three",R.drawable.number_three));
        words.add(new Word("four",R.drawable.number_four));
        words.add(new Word("five",R.drawable.number_five));
        words.add(new Word("six",R.drawable.number_six));
        words.add(new Word("seven",R.drawable.number_seven));
        words.add(new Word("eight",R.drawable.number_eight));
        words.add(new Word("nine",R.drawable.number_nine));
        words.add(new Word("ten",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

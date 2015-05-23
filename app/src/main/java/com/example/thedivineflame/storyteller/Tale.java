package com.example.thedivineflame.storyteller;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class Tale extends Activity {
    Button newTale;
    Button home;
    TextView story;
    String[] stories;
    int storyLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tale);
        stories = new String[10];
        storyLength = stories.length;
        newTale = (Button) findViewById(R.id.button2);
        home = (Button) findViewById(R.id.button3);
        story = (TextView) findViewById(R.id.textView);
        populateStories();
        newTale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setStory();

            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TitleScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tale, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void populateStories() {
        stories[0] = "Once upon a time there was a good story. It died.";
        stories[1] = "who knows which story this is.";
        stories[2] = "This is the 3rd tale";
        stories[3] = "How many tales can we possibly have?";
        stories[4] = "I once knew a man with three fingers. He also had seven more";
        stories[5] = "No matter how many times you click that button you won't get a good story";
        stories[6] = "Mystery Skulls is a great band";
        stories[7] = "#where are the good stories?";
        stories[8] = "The chance that a story will repeat itself is pretty high";
        stories[9] = "hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey " +
                "hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey " +
                "hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey" +
                " hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey hey";
    }
    public void setStory() {
        storyLength = stories.length;
        int chosenStory = (int)( Math.random() * storyLength);
        story.setText(stories[(chosenStory)]);
    }
}

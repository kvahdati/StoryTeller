package com.example.thedivineflame.storyteller;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class Tale extends ActionBarActivity {
    Button newTale;
    Button home;
    TextView story;
    String[] stories;
    int storyLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tale);
        stories = new String[4];
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
    }
    public void setStory() {
        storyLength = stories.length;
        int chosenStory = (int)( Math.random() * storyLength);
        story.setText(stories[(chosenStory)]);
    }
}

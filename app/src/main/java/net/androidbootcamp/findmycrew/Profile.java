package net.androidbootcamp.findmycrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button explore = findViewById(R.id.exploreBtn);
        Button crew = findViewById(R.id.findYourCrew);
        Button yourActivity = findViewById(R.id.yourActivity);
        Button friendsActivity = findViewById(R.id.friendsActivityBtn);
        Button buyTickets = findViewById(R.id.buyTicketsBtn);
        Button sellTickets = findViewById(R.id.sellTicketsBtn);
        final TextView first = (TextView) findViewById(R.id.firstName);
        final TextView last = (TextView) findViewById(R.id.lastName);

        String firstName = getIntent().getStringExtra("first");
        String lastName = getIntent().getStringExtra("last");

        first.setText(firstName);
        last.setText(lastName);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Explore.class));
            }
        });

        crew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, FindYourCrew.class));
            }
        });

        yourActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, YourFeed.class));

            }
        });

        friendsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, FriendsFeed.class));
            }
        });

        buyTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, BuyTickets.class));

            }
        });

        sellTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, SellTickets.class));

            }
        });
    }
}

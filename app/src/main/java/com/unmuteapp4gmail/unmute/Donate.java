package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Donate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }

    public void goToActivity5 (View view){
        Intent intent = new Intent (this, DonateBooks2.class);
        startActivity(intent);
    }

    public void goToActivity6 (View view){
        Intent intent = new Intent (this, DonatePhone2.class);
        startActivity(intent);
    }

    public void goToActivity7 (View view){
        Intent intent = new Intent (this, DonateMoney2.class);
        startActivity(intent);
    }
}

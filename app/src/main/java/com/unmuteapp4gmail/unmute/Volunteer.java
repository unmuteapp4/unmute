package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Volunteer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
    }

    public void goToActivity9(View view) {
        Intent intent = new Intent(this, Attendance.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        Intent intent = new Intent(Volunteer.this, login.class);
        startActivity(intent);
    }
}
package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class EndLogic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_logic);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Logic.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(EndLogic.this,Tests.class);
        startActivity(intent);

    }
}

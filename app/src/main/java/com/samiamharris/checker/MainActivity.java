package com.samiamharris.checker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = findViewById(R.id.count_text_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("boogie", "onResume");
        countTextView.setText(String.valueOf(PrefHelper.getCheckerCount()));
    }
}

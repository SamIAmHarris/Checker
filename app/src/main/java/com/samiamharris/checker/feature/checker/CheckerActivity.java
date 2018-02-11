package com.samiamharris.checker.feature.checker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.samiamharris.checker.R;

public class CheckerActivity extends AppCompatActivity implements CheckerContract.View {

    TextView countTextView;

    CheckerContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new CheckerPresenter(this, new CheckerRepository());

        countTextView = findViewById(R.id.count_text_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void setCheckerCountText(String countText) {
        countTextView.setText(countText);
    }
}

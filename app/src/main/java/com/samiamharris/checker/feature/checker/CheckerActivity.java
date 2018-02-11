package com.samiamharris.checker.feature.checker;

import android.os.Bundle;
import android.widget.TextView;

import com.samiamharris.checker.R;
import com.samiamharris.checker.base.BaseActivity;

public class CheckerActivity extends BaseActivity<CheckerContract.View, CheckerContract.Presenter, CheckerContract.Repository>
        implements CheckerContract.View {

    TextView countTextView;

    CheckerContract.Presenter presenter;
    CheckerContract.Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = findViewById(R.id.count_text_view);
    }

    @Override
    public void setCheckerCountText(String countText) {
        countTextView.setText(countText);
    }

    @Override
    protected CheckerContract.Presenter initPresenter() {
        if(presenter == null) {
            presenter = new CheckerPresenter();
        }

        return presenter;
    }

    @Override
    protected CheckerContract.Repository initRepository() {
        if (repository == null) {
            repository = new CheckerRepository();
        }
        return repository;
    }
}

package com.samiamharris.checker.feature.checker;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerPresenter implements CheckerContract.Presenter {

    CheckerContract.View view;
    CheckerContract.Repository repo;

    public CheckerPresenter(CheckerContract.View view, CheckerContract.Repository repository) {
        this.view = view;
        this.repo = repository;
    }

    @Override
    public void onResume() {
        String countText = String.valueOf(repo.getCheckerCount());
        view.setCheckerCountText(countText);
    }
}

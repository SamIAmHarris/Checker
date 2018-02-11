package com.samiamharris.checker.feature.checker;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.samiamharris.checker.base.BasePresenter;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerPresenter extends BasePresenter<CheckerContract.View, CheckerContract.Repository> implements CheckerContract.Presenter {

    @OnLifecycleEvent(value = Lifecycle.Event.ON_RESUME)
    public void onResume() {
        String countText = String.valueOf(getRepo().getCheckerCount());
        getView().setCheckerCountText(countText);
    }
}

package com.samiamharris.checker.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.annotation.CallSuper;

/**
 * Created by SamIAm on 2/11/18.
 */

public abstract class BasePresenter<V extends BaseContract.View, R extends BaseContract.Repository>
        implements LifecycleObserver, BaseContract.Presenter<V, R> {

    private V view;
    private R repo;
    private Bundle stateBundle;


    @Override
    final public V getView() {
        return view;
    }

    @SuppressWarnings("unchecked")
    @Override
    final public R getRepo() {
        return repo;
    }

    @Override
    final public void attachLifecycle(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
    }

    @Override
    final public void detachLifecycle(Lifecycle lifecycle) {
        lifecycle.removeObserver(this);
    }

    @Override
    final public void attachView(V view) {
        this.view = view;
    }

    @Override
    final public void setRepo(R repo) {
        this.repo = repo;
    }

    @Override
    final public void detachView() {
        view = null;
    }

    @Override
    final public boolean isViewAttached() {
        return view != null;
    }

    @Override
    final public Bundle getStateBundle() {
        return stateBundle == null ?
                stateBundle = new Bundle() : stateBundle;
    }

    @CallSuper
    @Override
    public void onPresenterDestroy() {
        if (stateBundle != null && !stateBundle.isEmpty()) {
            stateBundle.clear();
        }
    }

}

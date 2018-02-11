package com.samiamharris.checker.base;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;

/**
 * Created by SamIAm on 2/11/18.
 */

public abstract class BaseContract {

    public interface View {

    }

    public interface Presenter<V extends BaseContract.View, R extends BaseContract.Repository> {

        void attachLifecycle(Lifecycle lifecycle);

        void detachLifecycle(Lifecycle lifecycle);

        void attachView(V view);

        void setRepo(R repo);

        void detachView();

        V getView();

        R getRepo();

        boolean isViewAttached();

        void onPresenterDestroy();

        Bundle getStateBundle();
    }

    public interface Repository {

    }
}

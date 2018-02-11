package com.samiamharris.checker.feature.checker;

import com.samiamharris.checker.base.BaseContract;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerContract {


    interface View extends BaseContract.View {
        void setCheckerCountText(String countText);
    }

    interface Presenter extends BaseContract.Presenter<View, Repository> {
    }

    interface Repository extends BaseContract.Repository {
        int getCheckerCount();
    }
}

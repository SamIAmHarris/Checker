package com.samiamharris.checker.feature.checker;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerContract {


    interface View {
        void setCheckerCountText(String countText);
    }

    interface Presenter {
        void onResume();
    }

    interface Repository {
        int getCheckerCount();
    }
}

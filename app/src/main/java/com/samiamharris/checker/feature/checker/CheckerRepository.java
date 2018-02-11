package com.samiamharris.checker.feature.checker;

import com.samiamharris.checker.PrefHelper;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerRepository implements CheckerContract.Repository {

    @Override
    public int getCheckerCount() {
        return PrefHelper.getCheckerCount();
    }
}

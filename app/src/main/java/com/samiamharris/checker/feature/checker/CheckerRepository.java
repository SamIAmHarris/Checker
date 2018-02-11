package com.samiamharris.checker.feature.checker;

import com.samiamharris.checker.PrefHelper;
import com.samiamharris.checker.base.BaseContract;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerRepository extends BaseContract implements CheckerContract.Repository {

    @Override
    public int getCheckerCount() {
        return PrefHelper.getCheckerCount();
    }
}

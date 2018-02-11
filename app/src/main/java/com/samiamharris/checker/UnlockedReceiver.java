package com.samiamharris.checker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by SamIAm on 2/11/18.
 */

public class UnlockedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("boogie", "onReceive");
        int count = PrefHelper.getCheckerCount();
        count++;
        PrefHelper.setCheckerCount(count);
    }
}

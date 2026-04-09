package i7;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes.dex */
public enum l {
    AUTOMATIC,
    TRUNCATE,
    WRITE_AHEAD_LOGGING;

    private final boolean isLowRamDevice(ActivityManager activityManager) {
        br.l.e(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }

    public final l resolve$room_runtime_release(Context context) {
        br.l.e(context, "context");
        if (this != AUTOMATIC) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
    }
}

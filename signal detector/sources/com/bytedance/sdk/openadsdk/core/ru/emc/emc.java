package com.bytedance.sdk.openadsdk.core.ru.emc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class emc implements Application.ActivityLifecycleCallbacks {
    private static volatile emc emc;
    private final ypw ypw;

    private emc(Application application) {
        this.ypw = ypw.emc(application);
    }

    public static emc emc(Application application) {
        if (emc == null) {
            synchronized (emc.class) {
                try {
                    if (emc == null) {
                        emc = new emc(application);
                        application.registerActivityLifecycleCallbacks(emc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ypw ypwVar = this.ypw;
        if (ypwVar != null) {
            ypwVar.emc(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ypw ypwVar = this.ypw;
        if (ypwVar != null) {
            ypwVar.ypw(activity);
        }
    }

    public String emc(String str, long j6, int i) {
        ypw ypwVar = this.ypw;
        if (ypwVar != null) {
            return ypwVar.emc(str, j6, i);
        }
        return "null";
    }
}

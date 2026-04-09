package G;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f1462a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f1463b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1464c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1465d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1466e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1467f = false;

    public a(Activity activity) {
        this.f1463b = activity;
        this.f1464c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f1463b == activity) {
            this.f1463b = null;
            this.f1466e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f1466e || this.f1467f || this.f1465d) {
            return;
        }
        Object obj = this.f1462a;
        try {
            Object obj2 = b.f1470c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f1464c) {
                b.f1474g.postAtFrontOfQueue(new A1.d(b.f1469b.get(activity), obj2, 8, false));
                this.f1467f = true;
                this.f1462a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f1463b == activity) {
            this.f1465d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

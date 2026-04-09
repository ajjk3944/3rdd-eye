package r3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f32731a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f32732b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32733c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32734d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32735e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32736f = false;

    public c(Activity activity) {
        this.f32732b = activity;
        this.f32733c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f32732b == activity) {
            this.f32732b = null;
            this.f32735e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f32735e || this.f32736f || this.f32734d) {
            return;
        }
        Object obj = this.f32731a;
        try {
            Object obj2 = d.f32739c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f32733c) {
                d.g.postAtFrontOfQueue(new fb.r(10, d.f32738b.get(activity), obj2));
                this.f32736f = true;
                this.f32731a = null;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f32732b == activity) {
            this.f32734d = true;
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

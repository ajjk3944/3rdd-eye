package g3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f9277a;

    /* renamed from: d, reason: collision with root package name */
    public Activity f9278d;

    /* renamed from: g, reason: collision with root package name */
    public final int f9279g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9280r = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9281x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9282y = false;

    public c(Activity activity) {
        this.f9278d = activity;
        this.f9279g = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9278d == activity) {
            this.f9278d = null;
            this.f9281x = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f9281x || this.f9282y || this.f9280r) {
            return;
        }
        Object obj = this.f9277a;
        try {
            Object obj2 = d.f9285c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f9279g) {
                d.f9289g.postAtFrontOfQueue(new re.a(d.f9284b.get(activity), 16, obj2));
                this.f9282y = true;
                this.f9277a = null;
            }
        } catch (Throwable th2) {
            e0.c("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f9278d == activity) {
            this.f9280r = true;
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

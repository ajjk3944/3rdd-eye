package J8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: ActivityLifecycleListener.kt */
/* renamed from: J8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0687b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final Class<? extends Activity> f2853b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0686a f2854c;

    public C0687b(Class<? extends Activity> activityClass, AbstractC0686a abstractC0686a) {
        kotlin.jvm.internal.l.f(activityClass, "activityClass");
        this.f2853b = activityClass;
        this.f2854c = abstractC0686a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(outState, "outState");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.onActivitySaveInstanceState(activity, outState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity.getClass().equals(this.f2853b)) {
            this.f2854c.getClass();
        }
    }
}

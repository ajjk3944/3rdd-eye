package w5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import b9.C1992A;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class J implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static final J f47373b = new J();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f47374c;

    /* renamed from: d, reason: collision with root package name */
    public static F f47375d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        F f10 = f47375d;
        if (f10 != null) {
            f10.c(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(activity, "activity");
        F f10 = f47375d;
        if (f10 != null) {
            f10.c(1);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            f47374c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
    }
}

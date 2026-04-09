package o5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class H implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final H f55364a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f55365b;

    /* renamed from: c, reason: collision with root package name */
    private static C7079D f55366c;

    private H() {
    }

    public final void a(C7079D c7079d) {
        f55366c = c7079d;
        if (c7079d == null || !f55365b) {
            return;
        }
        f55365b = false;
        c7079d.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC6492s.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC6492s.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC6492s.i(activity, "activity");
        C7079D c7079d = f55366c;
        if (c7079d != null) {
            c7079d.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Yg.J j10;
        AbstractC6492s.i(activity, "activity");
        C7079D c7079d = f55366c;
        if (c7079d != null) {
            c7079d.k();
            j10 = Yg.J.f24997a;
        } else {
            j10 = null;
        }
        if (j10 == null) {
            f55365b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC6492s.i(activity, "activity");
        AbstractC6492s.i(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC6492s.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC6492s.i(activity, "activity");
    }
}

package tg;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class t0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f22853a;

    public t0(a1 a1Var) {
        br.l.e(a1Var, "sharedSessionRepository");
        this.f22853a = a1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        br.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        br.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        br.l.e(activity, "activity");
        this.f22853a.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        br.l.e(activity, "activity");
        a1 a1Var = this.f22853a;
        a1Var.f22733i = true;
        f0 f0Var = a1Var.f22732h;
        if (f0Var == null) {
            return;
        }
        pq.c cVar = null;
        if (f0Var == null) {
            br.l.l("localSessionData");
            throw null;
        }
        a1Var.f22730f.a();
        if (a1Var.d(f0Var) || a1Var.c(f0Var)) {
            wt.w.s(wt.w.b(a1Var.f22731g), null, null, new a8.h(a1Var, f0Var, cVar, 16), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        br.l.e(activity, "activity");
        br.l.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        br.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        br.l.e(activity, "activity");
    }
}

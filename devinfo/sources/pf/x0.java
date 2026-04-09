package pf;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f31922a;

    public x0(c1 c1Var) {
        nk.k.e(c1Var, "sharedSessionRepository");
        this.f31922a = c1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        nk.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        nk.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        nk.k.e(activity, "activity");
        this.f31922a.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        nk.k.e(activity, "activity");
        c1 c1Var = this.f31922a;
        c1Var.f31788i = true;
        j0 j0Var = c1Var.f31787h;
        if (j0Var == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        ck.c cVar = null;
        if (j0Var == null) {
            nk.k.k("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + c1Var.f31786f.a());
        if (c1Var.d(j0Var) || c1Var.c(j0Var)) {
            xk.x.v(xk.x.b(c1Var.g), null, null, new n(c1Var, j0Var, cVar, 1), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        nk.k.e(activity, "activity");
        nk.k.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        nk.k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        nk.k.e(activity, "activity");
    }
}

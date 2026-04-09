package Y2;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import p4.C2781h;

/* renamed from: Y2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f4325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0207i f4326b;

    public C0205g(C0207i c0207i, Activity activity) {
        this.f4326b = c0207i;
        this.f4325a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C0207i c0207i = this.f4326b;
        Dialog dialog = c0207i.f4334f;
        AtomicReference atomicReference = c0207i.f4338k;
        if (dialog == null || !c0207i.f4339l) {
            return;
        }
        dialog.setOwnerActivity(activity);
        C0214p c0214p = c0207i.f4330b;
        if (c0214p != null) {
            c0214p.f4356a = activity;
        }
        C0205g c0205g = (C0205g) atomicReference.getAndSet(null);
        if (c0205g != null) {
            c0205g.f4326b.f4329a.unregisterActivityLifecycleCallbacks(c0205g);
            C0205g c0205g2 = new C0205g(c0207i, activity);
            c0207i.f4329a.registerActivityLifecycleCallbacks(c0205g2);
            atomicReference.set(c0205g2);
        }
        Dialog dialog2 = c0207i.f4334f;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f4325a) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        C0207i c0207i = this.f4326b;
        if (zIsChangingConfigurations && c0207i.f4339l && (dialog = c0207i.f4334f) != null) {
            dialog.dismiss();
            return;
        }
        Q q3 = new Q(3, "Activity is destroyed.");
        Dialog dialog2 = c0207i.f4334f;
        if (dialog2 != null) {
            dialog2.dismiss();
            c0207i.f4334f = null;
        }
        c0207i.f4330b.f4356a = null;
        C0205g c0205g = (C0205g) c0207i.f4338k.getAndSet(null);
        if (c0205g != null) {
            c0205g.f4326b.f4329a.unregisterActivityLifecycleCallbacks(c0205g);
        }
        C2781h c2781h = (C2781h) c0207i.f4337j.getAndSet(null);
        if (c2781h == null) {
            return;
        }
        c2781h.a(q3.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class au1 implements Application.ActivityLifecycleCallbacks {
    public final Activity f;
    public final /* synthetic */ bw1 g;

    public au1(bw1 bw1Var, Activity activity) {
        this.g = bw1Var;
        this.f = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        bw1 bw1Var = this.g;
        Dialog dialog = bw1Var.f;
        AtomicReference atomicReference = bw1Var.k;
        if (dialog == null || !bw1Var.l) {
            return;
        }
        dialog.setOwnerActivity(activity);
        aa2 aa2Var = bw1Var.b;
        if (aa2Var != null) {
            aa2Var.a = activity;
        }
        au1 au1Var = (au1) atomicReference.getAndSet(null);
        if (au1Var != null) {
            au1Var.g.a.unregisterActivityLifecycleCallbacks(au1Var);
            au1 au1Var2 = new au1(bw1Var, activity);
            bw1Var.a.registerActivityLifecycleCallbacks(au1Var2);
            atomicReference.set(au1Var2);
        }
        Dialog dialog2 = bw1Var.f;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        bw1 bw1Var = this.g;
        if (zIsChangingConfigurations && bw1Var.l && (dialog = bw1Var.f) != null) {
            dialog.dismiss();
            return;
        }
        ah3 ah3Var = new ah3("Activity is destroyed.", 3);
        Dialog dialog2 = bw1Var.f;
        if (dialog2 != null) {
            dialog2.dismiss();
            bw1Var.f = null;
        }
        bw1Var.b.a = null;
        au1 au1Var = (au1) bw1Var.k.getAndSet(null);
        if (au1Var != null) {
            au1Var.g.a.unregisterActivityLifecycleCallbacks(au1Var);
        }
        lz lzVar = (lz) bw1Var.j.getAndSet(null);
        if (lzVar == null) {
            return;
        }
        lzVar.a(ah3Var.a());
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

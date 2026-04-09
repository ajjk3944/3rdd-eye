package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q0 extends k {
    final /* synthetic */ r0 this$0;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class a extends k {
        final /* synthetic */ r0 this$0;

        public a(r0 r0Var) {
            this.this$0 = r0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            nk.k.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            nk.k.e(activity, "activity");
            r0 r0Var = this.this$0;
            int i4 = r0Var.f1173a + 1;
            r0Var.f1173a = i4;
            if (i4 == 1 && r0Var.f1176d) {
                r0Var.f1178f.e(r.ON_START);
                r0Var.f1176d = false;
            }
        }
    }

    public q0(r0 r0Var) {
        this.this$0 = r0Var;
    }

    @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        nk.k.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = u0.f1190b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            nk.k.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((u0) fragmentFindFragmentByTag).f1191a = this.this$0.f1179h;
        }
    }

    @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        nk.k.e(activity, "activity");
        r0 r0Var = this.this$0;
        int i4 = r0Var.f1174b - 1;
        r0Var.f1174b = i4;
        if (i4 == 0) {
            Handler handler = r0Var.f1177e;
            nk.k.b(handler);
            handler.postDelayed(r0Var.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        nk.k.e(activity, "activity");
        p0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        nk.k.e(activity, "activity");
        r0 r0Var = this.this$0;
        int i4 = r0Var.f1173a - 1;
        r0Var.f1173a = i4;
        if (i4 == 0 && r0Var.f1175c) {
            r0Var.f1178f.e(r.ON_STOP);
            r0Var.f1176d = true;
        }
    }
}

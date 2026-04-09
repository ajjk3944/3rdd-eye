package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class h0 extends f {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public static final class a extends f {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            br.l.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            br.l.e(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i10 = processLifecycleOwner.f1465a + 1;
            processLifecycleOwner.f1465a = i10;
            if (i10 == 1 && processLifecycleOwner.f1468r) {
                processLifecycleOwner.f1470y.v1(m.ON_START);
                processLifecycleOwner.f1468r = false;
            }
        }
    }

    public h0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        br.l.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = k0.f1500d;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            br.l.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((k0) fragmentFindFragmentByTag).f1501a = this.this$0.D;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        br.l.e(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f1466d - 1;
        processLifecycleOwner.f1466d = i10;
        if (i10 == 0) {
            Handler handler = processLifecycleOwner.f1469x;
            br.l.b(handler);
            handler.postDelayed(processLifecycleOwner.B, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        br.l.e(activity, "activity");
        g0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        br.l.e(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f1465a - 1;
        processLifecycleOwner.f1465a = i10;
        if (i10 == 0 && processLifecycleOwner.f1467g) {
            processLifecycleOwner.f1470y.v1(m.ON_STOP);
            processLifecycleOwner.f1468r = true;
        }
    }
}

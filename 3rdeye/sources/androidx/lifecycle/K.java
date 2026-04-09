package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.J;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class K extends C1774g {
    final /* synthetic */ J this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a extends C1774g {
        final /* synthetic */ J this$0;

        public a(J j4) {
            this.this$0 = j4;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            J j4 = this.this$0;
            int i = j4.f16050b + 1;
            j4.f16050b = i;
            if (i == 1 && j4.f16053e) {
                j4.f16055g.d(AbstractC1781n.a.ON_START);
                j4.f16053e = false;
            }
        }
    }

    public K(J j4) {
        this.this$0 = j4;
    }

    @Override // androidx.lifecycle.C1774g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = O.f16088c;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.l.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((O) fragmentFindFragmentByTag).f16089b = this.this$0.i;
        }
    }

    @Override // androidx.lifecycle.C1774g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        J j4 = this.this$0;
        int i = j4.f16051c - 1;
        j4.f16051c = i;
        if (i == 0) {
            Handler handler = j4.f16054f;
            kotlin.jvm.internal.l.c(handler);
            handler.postDelayed(j4.f16056h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        J.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.C1774g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        J j4 = this.this$0;
        int i = j4.f16050b - 1;
        j4.f16050b = i;
        if (i == 0 && j4.f16052d) {
            j4.f16055g.d(AbstractC1781n.a.ON_STOP);
            j4.f16053e = true;
        }
    }
}

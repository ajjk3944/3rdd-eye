package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class H extends AbstractC0285g {
    final /* synthetic */ I this$0;

    public static final class a extends AbstractC0285g {
        final /* synthetic */ I this$0;

        public a(I i) {
            this.this$0 = i;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            q5.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            q5.i.e(activity, "activity");
            I i = this.this$0;
            int i3 = i.f5186a + 1;
            i.f5186a = i3;
            if (i3 == 1 && i.f5189d) {
                i.f5191f.d(EnumC0291m.ON_START);
                i.f5189d = false;
            }
        }
    }

    public H(I i) {
        this.this$0 = i;
    }

    @Override // androidx.lifecycle.AbstractC0285g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        q5.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = L.f5194b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            q5.i.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((L) fragmentFindFragmentByTag).f5195a = this.this$0.f5193h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0285g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        q5.i.e(activity, "activity");
        I i = this.this$0;
        int i3 = i.f5187b - 1;
        i.f5187b = i3;
        if (i3 == 0) {
            Handler handler = i.f5190e;
            q5.i.b(handler);
            handler.postDelayed(i.f5192g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        q5.i.e(activity, "activity");
        G.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0285g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q5.i.e(activity, "activity");
        I i = this.this$0;
        int i3 = i.f5186a - 1;
        i.f5186a = i3;
        if (i3 == 0 && i.f5188c) {
            i.f5191f.d(EnumC0291m.ON_STOP);
            i.f5189d = true;
        }
    }
}

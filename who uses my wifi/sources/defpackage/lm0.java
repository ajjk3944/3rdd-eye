package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lm0 extends ks {
    final /* synthetic */ mm0 this$0;

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static final class a extends ks {
        final /* synthetic */ mm0 this$0;

        public a(mm0 mm0Var) {
            this.this$0 = mm0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            i30.m(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            i30.m(activity, "activity");
            mm0 mm0Var = this.this$0;
            int i = mm0Var.f + 1;
            mm0Var.f = i;
            if (i == 1 && mm0Var.i) {
                mm0Var.k.d(t50.ON_START);
                mm0Var.i = false;
            }
        }
    }

    public lm0(mm0 mm0Var) {
        this.this$0 = mm0Var;
    }

    @Override // defpackage.ks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i30.m(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = op0.g;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            i30.k(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((op0) fragmentFindFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.ks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        i30.m(activity, "activity");
        mm0 mm0Var = this.this$0;
        int i = mm0Var.g - 1;
        mm0Var.g = i;
        if (i == 0) {
            Handler handler = mm0Var.j;
            i30.j(handler);
            handler.postDelayed(mm0Var.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        i30.m(activity, "activity");
        km0.a(activity, new a(this.this$0));
    }

    @Override // defpackage.ks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        i30.m(activity, "activity");
        mm0 mm0Var = this.this$0;
        int i = mm0Var.f - 1;
        mm0Var.f = i;
        if (i == 0 && mm0Var.h) {
            mm0Var.k.d(t50.ON_STOP);
            mm0Var.i = true;
        }
    }
}

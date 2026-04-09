package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class u0 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1190b = 0;

    /* renamed from: a, reason: collision with root package name */
    public i1 f1191a;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final t0 Companion = new t0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            t0.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            nk.k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            nk.k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            nk.k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            nk.k.e(activity, "activity");
            int i4 = u0.f1190b;
            s0.a(activity, r.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            nk.k.e(activity, "activity");
            int i4 = u0.f1190b;
            s0.a(activity, r.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            nk.k.e(activity, "activity");
            int i4 = u0.f1190b;
            s0.a(activity, r.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            nk.k.e(activity, "activity");
            int i4 = u0.f1190b;
            s0.a(activity, r.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            nk.k.e(activity, "activity");
            int i4 = u0.f1190b;
            s0.a(activity, r.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            nk.k.e(activity, "activity");
            int i4 = u0.f1190b;
            s0.a(activity, r.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            nk.k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            nk.k.e(activity, "activity");
            nk.k.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            nk.k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            nk.k.e(activity, "activity");
        }
    }

    public final void a(r rVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            nk.k.d(activity, "getActivity(...)");
            s0.a(activity, rVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(r.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(r.ON_DESTROY);
        this.f1191a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(r.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        i1 i1Var = this.f1191a;
        if (i1Var != null) {
            ((r0) i1Var.f1151a).a();
        }
        a(r.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        i1 i1Var = this.f1191a;
        if (i1Var != null) {
            r0 r0Var = (r0) i1Var.f1151a;
            int i4 = r0Var.f1173a + 1;
            r0Var.f1173a = i4;
            if (i4 == 1 && r0Var.f1176d) {
                r0Var.f1178f.e(r.ON_START);
                r0Var.f1176d = false;
            }
        }
        a(r.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(r.ON_STOP);
    }
}

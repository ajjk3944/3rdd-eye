package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class op0 extends Fragment {
    public static final /* synthetic */ int g = 0;
    public of3 f;

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final np0 Companion = new np0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            i30.m(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            i30.m(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            i30.m(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            i30.m(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            i30.m(activity, "activity");
            int i = op0.g;
            mp0.a(activity, t50.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            i30.m(activity, "activity");
            int i = op0.g;
            mp0.a(activity, t50.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            i30.m(activity, "activity");
            int i = op0.g;
            mp0.a(activity, t50.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            i30.m(activity, "activity");
            int i = op0.g;
            mp0.a(activity, t50.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            i30.m(activity, "activity");
            int i = op0.g;
            mp0.a(activity, t50.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            i30.m(activity, "activity");
            int i = op0.g;
            mp0.a(activity, t50.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            i30.m(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            i30.m(activity, "activity");
            i30.m(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            i30.m(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            i30.m(activity, "activity");
        }
    }

    public final void a(t50 t50Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            i30.l(activity, "getActivity(...)");
            mp0.a(activity, t50Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(t50.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(t50.ON_DESTROY);
        this.f = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(t50.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        of3 of3Var = this.f;
        if (of3Var != null) {
            ((mm0) of3Var.g).b();
        }
        a(t50.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        of3 of3Var = this.f;
        if (of3Var != null) {
            mm0 mm0Var = (mm0) of3Var.g;
            int i = mm0Var.f + 1;
            mm0Var.f = i;
            if (i == 1 && mm0Var.i) {
                mm0Var.k.d(t50.ON_START);
                mm0Var.i = false;
            }
        }
        a(t50.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(t50.ON_STOP);
    }
}

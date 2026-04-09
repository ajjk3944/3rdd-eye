package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class L extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5194b = 0;

    /* renamed from: a, reason: collision with root package name */
    public A0.e f5195a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final K Companion = new K();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            q5.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            q5.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            q5.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            q5.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            q5.i.e(activity, "activity");
            int i = L.f5194b;
            J.a(activity, EnumC0291m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            q5.i.e(activity, "activity");
            int i = L.f5194b;
            J.a(activity, EnumC0291m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            q5.i.e(activity, "activity");
            int i = L.f5194b;
            J.a(activity, EnumC0291m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            q5.i.e(activity, "activity");
            int i = L.f5194b;
            J.a(activity, EnumC0291m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            q5.i.e(activity, "activity");
            int i = L.f5194b;
            J.a(activity, EnumC0291m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            q5.i.e(activity, "activity");
            int i = L.f5194b;
            J.a(activity, EnumC0291m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            q5.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            q5.i.e(activity, "activity");
            q5.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            q5.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            q5.i.e(activity, "activity");
        }
    }

    public final void a(EnumC0291m enumC0291m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            q5.i.d(activity, "activity");
            J.a(activity, enumC0291m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0291m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0291m.ON_DESTROY);
        this.f5195a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0291m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A0.e eVar = this.f5195a;
        if (eVar != null) {
            ((I) eVar.f73b).a();
        }
        a(EnumC0291m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A0.e eVar = this.f5195a;
        if (eVar != null) {
            I i = (I) eVar.f73b;
            int i3 = i.f5186a + 1;
            i.f5186a = i3;
            if (i3 == 1 && i.f5189d) {
                i.f5191f.d(EnumC0291m.ON_START);
                i.f5189d = false;
            }
        }
        a(EnumC0291m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0291m.ON_STOP);
    }
}

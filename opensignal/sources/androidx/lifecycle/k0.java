package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/k0;", "Landroid/app/Fragment;", "<init>", "()V", "b9/c", "a", "androidx/lifecycle/i0", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class k0 extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1500d = 0;

    /* renamed from: a, reason: collision with root package name */
    public b9.c f1501a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final j0 Companion = new j0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            br.l.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            br.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            br.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            br.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            br.l.e(activity, "activity");
            int i10 = k0.f1500d;
            i0.a(activity, m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            br.l.e(activity, "activity");
            int i10 = k0.f1500d;
            i0.a(activity, m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            br.l.e(activity, "activity");
            int i10 = k0.f1500d;
            i0.a(activity, m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            br.l.e(activity, "activity");
            int i10 = k0.f1500d;
            i0.a(activity, m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            br.l.e(activity, "activity");
            int i10 = k0.f1500d;
            i0.a(activity, m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            br.l.e(activity, "activity");
            int i10 = k0.f1500d;
            i0.a(activity, m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            br.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            br.l.e(activity, "activity");
            br.l.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            br.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            br.l.e(activity, "activity");
        }
    }

    public final void a(m mVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            br.l.d(activity, "getActivity(...)");
            i0.a(activity, mVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(m.ON_DESTROY);
        this.f1501a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        b9.c cVar = this.f1501a;
        if (cVar != null) {
            ((ProcessLifecycleOwner) cVar.f2478d).a();
        }
        a(m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        b9.c cVar = this.f1501a;
        if (cVar != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) cVar.f2478d;
            int i10 = processLifecycleOwner.f1465a + 1;
            processLifecycleOwner.f1465a = i10;
            if (i10 == 1 && processLifecycleOwner.f1468r) {
                processLifecycleOwner.f1470y.v1(m.ON_START);
                processLifecycleOwner.f1468r = false;
            }
        }
        a(m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(m.ON_STOP);
    }
}

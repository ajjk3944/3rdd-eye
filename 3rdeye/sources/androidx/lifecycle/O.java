package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.J;

/* compiled from: ReportFragment.android.kt */
/* loaded from: classes.dex */
public class O extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16088c = 0;

    /* renamed from: b, reason: collision with root package name */
    public J.b f16089b;

    /* compiled from: ReportFragment.android.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(Activity activity, AbstractC1781n.a event) {
            kotlin.jvm.internal.l.f(event, "event");
            if (activity instanceof InterfaceC1792z) {
                ((InterfaceC1792z) activity).getLifecycle().d(event);
            } else if (activity instanceof InterfaceC1790x) {
                AbstractC1781n lifecycle = ((InterfaceC1790x) activity).getLifecycle();
                if (lifecycle instanceof C1791y) {
                    ((C1791y) lifecycle).d(event);
                }
            }
        }

        public static void b(Activity activity) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new b());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new O(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.android.kt */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* compiled from: ReportFragment.android.kt */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.l.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            a.a(activity, AbstractC1781n.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            a.a(activity, AbstractC1781n.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            a.a(activity, AbstractC1781n.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            a.a(activity, AbstractC1781n.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            a.a(activity, AbstractC1781n.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            a.a(activity, AbstractC1781n.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f(activity, "activity");
            kotlin.jvm.internal.l.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }
    }

    public final void a(AbstractC1781n.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.l.e(activity, "activity");
            a.a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(AbstractC1781n.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(AbstractC1781n.a.ON_DESTROY);
        this.f16089b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(AbstractC1781n.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        J.b bVar = this.f16089b;
        if (bVar != null) {
            J.this.a();
        }
        a(AbstractC1781n.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        J.b bVar = this.f16089b;
        if (bVar != null) {
            J j4 = J.this;
            int i = j4.f16050b + 1;
            j4.f16050b = i;
            if (i == 1 && j4.f16053e) {
                j4.f16055g.d(AbstractC1781n.a.ON_START);
                j4.f16053e = false;
            }
        }
        a(AbstractC1781n.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(AbstractC1781n.a.ON_STOP);
    }
}

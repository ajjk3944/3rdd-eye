package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import br.l;
import i.j;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.t;
import io.sentry.v3;
import io.sentry.x5;
import io.sentry.z4;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import mq.y;
import o4.b0;
import o4.j0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/q1;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/b;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11813a;

    /* renamed from: d, reason: collision with root package name */
    public final Set f11814d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11815g;

    /* renamed from: r, reason: collision with root package name */
    public v3 f11816r;

    /* renamed from: x, reason: collision with root package name */
    public x5 f11817x;

    static {
        z4.d().b("maven:io.sentry:sentry-android-fragment", "8.25.0");
    }

    public FragmentLifecycleIntegration(Application application, Set<? extends b> set, boolean z10) {
        l.e(application, "application");
        l.e(set, "filterFragmentLifecycleBreadcrumbs");
        this.f11813a = application;
        this.f11814d = set;
        this.f11815g = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11813a.unregisterActivityLifecycleCallbacks(this);
        x5 x5Var = this.f11817x;
        if (x5Var != null) {
            if (x5Var != null) {
                x5Var.getLogger().m(b5.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
            } else {
                l.l("options");
                throw null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j0 j0VarO;
        l.e(activity, "activity");
        j jVar = activity instanceof j ? (j) activity : null;
        if (jVar == null || (j0VarO = jVar.o()) == null) {
            return;
        }
        v3 v3Var = this.f11816r;
        if (v3Var == null) {
            l.l("scopes");
            throw null;
        }
        d dVar = new d(v3Var, this.f11814d, this.f11815g);
        t tVar = j0VarO.f1448o;
        tVar.getClass();
        ((CopyOnWriteArrayList) tVar.f12737d).add(new b0(dVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.e(activity, "activity");
        l.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        this.f11816r = v3.f12830a;
        this.f11817x = x5Var;
        this.f11813a.registerActivityLifecycleCallbacks(this);
        x5Var.getLogger().m(b5.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        ic.a.b("FragmentLifecycle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends b>) b.states, false);
        l.e(application, "application");
        b.Companion.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z10, boolean z11) {
        l.e(application, "application");
        b.Companion.getClass();
        Set set = z10 ? b.states : null;
        this(application, (Set<? extends b>) (set == null ? y.f16947a : set), z11);
    }
}

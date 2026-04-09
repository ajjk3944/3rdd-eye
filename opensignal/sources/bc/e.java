package bc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o4.j0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2596a;

    public e(f fVar) {
        this.f2596a = fVar;
    }

    public static f b(Activity activity) {
        d0 d0Var;
        g0 g0Var;
        cc.s.i(activity, "Activity must not be null");
        if (!(activity instanceof i.j)) {
            WeakHashMap weakHashMap = d0.f2594d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (d0Var = (d0) weakReference.get()) != null) {
                return d0Var;
            }
            try {
                d0 d0Var2 = (d0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (d0Var2 == null || d0Var2.isRemoving()) {
                    d0Var2 = new d0();
                    activity.getFragmentManager().beginTransaction().add(d0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(d0Var2));
                return d0Var2;
            } catch (ClassCastException e4) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
            }
        }
        i.j jVar = (i.j) activity;
        WeakHashMap weakHashMap2 = g0.f2607x0;
        j0 j0VarO = jVar.o();
        WeakHashMap weakHashMap3 = g0.f2607x0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(jVar);
        if (weakReference2 != null && (g0Var = (g0) weakReference2.get()) != null) {
            return g0Var;
        }
        try {
            g0 g0Var2 = (g0) j0VarO.E("SLifecycleFragmentImpl");
            if (g0Var2 == null || g0Var2.I) {
                g0Var2 = new g0();
                o4.a aVar = new o4.a(j0VarO);
                aVar.g(0, g0Var2, "SLifecycleFragmentImpl", 1);
                aVar.f(true, true);
            }
            weakHashMap3.put(jVar, new WeakReference(g0Var2));
            return g0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bc.f, java.lang.Object] */
    public final Activity a() {
        Activity activityE = this.f2596a.e();
        cc.s.h(activityE);
        return activityE;
    }

    public abstract void h();

    public void e() {
    }

    public void g() {
    }

    public void d(Bundle bundle) {
    }

    public void f(Bundle bundle) {
    }

    public void c(int i10, int i11, Intent intent) {
    }
}

package androidx.lifecycle;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import wt.i1;

/* loaded from: classes.dex */
public abstract class o0 implements t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.hints.i f1506d;

    /* renamed from: g, reason: collision with root package name */
    public static final sm.f f1507g;

    /* renamed from: a, reason: collision with root package name */
    public static final et.d f1505a = new et.d();

    /* renamed from: r, reason: collision with root package name */
    public static final sm.m f1508r = new sm.m();

    /* renamed from: x, reason: collision with root package name */
    public static final cg.e f1509x = new cg.e();

    static {
        int i10 = 1;
        f1506d = new io.sentry.hints.i(i10);
        f1507g = new sm.f(i10);
    }

    public static final void a(s0 s0Var, io.sentry.t tVar, o oVar) {
        AutoCloseable autoCloseable;
        br.l.e(tVar, "registry");
        br.l.e(oVar, "lifecycle");
        w4.a aVar = s0Var.f1522a;
        if (aVar != null) {
            synchronized (aVar.f24194a) {
                autoCloseable = (AutoCloseable) aVar.f24195b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void b(l7.e eVar) {
        l7.d dVar;
        n nVarE1 = eVar.h().e1();
        if (nVarE1 != n.INITIALIZED && nVarE1 != n.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        n7.b bVar = (n7.b) eVar.f().f12736a;
        synchronized (bVar.f17390c) {
            Iterator it = bVar.f17391d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                l7.d dVar2 = (l7.d) entry.getValue();
                if (br.l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        if (dVar == null) {
            q0 q0Var = new q0(eVar.f(), (w0) eVar);
            eVar.f().H("androidx.lifecycle.internal.SavedStateHandlesProvider", q0Var);
            eVar.h().V0(new l7.b(2, q0Var));
        }
    }

    public static final v c(View view) {
        br.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(u4.a.view_tree_lifecycle_owner);
            v vVar = tag instanceof v ? (v) tag : null;
            if (vVar != null) {
                return vVar;
            }
            Object objB = se.b.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final q d(v vVar) {
        o oVarH = vVar.h();
        br.l.e(oVarH, "<this>");
        a2.g gVar = (a2.g) oVarH.f1504d;
        while (true) {
            q qVar = (q) ((AtomicReference) gVar.f31a).get();
            if (qVar != null) {
                return qVar;
            }
            i1 i1VarC = wt.w.c();
            du.f fVar = wt.d0.f24610a;
            q qVar2 = new q(oVarH, se.b.M(i1VarC, bu.n.f2983a.f25527y));
            AtomicReference atomicReference = (AtomicReference) gVar.f31a;
            do {
                pq.c cVar = null;
                if (atomicReference.compareAndSet(null, qVar2)) {
                    du.f fVar2 = wt.d0.f24610a;
                    wt.w.s(qVar2, bu.n.f2983a.f25527y, null, new p(qVar2, cVar, 0), 2);
                    return qVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final r0 e(w0 w0Var) {
        n0 n0Var = new n0();
        v4.b bVarA = w0Var instanceof h ? ((h) w0Var).a() : v4.a.f23842b;
        br.l.e(bVarA, "extras");
        v0 v0VarD = w0Var.d();
        br.l.e(v0VarD, "store");
        return (r0) new js.e(v0VarD, n0Var, bVarA).d0(br.x.f2918a.b(r0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, v vVar) {
        br.l.e(view, "<this>");
        view.setTag(u4.a.view_tree_lifecycle_owner, vVar);
    }
}

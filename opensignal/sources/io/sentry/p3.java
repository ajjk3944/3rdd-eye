package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class p3 implements z0 {
    public volatile Object B;
    public final ConcurrentHashMap D;
    public final ConcurrentHashMap E;
    public final CopyOnWriteArrayList F;
    public volatile x5 G;
    public volatile i6 H;
    public final io.sentry.util.a I;
    public final io.sentry.util.a J;
    public final io.sentry.util.a K;
    public final io.sentry.protocol.c L;
    public final CopyOnWriteArrayList M;
    public k N;
    public io.sentry.protocol.t O;
    public d1 P;
    public final Map Q;

    /* renamed from: a, reason: collision with root package name */
    public k1 f12492a;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f12493d;

    /* renamed from: g, reason: collision with root package name */
    public io.sentry.protocol.e0 f12494g;

    /* renamed from: r, reason: collision with root package name */
    public String f12495r;

    /* renamed from: x, reason: collision with root package name */
    public io.sentry.protocol.n f12496x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f12497y;

    public p3(x5 x5Var) {
        this.f12493d = new WeakReference(null);
        this.f12497y = new ArrayList();
        this.D = new ConcurrentHashMap();
        this.E = new ConcurrentHashMap();
        this.F = new CopyOnWriteArrayList();
        this.I = new io.sentry.util.a();
        this.J = new io.sentry.util.a();
        this.K = new io.sentry.util.a();
        this.L = new io.sentry.protocol.c();
        this.M = new CopyOnWriteArrayList();
        this.O = io.sentry.protocol.t.f12636d;
        this.P = q2.f12669a;
        this.Q = Collections.synchronizedMap(new WeakHashMap());
        ir.f0.T(x5Var, "SentryOptions is required.");
        this.G = x5Var;
        this.B = a(this.G.getMaxBreadcrumbs());
        this.N = new k(1);
    }

    public static Queue a(int i10) {
        return i10 > 0 ? new p6(new g(i10)) : new y();
    }

    @Override // io.sentry.z0
    public final List A() {
        return this.F;
    }

    @Override // io.sentry.z0
    public final List B() {
        return new CopyOnWriteArrayList(this.M);
    }

    @Override // io.sentry.z0
    public final void C(t4 t4Var) {
        i1 i1Var;
        if (!this.G.isTracingEnabled() || t4Var.a() == null) {
            return;
        }
        Map map = this.Q;
        Throwable thA = t4Var.a();
        ir.f0.T(thA, "throwable cannot be null");
        while (thA.getCause() != null && thA.getCause() != thA) {
            thA = thA.getCause();
        }
        io.sentry.util.f fVar = (io.sentry.util.f) map.get(thA);
        if (fVar != null) {
            WeakReference weakReference = fVar.f12808a;
            if (t4Var.f12269d.h() == null && (i1Var = (i1) weakReference.get()) != null) {
                t4Var.f12269d.t(i1Var.t());
            }
            String str = (String) fVar.f12809b;
            if (t4Var.R != null || str == null) {
                return;
            }
            t4Var.R = str;
        }
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.c D() {
        return this.L;
    }

    @Override // io.sentry.z0
    public final k E(m3 m3Var) {
        q qVarA = this.K.a();
        try {
            m3Var.f(this.N);
            k kVar = new k(this.N);
            qVarA.close();
            return kVar;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final String F() {
        return this.f12495r;
    }

    @Override // io.sentry.z0
    public final void G(o3 o3Var) {
        q qVarA = this.J.a();
        try {
            o3Var.d(this.f12492a);
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final void H(io.sentry.protocol.t tVar) {
    }

    @Override // io.sentry.z0
    public final void I(k1 k1Var) {
        q qVarA = this.J.a();
        try {
            this.f12492a = k1Var;
            for (a1 a1Var : this.G.getScopeObservers()) {
                if (k1Var != null) {
                    a1Var.r(k1Var.getName());
                    a1Var.p(k1Var.t(), this);
                } else {
                    a1Var.r(null);
                    a1Var.p(null, this);
                }
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final List J() {
        return this.f12497y;
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.e0 K() {
        return this.f12494g;
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.n L() {
        return this.f12496x;
    }

    @Override // io.sentry.z0
    public final List M() {
        return com.google.android.gms.internal.measurement.i4.K(this.F);
    }

    @Override // io.sentry.z0
    public final String N() {
        k1 k1Var = this.f12492a;
        if (k1Var != null) {
            return k1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.z0
    public final void b(String str, String str2) {
        this.D.put(str, str2);
        for (a1 a1Var : this.G.getScopeObservers()) {
            a1Var.b(str, str2);
            a1Var.o(this.D);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.z0
    public final void clear() {
        this.f12494g = null;
        this.f12496x = null;
        this.f12495r = null;
        this.f12497y.clear();
        this.B.clear();
        Iterator<a1> it = this.G.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(this.B);
        }
        this.D.clear();
        this.E.clear();
        this.F.clear();
        q();
        this.M.clear();
    }

    @Override // io.sentry.z0
    public final z0 clone() {
        return new p3(this);
    }

    @Override // io.sentry.z0
    public final void f(Throwable th2, j6 j6Var, String str) {
        ir.f0.T(th2, "throwable is required");
        ir.f0.T(str, "transactionName is required");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        Map map = this.Q;
        if (map.containsKey(th2)) {
            return;
        }
        map.put(th2, new io.sentry.util.f(new WeakReference(j6Var), str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.z0
    public final void g(e eVar, h0 h0Var) {
        if (eVar == null || (this.B instanceof y)) {
            return;
        }
        if (h0Var == null) {
            new h0();
        }
        this.G.getBeforeBreadcrumb();
        this.B.add(eVar);
        for (a1 a1Var : this.G.getScopeObservers()) {
            a1Var.m(eVar);
            a1Var.n(this.B);
        }
    }

    @Override // io.sentry.z0
    public final Map getExtras() {
        return this.E;
    }

    @Override // io.sentry.z0
    public final i1 h() {
        i1 i1VarN;
        i1 i1Var = (i1) this.f12493d.get();
        if (i1Var != null) {
            return i1Var;
        }
        k1 k1Var = this.f12492a;
        return (k1Var == null || (i1VarN = k1Var.n()) == null) ? k1Var : i1VarN;
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.t i() {
        return this.O;
    }

    @Override // io.sentry.z0
    public final void j(io.sentry.protocol.t tVar) {
        this.O = tVar;
        Iterator<a1> it = this.G.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(tVar);
        }
    }

    @Override // io.sentry.z0
    public final x5 k() {
        return this.G;
    }

    @Override // io.sentry.z0
    public final k1 l() {
        return this.f12492a;
    }

    @Override // io.sentry.z0
    public final i6 o() {
        q qVarA = this.I.a();
        try {
            i6 i6Var = null;
            if (this.H != null) {
                i6 i6Var2 = this.H;
                i6Var2.getClass();
                i6Var2.b(dr.a.q());
                this.G.getContinuousProfiler().r();
                i6 i6VarClone = this.H.clone();
                this.H = null;
                i6Var = i6VarClone;
            }
            qVarA.close();
            return i6Var;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final t p() {
        q qVarA = this.I.a();
        try {
            if (this.H != null) {
                i6 i6Var = this.H;
                i6Var.getClass();
                i6Var.b(dr.a.q());
                this.G.getContinuousProfiler().r();
            }
            i6 i6Var2 = this.H;
            t tVar = null;
            if (this.G.getRelease() != null) {
                String distinctId = this.G.getDistinctId();
                io.sentry.protocol.e0 e0Var = this.f12494g;
                this.H = new i6(h6.Ok, dr.a.q(), dr.a.q(), 0, distinctId, io.sentry.config.a.R(), Boolean.TRUE, null, null, e0Var != null ? e0Var.f12537r : null, null, this.G.getEnvironment(), this.G.getRelease(), null);
                tVar = new t((Object) this.H.clone(), (Object) (i6Var2 != null ? i6Var2.clone() : null), false);
            } else {
                this.G.getLogger().m(b5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            qVarA.close();
            return tVar;
        } catch (Throwable th2) {
            try {
                qVarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.z0
    public final void q() {
        q qVarA = this.J.a();
        try {
            this.f12492a = null;
            qVarA.close();
            for (a1 a1Var : this.G.getScopeObservers()) {
                a1Var.r(null);
                a1Var.p(null, this);
            }
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final i6 r() {
        return this.H;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.z0
    public final Queue s() {
        return this.B;
    }

    @Override // io.sentry.z0
    public final void t(k kVar) {
        this.N = kVar;
        k6 k6Var = new k6((io.sentry.protocol.t) kVar.f12397d, (n6) kVar.f12398g, "default", null);
        k6Var.E = "auto";
        Iterator<a1> it = this.G.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().p(k6Var, this);
        }
    }

    @Override // io.sentry.z0
    public final b5 u() {
        return null;
    }

    @Override // io.sentry.z0
    public final k v() {
        return this.N;
    }

    @Override // io.sentry.z0
    public final i6 w(n3 n3Var) {
        q qVarA = this.I.a();
        try {
            n3Var.c(this.H);
            i6 i6VarClone = this.H != null ? this.H.clone() : null;
            qVarA.close();
            return i6VarClone;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final void x(String str) {
        this.f12495r = str;
        io.sentry.protocol.c cVar = this.L;
        io.sentry.protocol.a aVarD = cVar.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            cVar.l(aVarD);
        }
        if (str == null) {
            aVarD.E = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.E = arrayList;
        }
        Iterator<a1> it = this.G.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().q(cVar);
        }
    }

    @Override // io.sentry.z0
    public final d1 y() {
        return this.P;
    }

    @Override // io.sentry.z0
    public final Map z() {
        return com.google.android.gms.internal.measurement.b4.O(this.D);
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m42clone() {
        return new p3(this);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.Collection] */
    public p3(p3 p3Var) {
        io.sentry.protocol.e0 e0Var;
        io.sentry.protocol.n nVar = null;
        this.f12493d = new WeakReference(null);
        this.f12497y = new ArrayList();
        this.D = new ConcurrentHashMap();
        this.E = new ConcurrentHashMap();
        this.F = new CopyOnWriteArrayList();
        this.I = new io.sentry.util.a();
        this.J = new io.sentry.util.a();
        this.K = new io.sentry.util.a();
        this.L = new io.sentry.protocol.c();
        this.M = new CopyOnWriteArrayList();
        this.O = io.sentry.protocol.t.f12636d;
        this.P = q2.f12669a;
        this.Q = Collections.synchronizedMap(new WeakHashMap());
        this.f12492a = p3Var.f12492a;
        this.H = p3Var.H;
        this.G = p3Var.G;
        this.P = p3Var.P;
        io.sentry.protocol.e0 e0Var2 = p3Var.f12494g;
        if (e0Var2 != null) {
            e0Var = new io.sentry.protocol.e0();
            e0Var.f12534a = e0Var2.f12534a;
            e0Var.f12536g = e0Var2.f12536g;
            e0Var.f12535d = e0Var2.f12535d;
            e0Var.f12537r = e0Var2.f12537r;
            e0Var.f12538x = e0Var2.f12538x;
            e0Var.f12539y = e0Var2.f12539y;
            e0Var.B = com.google.android.gms.internal.measurement.b4.O(e0Var2.B);
            e0Var.D = com.google.android.gms.internal.measurement.b4.O(e0Var2.D);
        } else {
            e0Var = null;
        }
        this.f12494g = e0Var;
        this.f12495r = p3Var.f12495r;
        this.O = p3Var.O;
        io.sentry.protocol.n nVar2 = p3Var.f12496x;
        if (nVar2 != null) {
            nVar = new io.sentry.protocol.n();
            nVar.f12596a = nVar2.f12596a;
            nVar.f12600x = nVar2.f12600x;
            nVar.f12597d = nVar2.f12597d;
            nVar.f12598g = nVar2.f12598g;
            nVar.f12601y = com.google.android.gms.internal.measurement.b4.O(nVar2.f12601y);
            nVar.B = com.google.android.gms.internal.measurement.b4.O(nVar2.B);
            nVar.E = com.google.android.gms.internal.measurement.b4.O(nVar2.E);
            nVar.H = com.google.android.gms.internal.measurement.b4.O(nVar2.H);
            nVar.f12599r = nVar2.f12599r;
            nVar.F = nVar2.F;
            nVar.D = nVar2.D;
            nVar.G = nVar2.G;
        }
        this.f12496x = nVar;
        this.f12497y = new ArrayList(p3Var.f12497y);
        this.F = new CopyOnWriteArrayList(p3Var.F);
        e[] eVarArr = (e[]) p3Var.B.toArray(new e[0]);
        Queue queueA = a(p3Var.G.getMaxBreadcrumbs());
        for (e eVar : eVarArr) {
            queueA.add(new e(eVar));
        }
        this.B = queueA;
        ConcurrentHashMap concurrentHashMap = p3Var.D;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.D = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = p3Var.E;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.E = concurrentHashMap4;
        this.L = new io.sentry.protocol.c(p3Var.L);
        this.M = new CopyOnWriteArrayList(p3Var.M);
        this.N = new k(p3Var.N);
    }
}

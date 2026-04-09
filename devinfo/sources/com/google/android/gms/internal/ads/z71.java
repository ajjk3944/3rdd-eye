package com.google.android.gms.internal.ads;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class z71 extends c81 {

    /* renamed from: o, reason: collision with root package name */
    public static final v81 f19033o = new v81(0, z71.class);

    /* renamed from: l, reason: collision with root package name */
    public t41 f19034l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f19035m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f19036n;

    public z71(t41 t41Var, boolean z3, boolean z10) {
        int size = t41Var.size();
        this.f10017h = null;
        this.f10018i = size;
        this.f19034l = t41Var;
        this.f19035m = z3;
        this.f19036n = z10;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final void g() {
        t41 t41Var = this.f19034l;
        s(1);
        if ((t41Var != null) && (this.f17113a instanceof f71)) {
            boolean zM = m();
            h61 h61VarA = t41Var.a();
            while (h61VarA.hasNext()) {
                ((Future) h61VarA.next()).cancel(zM);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String h() {
        t41 t41Var = this.f19034l;
        return t41Var != null ? "futures=".concat(t41Var.toString()) : super.h();
    }

    public abstract void s(int i4);

    public final void t(int i4, vd.b bVar) {
        try {
            if (bVar.isCancelled()) {
                this.f19034l = null;
                cancel(false);
            } else {
                try {
                    x(i4, mq0.d(bVar));
                } catch (ExecutionException e2) {
                    u(e2.getCause());
                } catch (Throwable th2) {
                    u(th2);
                }
            }
        } finally {
            v(null);
        }
    }

    public final void u(Throwable th2) {
        th2.getClass();
        if (this.f19035m && !f(th2)) {
            Set set = this.f10017h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f17113a instanceof f71)) {
                    Throwable thB = b();
                    Objects.requireNonNull(thB);
                    while (thB != null && setNewSetFromMap.add(thB)) {
                        thB = thB.getCause();
                    }
                }
                c81.j.p(this, setNewSetFromMap);
                Set set2 = this.f10017h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f19033o.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
            return;
        }
        boolean z3 = th2 instanceof Error;
        if (z3) {
            f19033o.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z3 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
        }
    }

    public final void v(t41 t41Var) {
        int iT = c81.j.t(this);
        int i4 = 0;
        mq0.d0("Less than 0 remaining futures", iT >= 0);
        if (iT == 0) {
            if (t41Var != null) {
                h61 h61VarA = t41Var.a();
                while (h61VarA.hasNext()) {
                    Future future = (Future) h61VarA.next();
                    if (!future.isCancelled()) {
                        try {
                            x(i4, mq0.d(future));
                        } catch (ExecutionException e2) {
                            u(e2.getCause());
                        } catch (Throwable th2) {
                            u(th2);
                        }
                    }
                    i4++;
                }
            }
            this.f10017h = null;
            y();
            s(2);
        }
    }

    public final void w() {
        Objects.requireNonNull(this.f19034l);
        if (this.f19034l.isEmpty()) {
            y();
            return;
        }
        boolean z3 = this.f19035m;
        k81 k81Var = k81.f13081a;
        if (z3) {
            h61 h61VarA = this.f19034l.a();
            int i4 = 0;
            while (h61VarA.hasNext()) {
                vd.b bVar = (vd.b) h61VarA.next();
                int i10 = i4 + 1;
                if (bVar.isDone()) {
                    t(i4, bVar);
                } else {
                    bVar.a(new af0(this, i4, bVar, 1), k81Var);
                }
                i4 = i10;
            }
            return;
        }
        t41 t41Var = this.f19034l;
        t41 t41Var2 = true != this.f19036n ? null : t41Var;
        uh0 uh0Var = new uh0(17, this, t41Var2);
        h61 h61VarA2 = t41Var.a();
        while (h61VarA2.hasNext()) {
            vd.b bVar2 = (vd.b) h61VarA2.next();
            if (bVar2.isDone()) {
                v(t41Var2);
            } else {
                bVar2.a(uh0Var, k81Var);
            }
        }
    }

    public abstract void x(int i4, Object obj);

    public abstract void y();
}

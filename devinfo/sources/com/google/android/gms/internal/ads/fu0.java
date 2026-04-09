package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fu0 implements iu0 {

    /* renamed from: e, reason: collision with root package name */
    public static final fu0 f11260e = new fu0(new ju0());

    /* renamed from: a, reason: collision with root package name */
    public boolean f11261a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11262b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11263c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11264d;

    public fu0(ju0 ju0Var) {
        this.f11264d = ju0Var;
    }

    public synchronized void a(rt rtVar) {
        uo0 uo0Var = (uo0) this.f11263c;
        w71 w71VarF = yo0.F((c71) this.f11264d, k20.f12998m, uo0Var.f17277e);
        w71VarF.a(new q81(0, w71VarF, rtVar), uo0Var.f17277e);
    }

    public synchronized c71 b(uo0 uo0Var) {
        br0 br0Var;
        br0 br0Var2;
        if (!this.f11262b && !this.f11261a && (br0Var = ((uo0) this.f11263c).g) != null && (br0Var2 = uo0Var.g) != null && br0Var.equals(br0Var2)) {
            this.f11261a = true;
            return (c71) this.f11264d;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.iu0
    public void c(boolean z3) {
        if (!this.f11262b && z3) {
            Date date = new Date();
            Date date2 = (Date) this.f11263c;
            if (date2 == null || date.after(date2)) {
                this.f11263c = date;
                if (this.f11261a) {
                    Iterator it = DesugarCollections.unmodifiableCollection(hu0.f11974c.f11976b).iterator();
                    while (it.hasNext()) {
                        pu0 pu0Var = ((vt0) it.next()).f17702d;
                        Date date3 = (Date) this.f11263c;
                        pu0Var.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f11262b = z3;
    }

    public fu0(pq0 pq0Var, rg0 rg0Var, uo0 uo0Var) {
        this.f11261a = false;
        this.f11262b = false;
        this.f11263c = uo0Var;
        vd.b bVarU = ((kh0) rg0Var.f15651b).u(uo0Var.f17274b, uo0Var.f17273a, null);
        qq qqVar = new qq(this, rg0Var, pq0Var, uo0Var, 5);
        Executor executor = uo0Var.f17277e;
        this.f11264d = yo0.D(yo0.F(bVarU, qqVar, executor), Exception.class, new fp(this, rg0Var), executor);
    }
}

package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class o1 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f20200a;

    /* renamed from: b, reason: collision with root package name */
    public p1 f20201b;

    public o1(p1 p1Var) {
        this.f20200a = p1Var;
        if (p1Var.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f20201b = (p1) p1Var.d(4);
    }

    public final p1 a() {
        p1 p1VarB = b();
        p1VarB.getClass();
        if (p1.c(p1VarB, true)) {
            return p1VarB;
        }
        throw new o2();
    }

    public final p1 b() {
        if (!this.f20201b.m()) {
            return this.f20201b;
        }
        p1 p1Var = this.f20201b;
        p1Var.getClass();
        i2.f20149c.a(p1Var.getClass()).b(p1Var);
        p1Var.j();
        return this.f20201b;
    }

    public final Object clone() {
        o1 o1Var = (o1) this.f20200a.d(5);
        o1Var.f20201b = b();
        return o1Var;
    }

    public final void d() {
        if (this.f20201b.m()) {
            return;
        }
        p1 p1Var = (p1) this.f20200a.d(4);
        i2.f20149c.a(p1Var.getClass()).e(p1Var, this.f20201b);
        this.f20201b = p1Var;
    }
}

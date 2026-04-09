package c0;

import d0.s1;
import d0.t1;
import i2.h1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 extends i2.j implements i2.h, h1 {

    /* renamed from: q, reason: collision with root package name */
    public t1 f2401q;

    /* renamed from: r, reason: collision with root package name */
    public d0.a1 f2402r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2403s;

    /* renamed from: t, reason: collision with root package name */
    public d0.k f2404t;

    /* renamed from: u, reason: collision with root package name */
    public e0.i f2405u;

    /* renamed from: v, reason: collision with root package name */
    public j f2406v;

    /* renamed from: w, reason: collision with root package name */
    public s1 f2407w;

    /* renamed from: x, reason: collision with root package name */
    public i2.i f2408x;

    /* renamed from: y, reason: collision with root package name */
    public k f2409y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2410z;

    @Override // i2.h1
    public final void P() {
        k kVar = (k) i2.k.h(this, c1.f2379a);
        if (nk.k.a(kVar, this.f2409y)) {
            return;
        }
        this.f2409y = kVar;
        i2.i iVar = this.f2408x;
        if (iVar != null) {
            q0(iVar);
        }
        this.f2408x = null;
        s0();
        s1 s1Var = this.f2407w;
        if (s1Var != null) {
            t1 t1Var = this.f2401q;
            d0.a1 a1Var = this.f2402r;
            s1Var.G0(this.f2406v, this.f2404t, a1Var, t1Var, this.f2405u, this.f2403s, this.f2410z);
        }
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i1.m
    public final void f0() {
        this.f2410z = t0();
        s0();
        if (this.f2407w == null) {
            t1 t1Var = this.f2401q;
            s1 s1Var = new s1(this.f2406v, this.f2404t, this.f2402r, t1Var, this.f2405u, this.f2403s, this.f2410z);
            p0(s1Var);
            this.f2407w = s1Var;
        }
    }

    @Override // i1.m
    public final void h0() {
        i2.i iVar = this.f2408x;
        if (iVar != null) {
            q0(iVar);
        }
    }

    @Override // i1.m
    public final void i0() {
        boolean zT0 = t0();
        if (this.f2410z != zT0) {
            this.f2410z = zT0;
            t1 t1Var = this.f2401q;
            d0.a1 a1Var = this.f2402r;
            u0(this.f2406v, this.f2404t, a1Var, t1Var, this.f2405u, this.f2403s);
        }
    }

    public final void s0() {
        i2.i iVar = this.f2408x;
        if (iVar != null) {
            if (((i1.m) iVar).f25554a.f25565n) {
                return;
            }
            p0(iVar);
            return;
        }
        j jVar = this.f2406v;
        if (jVar != null) {
            i2.j jVar2 = jVar.f2446i;
            if (jVar2.f25554a.f25565n) {
                return;
            }
            p0(jVar2);
            this.f2408x = jVar2;
        }
    }

    public final boolean t0() {
        return (this.f25565n ? i2.k.s(this).A : d3.l.f21966a) != d3.l.f21967b || this.f2402r == d0.a1.f21662a;
    }

    public final void u0(j jVar, d0.k kVar, d0.a1 a1Var, t1 t1Var, e0.i iVar, boolean z3) {
        this.f2401q = t1Var;
        this.f2402r = a1Var;
        if (!nk.k.a(this.f2406v, jVar)) {
            this.f2406v = jVar;
            i2.i iVar2 = this.f2408x;
            if (iVar2 != null) {
                q0(iVar2);
            }
            this.f2408x = null;
            s0();
        }
        this.f2403s = z3;
        this.f2404t = kVar;
        this.f2405u = iVar;
        boolean zT0 = t0();
        this.f2410z = zT0;
        s1 s1Var = this.f2407w;
        if (s1Var != null) {
            s1Var.G0(this.f2406v, kVar, a1Var, t1Var, iVar, z3, zT0);
        }
    }
}

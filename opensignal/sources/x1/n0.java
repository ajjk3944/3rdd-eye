package x1;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class n0 extends m0 implements v1.q {

    /* renamed from: o, reason: collision with root package name */
    public final f1 f24889o;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f24891q;

    /* renamed from: s, reason: collision with root package name */
    public l0 f24893s;

    /* renamed from: t, reason: collision with root package name */
    public final u.y f24894t;

    /* renamed from: p, reason: collision with root package name */
    public long f24890p = 0;

    /* renamed from: r, reason: collision with root package name */
    public final v1.p f24892r = new v1.p(this);

    public n0(f1 f1Var) {
        this.f24889o = f1Var;
        u.y yVar = u.e0.f23063a;
        this.f24894t = new u.y();
    }

    public static final void k0(n0 n0Var, l0 l0Var) {
        LinkedHashMap linkedHashMap;
        if (l0Var != null) {
            n0Var.O((l0Var.b() & 4294967295L) | (l0Var.d() << 32));
        } else {
            n0Var.O(0L);
        }
        if (!br.l.a(n0Var.f24893s, l0Var) && l0Var != null && ((((linkedHashMap = n0Var.f24891q) != null && !linkedHashMap.isEmpty()) || !l0Var.a().isEmpty()) && !br.l.a(l0Var.a(), n0Var.f24891q))) {
            s0 s0Var = n0Var.f24889o.f24821o.r().f24860q;
            br.l.b(s0Var);
            s0Var.f24927r.f();
            LinkedHashMap linkedHashMap2 = n0Var.f24891q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                n0Var.f24891q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(l0Var.a());
        }
        n0Var.f24893s = l0Var;
    }

    @Override // v1.v
    public final void N(long j, float f10, ar.k kVar) {
        m0(j);
        if (this.j) {
            return;
        }
        l0();
    }

    @Override // x1.m0
    public final m0 W() {
        f1 f1Var = this.f24889o.f24822p;
        if (f1Var != null) {
            return f1Var.t0();
        }
        return null;
    }

    @Override // x1.m0
    public final v1.m X() {
        return this.f24892r;
    }

    @Override // x1.m0
    public final boolean Y() {
        return this.f24893s != null;
    }

    @Override // x1.m0
    public final f0 Z() {
        return this.f24889o.f24821o;
    }

    @Override // x1.m0
    public final l0 a0() {
        l0 l0Var = this.f24893s;
        if (l0Var != null) {
            return l0Var;
        }
        throw c7.a.h("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // x1.m0
    public final m0 b0() {
        f1 f1Var = this.f24889o.f24823q;
        if (f1Var != null) {
            return f1Var.t0();
        }
        return null;
    }

    @Override // x1.m0
    public final long c0() {
        return this.f24890p;
    }

    @Override // x1.m0
    public final boolean f0() {
        return true;
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f24889o.getDensity();
    }

    @Override // x1.m0
    public final t2.i getLayoutDirection() {
        return this.f24889o.f24821o.f24818x;
    }

    @Override // x1.m0
    public final void j0() {
        N(this.f24890p, 0.0f, null);
    }

    public void l0() {
        a0().e();
    }

    public final void m0(long j) {
        if (!i3.g.l(this.f24890p, j)) {
            this.f24890p = j;
            f1 f1Var = this.f24889o;
            s0 s0Var = f1Var.f24821o.r().f24860q;
            if (s0Var != null) {
                s0Var.T();
            }
            m0.e0(f1Var);
        }
        if (this.k) {
            return;
        }
        U(a0());
    }

    public final long n0(n0 n0Var, boolean z10) {
        long jA = 0;
        n0 n0VarT0 = this;
        while (!n0VarT0.equals(n0Var)) {
            jA = i3.g.A(jA, n0VarT0.f24890p);
            f1 f1Var = n0VarT0.f24889o.f24823q;
            br.l.b(f1Var);
            n0VarT0 = f1Var.t0();
            br.l.b(n0VarT0);
        }
        return jA;
    }

    @Override // v1.v, v1.q
    public final Object t() {
        return this.f24889o.t();
    }

    @Override // t2.c
    public final float y() {
        return this.f24889o.y();
    }
}

package i2;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n0 extends m0 implements g2.i0 {

    /* renamed from: o, reason: collision with root package name */
    public final d1 f25719o;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f25721q;

    /* renamed from: s, reason: collision with root package name */
    public g2.k0 f25723s;

    /* renamed from: t, reason: collision with root package name */
    public final x.z f25724t;

    /* renamed from: p, reason: collision with root package name */
    public long f25720p = 0;

    /* renamed from: r, reason: collision with root package name */
    public final g2.h0 f25722r = new g2.h0(this);

    public n0(d1 d1Var) {
        this.f25719o = d1Var;
        x.z zVar = x.i0.f36903a;
        this.f25724t = new x.z();
    }

    public static final void o0(n0 n0Var, g2.k0 k0Var) {
        LinkedHashMap linkedHashMap;
        if (k0Var != null) {
            n0Var.U((k0Var.getHeight() & 4294967295L) | (k0Var.getWidth() << 32));
        } else {
            n0Var.U(0L);
        }
        if (!nk.k.a(n0Var.f25723s, k0Var) && k0Var != null && ((((linkedHashMap = n0Var.f25721q) != null && !linkedHashMap.isEmpty()) || !k0Var.b().isEmpty()) && !nk.k.a(k0Var.b(), n0Var.f25721q))) {
            q0 q0Var = n0Var.f25719o.f25610o.H.f25688q;
            nk.k.b(q0Var);
            q0Var.f25751r.f();
            LinkedHashMap linkedHashMap2 = n0Var.f25721q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                n0Var.f25721q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(k0Var.b());
        }
        n0Var.f25723s = k0Var;
    }

    @Override // d3.c
    public final float F() {
        return this.f25719o.F();
    }

    @Override // i2.m0, g2.q
    public final boolean H() {
        return true;
    }

    @Override // g2.s0
    public final void R(long j, float f10, mk.c cVar) {
        q0(j);
        if (this.j) {
            return;
        }
        p0();
    }

    @Override // d3.c
    public final float a() {
        return this.f25719o.a();
    }

    @Override // i2.m0
    public final m0 d0() {
        d1 d1Var = this.f25719o.f25611p;
        if (d1Var != null) {
            return d1Var.x0();
        }
        return null;
    }

    @Override // i2.m0
    public final g2.v e0() {
        return this.f25722r;
    }

    @Override // i2.m0
    public final boolean f0() {
        return this.f25723s != null;
    }

    @Override // i2.m0
    public final e0 g0() {
        return this.f25719o.f25610o;
    }

    @Override // g2.q
    public final d3.l getLayoutDirection() {
        return this.f25719o.f25610o.A;
    }

    @Override // i2.m0
    public final g2.k0 h0() {
        g2.k0 k0Var = this.f25723s;
        if (k0Var != null) {
            return k0Var;
        }
        throw d.h.o("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // i2.m0
    public final m0 i0() {
        d1 d1Var = this.f25719o.f25612q;
        if (d1Var != null) {
            return d1Var.x0();
        }
        return null;
    }

    @Override // i2.m0
    public final long j0() {
        return this.f25720p;
    }

    @Override // i2.m0
    public final void n0() {
        R(this.f25720p, 0.0f, null);
    }

    public void p0() {
        h0().c();
    }

    public final void q0(long j) {
        if (!d3.i.a(this.f25720p, j)) {
            this.f25720p = j;
            d1 d1Var = this.f25719o;
            q0 q0Var = d1Var.f25610o.H.f25688q;
            if (q0Var != null) {
                q0Var.b0();
            }
            m0.l0(d1Var);
        }
        if (this.f25712k) {
            return;
        }
        b0(h0());
    }

    public final long r0(n0 n0Var, boolean z3) {
        long jC = 0;
        n0 n0VarX0 = this;
        while (!n0VarX0.equals(n0Var)) {
            if (!n0VarX0.f25711i || !z3) {
                jC = d3.i.c(jC, n0VarX0.f25720p);
            }
            d1 d1Var = n0VarX0.f25719o.f25612q;
            nk.k.b(d1Var);
            n0VarX0 = d1Var.x0();
            nk.k.b(n0VarX0);
        }
        return jC;
    }

    @Override // g2.s0, g2.i0
    public final Object w() {
        return this.f25719o.w();
    }
}

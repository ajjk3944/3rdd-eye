package m1;

import g2.i0;
import g2.k0;
import g2.l0;
import g2.n0;
import g2.s0;
import g2.v0;
import i1.m;
import i2.g0;
import i2.l;
import i2.m0;
import i2.u;
import nm.d0;
import zj.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends m implements u, l {

    /* renamed from: o, reason: collision with root package name */
    public u1.b f28869o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28870p;

    /* renamed from: q, reason: collision with root package name */
    public i1.e f28871q;

    /* renamed from: r, reason: collision with root package name */
    public g2.h f28872r;

    /* renamed from: s, reason: collision with root package name */
    public float f28873s;

    public static boolean q0(long j) {
        return !o1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean r0(long j) {
        return !o1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // i2.l
    public final void J(g0 g0Var) {
        r1.b bVar = g0Var.f25668a;
        long jC = this.f28869o.c();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(r0(jC) ? Float.intBitsToFloat((int) (jC >> 32)) : Float.intBitsToFloat((int) (bVar.f32718b.E() >> 32))) << 32) | (Float.floatToRawIntBits(q0(jC) ? Float.intBitsToFloat((int) (jC & 4294967295L)) : Float.intBitsToFloat((int) (bVar.f32718b.E() & 4294967295L))) & 4294967295L);
        long jI = (Float.intBitsToFloat((int) (bVar.f32718b.E() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.f32718b.E() & 4294967295L)) == 0.0f) ? 0L : n0.i(jFloatToRawIntBits, this.f28872r.a(jFloatToRawIntBits, bVar.f32718b.E()));
        long jA = this.f28871q.a((Math.round(Float.intBitsToFloat((int) (jI >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.f32718b.E() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.f32718b.E() & 4294967295L))) & 4294967295L), g0Var.getLayoutDirection());
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((d0) bVar.f32718b.f25416b).w(f10, f11);
        try {
            this.f28869o.b(g0Var, jI, this.f28873s);
            ((d0) bVar.f32718b.f25416b).w(-f10, -f11);
            g0Var.b();
        } catch (Throwable th2) {
            ((d0) bVar.f32718b.f25416b).w(-f10, -f11);
            throw th2;
        }
    }

    @Override // i2.u
    public final int L(m0 m0Var, i0 i0Var, int i4) {
        if (!p0()) {
            return i0Var.t(i4);
        }
        long jS0 = s0(d3.b.b(0, i4, 7));
        return Math.max(d3.a.j(jS0), i0Var.t(i4));
    }

    @Override // i2.u
    public final int S(m0 m0Var, i0 i0Var, int i4) {
        if (!p0()) {
            return i0Var.n(i4);
        }
        long jS0 = s0(d3.b.b(0, i4, 7));
        return Math.max(d3.a.j(jS0), i0Var.n(i4));
    }

    @Override // i2.u
    public final k0 a0(l0 l0Var, i0 i0Var, long j) {
        s0 s0VarV = i0Var.v(s0(j));
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, t.f38318a, new v0(s0VarV, 2));
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.u
    public final int h(m0 m0Var, i0 i0Var, int i4) {
        if (!p0()) {
            return i0Var.J(i4);
        }
        long jS0 = s0(d3.b.b(i4, 0, 13));
        return Math.max(d3.a.i(jS0), i0Var.J(i4));
    }

    public final boolean p0() {
        return this.f28870p && this.f28869o.c() != 9205357640488583168L;
    }

    public final long s0(long j) {
        boolean z3 = false;
        boolean z10 = d3.a.d(j) && d3.a.c(j);
        if (d3.a.f(j) && d3.a.e(j)) {
            z3 = true;
        }
        if ((!p0() && z10) || z3) {
            return d3.a.a(d3.a.h(j), d3.a.g(j), j);
        }
        long jC = this.f28869o.c();
        int iRound = r0(jC) ? Math.round(Float.intBitsToFloat((int) (jC >> 32))) : d3.a.j(j);
        int iRound2 = q0(jC) ? Math.round(Float.intBitsToFloat((int) (jC & 4294967295L))) : d3.a.i(j);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(d3.b.f(iRound, j)) << 32) | (Float.floatToRawIntBits(d3.b.e(iRound2, j)) & 4294967295L);
        if (p0()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!r0(this.f28869o.c()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f28869o.c() >> 32))) << 32) | (Float.floatToRawIntBits(!q0(this.f28869o.c()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f28869o.c() & 4294967295L))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : n0.i(jFloatToRawIntBits2, this.f28872r.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return d3.a.a(d3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), d3.b.e(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), j);
    }

    @Override // i2.u
    public final int t(m0 m0Var, i0 i0Var, int i4) {
        if (!p0()) {
            return i0Var.d(i4);
        }
        long jS0 = s0(d3.b.b(i4, 0, 13));
        return Math.max(d3.a.i(jS0), i0Var.d(i4));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f28869o + ", sizeToIntrinsics=" + this.f28870p + ", alignment=" + this.f28871q + ", alpha=" + this.f28873s + ", colorFilter=null)";
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }
}

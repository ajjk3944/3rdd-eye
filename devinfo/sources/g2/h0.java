package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i2.n0 f24349a;

    public h0(i2.n0 n0Var) {
        this.f24349a = n0Var;
    }

    @Override // g2.v
    public final long E(long j) {
        return this.f24349a.f25719o.E(o1.b.h(0L, a()));
    }

    public final long a() {
        i2.n0 n0Var = this.f24349a;
        i2.n0 n0VarG = n0.g(n0Var);
        return o1.b.g(f(n0VarG.f25722r, 0L), n0Var.f25719o.f(n0VarG.f25719o, 0L));
    }

    @Override // g2.v
    public final long e(long j) {
        return this.f24349a.f25719o.e(o1.b.h(j, a()));
    }

    @Override // g2.v
    public final long f(v vVar, long j) {
        boolean z3 = vVar instanceof h0;
        i2.n0 n0Var = this.f24349a;
        if (!z3) {
            i2.n0 n0VarG = n0.g(n0Var);
            i2.d1 d1Var = n0VarG.f25719o;
            long jF = f(n0VarG.f25722r, j);
            long j8 = n0VarG.f25720p;
            long jG = o1.b.g(jF, (4294967295L & Float.floatToRawIntBits((int) (j8 & 4294967295L))) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32));
            if (!d1Var.z0().f25565n) {
                f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            d1Var.I0();
            i2.d1 d1Var2 = d1Var.f25612q;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            return o1.b.h(jG, d1Var.f(vVar, 0L));
        }
        i2.n0 n0Var2 = ((h0) vVar).f24349a;
        i2.d1 d1Var3 = n0Var2.f25719o;
        d1Var3.I0();
        i2.n0 n0VarX0 = n0Var.f25719o.v0(d1Var3).x0();
        if (n0VarX0 != null) {
            long jB = d3.i.b(d3.i.c(n0Var2.r0(n0VarX0, false), ii.a.D(j)), n0Var.r0(n0VarX0, false));
            return (Float.floatToRawIntBits((int) (jB >> 32)) << 32) | (Float.floatToRawIntBits((int) (jB & 4294967295L)) & 4294967295L);
        }
        i2.n0 n0VarG2 = n0.g(n0Var2);
        long jC = d3.i.c(d3.i.c(n0Var2.r0(n0VarG2, false), n0VarG2.f25720p), ii.a.D(j));
        i2.n0 n0VarG3 = n0.g(n0Var);
        long jB2 = d3.i.b(jC, d3.i.c(n0Var.r0(n0VarG3, false), n0VarG3.f25720p));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jB2 & 4294967295L)) & 4294967295L;
        i2.d1 d1Var4 = n0VarG3.f25719o.f25612q;
        nk.k.b(d1Var4);
        i2.d1 d1Var5 = n0VarG2.f25719o.f25612q;
        nk.k.b(d1Var5);
        return d1Var4.f(d1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // g2.v
    public final boolean l() {
        return this.f24349a.f25719o.z0().f25565n;
    }

    @Override // g2.v
    public final long m() {
        i2.n0 n0Var = this.f24349a;
        return (n0Var.f24408a << 32) | (n0Var.f24409b & 4294967295L);
    }

    @Override // g2.v
    public final long p(v vVar, long j) {
        return f(vVar, j);
    }

    @Override // g2.v
    public final o1.c r(v vVar, boolean z3) {
        return this.f24349a.f25719o.r(vVar, z3);
    }

    @Override // g2.v
    public final long u(long j) {
        return this.f24349a.f25719o.u(o1.b.h(0L, a()));
    }

    @Override // g2.v
    public final v y() {
        i2.n0 n0VarX0;
        if (!l()) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i2.d1 d1Var = ((i2.d1) this.f24349a.f25719o.f25610o.G.f19258e).f25612q;
        if (d1Var == null || (n0VarX0 = d1Var.x0()) == null) {
            return null;
        }
        return n0VarX0.f25722r;
    }
}

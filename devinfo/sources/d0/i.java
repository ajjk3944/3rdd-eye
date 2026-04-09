package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends i1.m implements i2.h, i2.t {

    /* renamed from: o, reason: collision with root package name */
    public a1 f21746o;

    /* renamed from: p, reason: collision with root package name */
    public final z1 f21747p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21748q;

    /* renamed from: r, reason: collision with root package name */
    public final o1 f21749r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21751t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21753v;

    /* renamed from: s, reason: collision with root package name */
    public final o7.c f21750s = new o7.c(9);

    /* renamed from: u, reason: collision with root package name */
    public long f21752u = 0;

    public i(a1 a1Var, z1 z1Var, boolean z3, o1 o1Var) {
        this.f21746o = a1Var;
        this.f21747p = z1Var;
        this.f21748q = z3;
        this.f21749r = o1Var;
    }

    public static final float p0(i iVar, c cVar, long j) {
        o1.c cVar2;
        int iCompare;
        if (d3.k.a(iVar.f21752u, 0L)) {
            return 0.0f;
        }
        w0.e eVar = (w0.e) iVar.f21750s.f30419b;
        int i4 = eVar.f36399c - 1;
        Object[] objArr = eVar.f36397a;
        if (i4 < objArr.length) {
            cVar2 = null;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                o1.c cVar3 = (o1.c) ((e) objArr[i4]).f21703a.invoke();
                if (cVar3 != null) {
                    long jC = cVar3.c();
                    long jF = me.t1.F(iVar.f21752u);
                    int iOrdinal = iVar.f21746o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jF & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new ac.m();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jF >> 32)));
                    }
                    if (iCompare <= 0) {
                        cVar2 = cVar3;
                    } else if (cVar2 == null) {
                        cVar2 = cVar3;
                    }
                }
                i4--;
            }
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            o1.c cVar4 = iVar.f21751t ? (o1.c) iVar.f21749r.invoke() : null;
            if (cVar4 == null) {
                return 0.0f;
            }
            cVar2 = cVar4;
        }
        long jF2 = me.t1.F(iVar.f21752u);
        int iOrdinal2 = iVar.f21746o.ordinal();
        if (iOrdinal2 == 0) {
            float f10 = cVar2.f30367b;
            return cVar.a(f10 - ((int) (j & 4294967295L)), cVar2.f30369d - f10, Float.intBitsToFloat((int) (jF2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new ac.m();
        }
        float f11 = cVar2.f30366a;
        return cVar.a(f11 - ((int) (j >> 32)), cVar2.f30368c - f11, Float.intBitsToFloat((int) (jF2 >> 32)));
    }

    public static boolean q0(i iVar, o1.c cVar, long j, long j8, int i4) {
        if ((i4 & 1) != 0) {
            j = iVar.f21752u;
        }
        long j9 = j;
        if ((i4 & 2) != 0) {
            j8 = 0;
        }
        long jS0 = iVar.s0(cVar, j9, j8);
        return Math.abs(Float.intBitsToFloat((int) (jS0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jS0 & 4294967295L))) <= 0.5f;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.t
    public final void g(long j) {
        int iF;
        long j8;
        long j9;
        long j10;
        long j11 = this.f21752u;
        this.f21752u = j;
        int iOrdinal = this.f21746o.ordinal();
        if (iOrdinal == 0) {
            iF = nk.k.f((int) (j & 4294967295L), (int) (j11 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                throw new ac.m();
            }
            iF = nk.k.f((int) (j >> 32), (int) (j11 >> 32));
        }
        if (iF >= 0) {
            return;
        }
        if (this.f21748q) {
            j8 = 0;
        } else {
            if (this.f21746o == a1.f21662a) {
                j9 = 0 << 32;
                j10 = ((int) (j11 & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j9 = (((int) (j11 >> 32)) - ((int) (j >> 32))) << 32;
                j10 = 0;
            }
            j8 = j9 | (j10 & 4294967295L);
        }
        long j12 = j8;
        o1.c cVar = (o1.c) this.f21749r.invoke();
        if (cVar == null || this.f21753v || this.f21751t || !q0(this, cVar, j11, 0L, 2) || q0(this, cVar, 0L, j12, 1)) {
            return;
        }
        this.f21751t = true;
        r0(j12);
    }

    public final void r0(long j) {
        u0.a0 a0Var = d.f21691a;
        c cVar = (c) i2.k.h(this, a0Var);
        if (this.f21753v) {
            f0.a.c("launchAnimation called when previous animation was running");
        }
        e2 e2Var = new e2(((c) i2.k.h(this, a0Var)).b());
        xk.x.v(b0(), null, xk.w.f37247d, new h(this, e2Var, cVar, j, null), 1);
    }

    public final long s0(o1.c cVar, long j, long j8) {
        long jF = me.t1.F(j);
        int iOrdinal = this.f21746o.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new ac.m();
            }
            c cVar2 = (c) i2.k.h(this, d.f21691a);
            float f10 = cVar.f30366a;
            return (Float.floatToRawIntBits(cVar2.a(f10 - ((int) (j8 >> 32)), cVar.f30368c - f10, Float.intBitsToFloat((int) (jF >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        c cVar3 = (c) i2.k.h(this, d.f21691a);
        float f11 = cVar.f30367b;
        float fA = cVar3.a(f11 - ((int) (j8 & 4294967295L)), cVar.f30369d - f11, Float.intBitsToFloat((int) (jF & 4294967295L)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
    }

    @Override // i2.t
    public final /* synthetic */ void w(g2.v vVar) {
    }
}

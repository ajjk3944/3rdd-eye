package d5;

/* loaded from: classes.dex */
public abstract class b implements u0, v0 {
    public o5.x0 B;
    public androidx.media3.common.r[] D;
    public long E;
    public boolean G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final int f6925a;

    /* renamed from: g, reason: collision with root package name */
    public w0 f6927g;

    /* renamed from: r, reason: collision with root package name */
    public int f6928r;

    /* renamed from: x, reason: collision with root package name */
    public e5.o0 f6929x;

    /* renamed from: y, reason: collision with root package name */
    public int f6930y;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f6926d = new io.sentry.internal.debugmeta.c(13, false);
    public long F = Long.MIN_VALUE;

    public b(int i10) {
        this.f6925a = i10;
    }

    @Override // d5.u0
    public boolean c() {
        return l();
    }

    @Override // d5.v0
    public int d() {
        return 0;
    }

    @Override // d5.u0
    public f0 i() {
        return null;
    }

    public final f k(Exception exc, androidx.media3.common.r rVar, boolean z10, int i10) {
        int iJ;
        if (rVar == null || this.H) {
            iJ = 4;
        } else {
            this.H = true;
            try {
                iJ = j(rVar) & 7;
            } catch (f unused) {
            } finally {
                this.H = false;
            }
        }
        return new f(1, exc, i10, getName(), this.f6928r, rVar, rVar == null ? 4 : iJ, z10);
    }

    public final boolean l() {
        return this.F == Long.MIN_VALUE;
    }

    public abstract void m();

    public abstract void o(long j, boolean z10);

    public abstract void s(androidx.media3.common.r[] rVarArr, long j, long j7);

    public final int t(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        o5.x0 x0Var = this.B;
        x0Var.getClass();
        int iJ = x0Var.j(cVar, gVar, i10);
        if (iJ == -4) {
            if (gVar.g(4)) {
                this.F = Long.MIN_VALUE;
                return this.G ? -4 : -3;
            }
            long j = gVar.f3308y + this.E;
            gVar.f3308y = j;
            this.F = Math.max(this.F, j);
            return iJ;
        }
        if (iJ == -5) {
            androidx.media3.common.r rVar = (androidx.media3.common.r) cVar.f12354g;
            rVar.getClass();
            long j7 = rVar.L;
            if (j7 != Long.MAX_VALUE) {
                androidx.media3.common.q qVarA = rVar.a();
                qVarA.f1746o = j7 + this.E;
                cVar.f12354g = new androidx.media3.common.r(qVarA);
            }
        }
        return iJ;
    }

    public final void u(androidx.media3.common.r[] rVarArr, o5.x0 x0Var, long j, long j7) {
        a5.a.i(!this.G);
        this.B = x0Var;
        if (this.F == Long.MIN_VALUE) {
            this.F = j;
        }
        this.D = rVarArr;
        this.E = j7;
        s(rVarArr, j, j7);
    }

    public final void v() {
        a5.a.i(this.f6930y == 0);
        this.f6926d.c();
        p();
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    @Override // d5.r0
    public void e(int i10, Object obj) {
    }

    public void n(boolean z10, boolean z11) {
    }
}

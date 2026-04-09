package o5;

/* loaded from: classes.dex */
public final class h0 implements x, w {

    /* renamed from: a, reason: collision with root package name */
    public final x f18953a;

    /* renamed from: d, reason: collision with root package name */
    public final long f18954d;

    /* renamed from: g, reason: collision with root package name */
    public w f18955g;

    public h0(x xVar, long j) {
        this.f18953a = xVar;
        this.f18954d = j;
    }

    @Override // o5.x
    public final long C(androidx.media3.exoplayer.trackselection.v[] vVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        x0[] x0VarArr2 = new x0[x0VarArr.length];
        int i10 = 0;
        while (true) {
            x0 x0Var = null;
            if (i10 >= x0VarArr.length) {
                break;
            }
            i0 i0Var = (i0) x0VarArr[i10];
            if (i0Var != null) {
                x0Var = i0Var.f18964a;
            }
            x0VarArr2[i10] = x0Var;
            i10++;
        }
        x xVar = this.f18953a;
        long j7 = this.f18954d;
        long jC = xVar.C(vVarArr, zArr, x0VarArr2, zArr2, j - j7);
        for (int i11 = 0; i11 < x0VarArr.length; i11++) {
            x0 x0Var2 = x0VarArr2[i11];
            if (x0Var2 == null) {
                x0VarArr[i11] = null;
            } else {
                x0 x0Var3 = x0VarArr[i11];
                if (x0Var3 == null || ((i0) x0Var3).f18964a != x0Var2) {
                    x0VarArr[i11] = new i0(x0Var2, j7);
                }
            }
        }
        return jC + j7;
    }

    @Override // o5.z0
    public final long d() {
        long jD = this.f18953a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f18954d;
    }

    @Override // o5.x
    public final void e() {
        this.f18953a.e();
    }

    @Override // o5.x
    public final long f(long j) {
        long j7 = this.f18954d;
        return this.f18953a.f(j - j7) + j7;
    }

    @Override // o5.x
    public final void g(long j) {
        this.f18953a.g(j - this.f18954d);
    }

    @Override // o5.z0
    public final boolean i(long j) {
        return this.f18953a.i(j - this.f18954d);
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.f18953a.isLoading();
    }

    @Override // o5.w
    public final void j(x xVar) {
        w wVar = this.f18955g;
        wVar.getClass();
        wVar.j(this);
    }

    @Override // o5.x
    public final long k() {
        long jK = this.f18953a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.f18954d;
    }

    @Override // o5.x
    public final h1 l() {
        return this.f18953a.l();
    }

    @Override // o5.z0
    public final long m() {
        long jM = this.f18953a.m();
        if (jM == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jM + this.f18954d;
    }

    @Override // o5.z0
    public final void o(long j) {
        this.f18953a.o(j - this.f18954d);
    }

    @Override // o5.x
    public final long p(long j, d5.x0 x0Var) {
        long j7 = this.f18954d;
        return this.f18953a.p(j - j7, x0Var) + j7;
    }

    @Override // o5.y0
    public final void r(z0 z0Var) {
        w wVar = this.f18955g;
        wVar.getClass();
        wVar.r(this);
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        this.f18955g = wVar;
        this.f18953a.t(this, j - this.f18954d);
    }
}

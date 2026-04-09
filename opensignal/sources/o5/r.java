package o5;

/* loaded from: classes.dex */
public final class r implements x, w {
    public long B = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final z f19030a;

    /* renamed from: d, reason: collision with root package name */
    public final long f19031d;

    /* renamed from: g, reason: collision with root package name */
    public final r5.b f19032g;

    /* renamed from: r, reason: collision with root package name */
    public b0 f19033r;

    /* renamed from: x, reason: collision with root package name */
    public x f19034x;

    /* renamed from: y, reason: collision with root package name */
    public w f19035y;

    public r(z zVar, r5.b bVar, long j) {
        this.f19030a = zVar;
        this.f19032g = bVar;
        this.f19031d = j;
    }

    @Override // o5.x
    public final long C(androidx.media3.exoplayer.trackselection.v[] vVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        long j7;
        long j10 = this.B;
        if (j10 == -9223372036854775807L || j != this.f19031d) {
            j7 = j;
        } else {
            this.B = -9223372036854775807L;
            j7 = j10;
        }
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.C(vVarArr, zArr, x0VarArr, zArr2, j7);
    }

    public final void a(z zVar) {
        long j = this.B;
        if (j == -9223372036854775807L) {
            j = this.f19031d;
        }
        b0 b0Var = this.f19033r;
        b0Var.getClass();
        x xVarCreatePeriod = b0Var.createPeriod(zVar, this.f19032g, j);
        this.f19034x = xVarCreatePeriod;
        if (this.f19035y != null) {
            xVarCreatePeriod.t(this, j);
        }
    }

    @Override // o5.z0
    public final long d() {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.d();
    }

    @Override // o5.x
    public final void e() {
        x xVar = this.f19034x;
        if (xVar != null) {
            xVar.e();
            return;
        }
        b0 b0Var = this.f19033r;
        if (b0Var != null) {
            b0Var.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // o5.x
    public final long f(long j) {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.f(j);
    }

    @Override // o5.x
    public final void g(long j) {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        xVar.g(j);
    }

    @Override // o5.z0
    public final boolean i(long j) {
        x xVar = this.f19034x;
        return xVar != null && xVar.i(j);
    }

    @Override // o5.z0
    public final boolean isLoading() {
        x xVar = this.f19034x;
        return xVar != null && xVar.isLoading();
    }

    @Override // o5.w
    public final void j(x xVar) {
        w wVar = this.f19035y;
        int i10 = a5.d0.f105a;
        wVar.j(this);
    }

    @Override // o5.x
    public final long k() {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.k();
    }

    @Override // o5.x
    public final h1 l() {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.l();
    }

    @Override // o5.z0
    public final long m() {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.m();
    }

    @Override // o5.z0
    public final void o(long j) {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        xVar.o(j);
    }

    @Override // o5.x
    public final long p(long j, d5.x0 x0Var) {
        x xVar = this.f19034x;
        int i10 = a5.d0.f105a;
        return xVar.p(j, x0Var);
    }

    @Override // o5.y0
    public final void r(z0 z0Var) {
        w wVar = this.f19035y;
        int i10 = a5.d0.f105a;
        wVar.r(this);
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        this.f19035y = wVar;
        x xVar = this.f19034x;
        if (xVar != null) {
            long j7 = this.B;
            if (j7 == -9223372036854775807L) {
                j7 = this.f19031d;
            }
            xVar.t(this, j7);
        }
    }
}

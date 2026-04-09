package o5;

/* loaded from: classes.dex */
public final class d implements x, w {
    public f B;

    /* renamed from: a, reason: collision with root package name */
    public final x f18907a;

    /* renamed from: d, reason: collision with root package name */
    public w f18908d;

    /* renamed from: g, reason: collision with root package name */
    public c[] f18909g = new c[0];

    /* renamed from: r, reason: collision with root package name */
    public long f18910r;

    /* renamed from: x, reason: collision with root package name */
    public long f18911x;

    /* renamed from: y, reason: collision with root package name */
    public long f18912y;

    public d(x xVar, boolean z10, long j, long j7) {
        this.f18907a = xVar;
        this.f18910r = z10 ? j : -9223372036854775807L;
        this.f18911x = j;
        this.f18912y = j7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    @Override // o5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long C(androidx.media3.exoplayer.trackselection.v[] r15, boolean[] r16, o5.x0[] r17, boolean[] r18, long r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.d.C(androidx.media3.exoplayer.trackselection.v[], boolean[], o5.x0[], boolean[], long):long");
    }

    public final boolean a() {
        return this.f18910r != -9223372036854775807L;
    }

    @Override // o5.z0
    public final long d() {
        long jD = this.f18907a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.f18912y;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o5.x
    public final void e() throws f {
        f fVar = this.B;
        if (fVar != null) {
            throw fVar;
        }
        this.f18907a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // o5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f18910r = r0
            o5.c[] r0 = r5.f18909g
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f18895d = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            o5.x r0 = r5.f18907a
            long r0 = r0.f(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f18911x
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f18912y
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            a5.a.i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.d.f(long):long");
    }

    @Override // o5.x
    public final void g(long j) {
        this.f18907a.g(j);
    }

    @Override // o5.z0
    public final boolean i(long j) {
        return this.f18907a.i(j);
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.f18907a.isLoading();
    }

    @Override // o5.w
    public final void j(x xVar) {
        if (this.B != null) {
            return;
        }
        w wVar = this.f18908d;
        wVar.getClass();
        wVar.j(this);
    }

    @Override // o5.x
    public final long k() {
        if (a()) {
            long j = this.f18910r;
            this.f18910r = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.f18907a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        a5.a.i(jK2 >= this.f18911x);
        long j7 = this.f18912y;
        a5.a.i(j7 == Long.MIN_VALUE || jK2 <= j7);
        return jK2;
    }

    @Override // o5.x
    public final h1 l() {
        return this.f18907a.l();
    }

    @Override // o5.z0
    public final long m() {
        long jM = this.f18907a.m();
        if (jM != Long.MIN_VALUE) {
            long j = this.f18912y;
            if (j == Long.MIN_VALUE || jM < j) {
                return jM;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o5.z0
    public final void o(long j) {
        this.f18907a.o(j);
    }

    @Override // o5.x
    public final long p(long j, d5.x0 x0Var) {
        long j7 = this.f18911x;
        if (j == j7) {
            return j7;
        }
        long jI = a5.d0.i(x0Var.f7101a, 0L, j - j7);
        long j10 = x0Var.f7102b;
        long j11 = this.f18912y;
        long jI2 = a5.d0.i(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j);
        if (jI != x0Var.f7101a || jI2 != x0Var.f7102b) {
            x0Var = new d5.x0(jI, jI2);
        }
        return this.f18907a.p(j, x0Var);
    }

    @Override // o5.y0
    public final void r(z0 z0Var) {
        w wVar = this.f18908d;
        wVar.getClass();
        wVar.r(this);
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        this.f18908d = wVar;
        this.f18907a.t(this, j);
    }
}

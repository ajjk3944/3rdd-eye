package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public abstract class g implements l1, i1 {
    public Format[] B;
    public long D;
    public boolean F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final int f4136a;

    /* renamed from: g, reason: collision with root package name */
    public m1 f4138g;

    /* renamed from: r, reason: collision with root package name */
    public int f4139r;

    /* renamed from: x, reason: collision with root package name */
    public int f4140x;

    /* renamed from: y, reason: collision with root package name */
    public ya.s0 f4141y;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f4137d = new io.sentry.internal.debugmeta.c(11, false);
    public long E = Long.MIN_VALUE;

    public g(int i10) {
        this.f4136a = i10;
    }

    public final n c(Exception exc, Format format, boolean z10, int i10) {
        int iF;
        if (format == null || this.G) {
            iF = 4;
        } else {
            this.G = true;
            try {
                iF = f(format) & 7;
            } catch (n unused) {
            } finally {
                this.G = false;
            }
        }
        return new n(1, exc, i10, getName(), this.f4139r, format, format == null ? 4 : iF, z10);
    }

    @Override // com.google.android.exoplayer2.l1
    public int d() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.i1
    public void e(int i10, Object obj) {
    }

    public qb.l g() {
        return null;
    }

    @Override // com.google.android.exoplayer2.l1
    public abstract String getName();

    public final boolean h() {
        return this.E == Long.MIN_VALUE;
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public void l(boolean z10, boolean z11) {
    }

    public abstract void m(long j, boolean z10);

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public abstract void q(Format[] formatArr, long j, long j7);

    public final int r(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        ya.s0 s0Var = this.f4141y;
        s0Var.getClass();
        int iJ = s0Var.j(cVar, dVar, i10);
        if (iJ == -4) {
            if (dVar.g(4)) {
                this.E = Long.MIN_VALUE;
                return this.F ? -4 : -3;
            }
            long j = dVar.f26793y + this.D;
            dVar.f26793y = j;
            this.E = Math.max(this.E, j);
            return iJ;
        }
        if (iJ == -5) {
            Format format = (Format) cVar.f12354g;
            format.getClass();
            long j7 = format.L;
            if (j7 != Long.MAX_VALUE) {
                g0 g0VarD = format.d();
                g0VarD.f4154o = j7 + this.D;
                cVar.f12354g = new Format(g0VarD);
            }
        }
        return iJ;
    }

    public abstract void s(long j, long j7);

    public final void t(Format[] formatArr, ya.s0 s0Var, long j, long j7) {
        qb.b.j(!this.F);
        this.f4141y = s0Var;
        if (this.E == Long.MIN_VALUE) {
            this.E = j;
        }
        this.B = formatArr;
        this.D = j7;
        q(formatArr, j, j7);
    }

    public final void u() {
        qb.b.j(this.f4140x == 0);
        this.f4137d.c();
        n();
    }

    public void v(float f10, float f11) {
    }
}

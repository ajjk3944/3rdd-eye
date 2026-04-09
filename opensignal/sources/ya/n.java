package ya;

import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* loaded from: classes.dex */
public final class n implements t, s {
    public long B = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final v f26112a;

    /* renamed from: d, reason: collision with root package name */
    public final long f26113d;

    /* renamed from: g, reason: collision with root package name */
    public final pb.b f26114g;

    /* renamed from: r, reason: collision with root package name */
    public x f26115r;

    /* renamed from: x, reason: collision with root package name */
    public t f26116x;

    /* renamed from: y, reason: collision with root package name */
    public s f26117y;

    public n(v vVar, pb.b bVar, long j) {
        this.f26112a = vVar;
        this.f26114g = bVar;
        this.f26113d = j;
    }

    @Override // ya.s
    public final void b(t tVar) {
        s sVar = this.f26117y;
        int i10 = qb.v.f20828a;
        sVar.b(this);
    }

    @Override // ya.t0
    public final void c(u0 u0Var) {
        s sVar = this.f26117y;
        int i10 = qb.v.f20828a;
        sVar.c(this);
    }

    @Override // ya.u0
    public final long d() {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.d();
    }

    @Override // ya.t
    public final void e() {
        t tVar = this.f26116x;
        if (tVar != null) {
            tVar.e();
            return;
        }
        x xVar = this.f26115r;
        if (xVar != null) {
            xVar.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // ya.t
    public final long f(long j) {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.f(j);
    }

    @Override // ya.t
    public final void g(long j) {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        tVar.g(j);
    }

    @Override // ya.u0
    public final boolean i(long j) {
        t tVar = this.f26116x;
        return tVar != null && tVar.i(j);
    }

    @Override // ya.u0
    public final boolean isLoading() {
        t tVar = this.f26116x;
        return tVar != null && tVar.isLoading();
    }

    @Override // ya.t
    public final long k() {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.k();
    }

    @Override // ya.t
    public final TrackGroupArray l() {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.l();
    }

    @Override // ya.u0
    public final long m() {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.m();
    }

    @Override // ya.u0
    public final void o(long j) {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        tVar.o(j);
    }

    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.p(j, n1Var);
    }

    @Override // ya.t
    public final long s(ob.f[] fVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j) {
        long j7;
        long j10 = this.B;
        if (j10 == -9223372036854775807L || j != this.f26113d) {
            j7 = j;
        } else {
            this.B = -9223372036854775807L;
            j7 = j10;
        }
        t tVar = this.f26116x;
        int i10 = qb.v.f20828a;
        return tVar.s(fVarArr, zArr, s0VarArr, zArr2, j7);
    }

    @Override // ya.t
    public final void u(s sVar, long j) {
        this.f26117y = sVar;
        t tVar = this.f26116x;
        if (tVar != null) {
            long j7 = this.B;
            if (j7 == -9223372036854775807L) {
                j7 = this.f26113d;
            }
            tVar.u(this, j7);
        }
    }
}

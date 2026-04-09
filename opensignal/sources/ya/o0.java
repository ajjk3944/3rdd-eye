package ya;

import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public final class o0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.n0 f26126a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.m0 f26127b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.k f26128c;

    /* renamed from: d, reason: collision with root package name */
    public final s9.g f26129d;

    /* renamed from: e, reason: collision with root package name */
    public final ba.h f26130e;

    /* renamed from: f, reason: collision with root package name */
    public final pb.f0 f26131f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26133h;

    /* renamed from: i, reason: collision with root package name */
    public long f26134i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public pb.u0 f26135l;

    public o0(com.google.android.exoplayer2.n0 n0Var, io.sentry.k kVar, s9.g gVar, ba.h hVar, sm.m mVar, int i10) {
        com.google.android.exoplayer2.m0 m0Var = n0Var.f4336b;
        m0Var.getClass();
        this.f26127b = m0Var;
        this.f26126a = n0Var;
        this.f26128c = kVar;
        this.f26129d = gVar;
        this.f26130e = hVar;
        this.f26131f = mVar;
        this.f26132g = i10;
        this.f26133h = true;
        this.f26134i = -9223372036854775807L;
    }

    public final void a() {
        long j = this.f26134i;
        boolean z10 = this.j;
        boolean z11 = this.k;
        com.google.android.exoplayer2.n0 n0Var = this.f26126a;
        w1 w0Var = new w0(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z10, false, false, null, n0Var, z11 ? n0Var.f4337c : null);
        if (this.f26133h) {
            w0Var = new m0(w0Var);
        }
        refreshSourceInfo(w0Var);
    }

    public final void b(long j, boolean z10, boolean z11) {
        if (j == -9223372036854775807L) {
            j = this.f26134i;
        }
        if (!this.f26133h && this.f26134i == j && this.j == z10 && this.k == z11) {
            return;
        }
        this.f26134i = j;
        this.j = z10;
        this.k = z11;
        this.f26133h = false;
        a();
    }

    @Override // ya.x
    public final t createPeriod(v vVar, pb.b bVar, long j) {
        pb.n nVarA = this.f26128c.a();
        pb.u0 u0Var = this.f26135l;
        if (u0Var != null) {
            ((pb.s) nVarA).s(u0Var);
        }
        return new l0(this.f26127b.f4234a, nVarA, new qm.c((ca.i) this.f26129d.f21944d), this.f26130e, createDrmEventDispatcher(vVar), this.f26131f, createEventDispatcher(vVar), this, bVar, this.f26132g);
    }

    @Override // ya.x
    public final com.google.android.exoplayer2.n0 getMediaItem() {
        return this.f26126a;
    }

    @Override // ya.a
    public final void prepareSourceInternal(pb.u0 u0Var) {
        this.f26135l = u0Var;
        this.f26130e.prepare();
        a();
    }

    @Override // ya.x
    public final void releasePeriod(t tVar) {
        l0 l0Var = (l0) tVar;
        if (l0Var.Q) {
            for (r0 r0Var : l0Var.N) {
                r0Var.h();
                b9.e eVar = r0Var.f26161i;
                if (eVar != null) {
                    eVar.D(r0Var.f26157e);
                    r0Var.f26161i = null;
                    r0Var.f26160h = null;
                }
            }
        }
        l0Var.F.e(l0Var);
        l0Var.K.removeCallbacksAndMessages(null);
        l0Var.L = null;
        l0Var.f26103g0 = true;
    }

    @Override // ya.a
    public final void releaseSourceInternal() {
        this.f26130e.release();
    }

    @Override // ya.x
    public final void maybeThrowSourceInfoRefreshError() {
    }
}

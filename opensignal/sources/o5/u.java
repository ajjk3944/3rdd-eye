package o5;

/* loaded from: classes.dex */
public final class u extends j1 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19063e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.z0 f19064f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.media3.common.y0 f19065g;

    /* renamed from: h, reason: collision with root package name */
    public s f19066h;

    /* renamed from: i, reason: collision with root package name */
    public r f19067i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19068l;

    public u(b0 b0Var, boolean z10) {
        super(b0Var);
        this.f19063e = z10 && b0Var.isSingleWindow();
        this.f19064f = new androidx.media3.common.z0();
        this.f19065g = new androidx.media3.common.y0();
        androidx.media3.common.a1 initialTimeline = b0Var.getInitialTimeline();
        if (initialTimeline == null) {
            this.f19066h = new s(new t(b0Var.getMediaItem()), androidx.media3.common.z0.N, s.f19041x);
        } else {
            this.f19066h = new s(initialTimeline, null, null);
            this.f19068l = true;
        }
    }

    @Override // o5.j1
    public final z f(z zVar) {
        Object obj = zVar.f1689a;
        Object obj2 = this.f19066h.f19043r;
        if (obj2 != null && obj2.equals(obj)) {
            obj = s.f19041x;
        }
        return zVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // o5.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(androidx.media3.common.a1 r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.u.g(androidx.media3.common.a1):void");
    }

    @Override // o5.j1
    public final void h() {
        if (this.f19063e) {
            return;
        }
        this.j = true;
        e(null, this.f18975d);
    }

    @Override // o5.b0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final r createPeriod(z zVar, r5.b bVar, long j) {
        r rVar = new r(zVar, bVar, j);
        a5.a.i(rVar.f19033r == null);
        b0 b0Var = this.f18975d;
        rVar.f19033r = b0Var;
        if (!this.k) {
            this.f19067i = rVar;
            if (!this.j) {
                this.j = true;
                e(null, b0Var);
            }
            return rVar;
        }
        Object obj = zVar.f1689a;
        if (this.f19066h.f19043r != null && obj.equals(s.f19041x)) {
            obj = this.f19066h.f19043r;
        }
        rVar.a(zVar.b(obj));
        return rVar;
    }

    public final void j(long j) {
        r rVar = this.f19067i;
        int iB = this.f19066h.b(rVar.f19030a.f1689a);
        if (iB == -1) {
            return;
        }
        s sVar = this.f19066h;
        androidx.media3.common.y0 y0Var = this.f19065g;
        sVar.f(iB, y0Var, false);
        long j7 = y0Var.f1830r;
        if (j7 != -9223372036854775807L && j >= j7) {
            j = Math.max(0L, j7 - 1);
        }
        rVar.B = j;
    }

    @Override // o5.b0
    public final void releasePeriod(x xVar) {
        r rVar = (r) xVar;
        if (rVar.f19034x != null) {
            b0 b0Var = rVar.f19033r;
            b0Var.getClass();
            b0Var.releasePeriod(rVar.f19034x);
        }
        if (xVar == this.f19067i) {
            this.f19067i = null;
        }
    }

    @Override // o5.j, o5.a
    public final void releaseSourceInternal() {
        this.k = false;
        this.j = false;
        super.releaseSourceInternal();
    }

    @Override // o5.j, o5.b0
    public final void maybeThrowSourceInfoRefreshError() {
    }
}

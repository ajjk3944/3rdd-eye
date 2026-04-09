package ya;

import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public final class q extends g {

    /* renamed from: d, reason: collision with root package name */
    public final x f26139d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26140e;

    /* renamed from: f, reason: collision with root package name */
    public final v1 f26141f;

    /* renamed from: g, reason: collision with root package name */
    public final u1 f26142g;

    /* renamed from: h, reason: collision with root package name */
    public o f26143h;

    /* renamed from: i, reason: collision with root package name */
    public n f26144i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26145l;

    public q(x xVar, boolean z10) {
        this.f26139d = xVar;
        this.f26140e = z10 && xVar.isSingleWindow();
        this.f26141f = new v1();
        this.f26142g = new u1();
        w1 initialTimeline = xVar.getInitialTimeline();
        if (initialTimeline == null) {
            this.f26143h = new o(new p(xVar.getMediaItem()), v1.f4738r, o.f26123e);
        } else {
            this.f26143h = new o(initialTimeline, null, null);
            this.f26145l = true;
        }
    }

    @Override // ya.g
    public final v a(Object obj, v vVar) {
        Object obj2 = vVar.f26177a;
        Object obj3 = this.f26143h.f26125d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = o.f26123e;
        }
        return vVar.b(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // ya.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r13, ya.a r14, com.google.android.exoplayer2.w1 r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.q.b(java.lang.Object, ya.a, com.google.android.exoplayer2.w1):void");
    }

    @Override // ya.x
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final n createPeriod(v vVar, pb.b bVar, long j) {
        n nVar = new n(vVar, bVar, j);
        qb.b.j(nVar.f26115r == null);
        x xVar = this.f26139d;
        nVar.f26115r = xVar;
        if (this.k) {
            Object obj = vVar.f26177a;
            if (this.f26143h.f26125d != null && obj.equals(o.f26123e)) {
                obj = this.f26143h.f26125d;
            }
            v vVarB = vVar.b(obj);
            long j7 = nVar.B;
            if (j7 != -9223372036854775807L) {
                j = j7;
            }
            x xVar2 = nVar.f26115r;
            xVar2.getClass();
            t tVarCreatePeriod = xVar2.createPeriod(vVarB, bVar, j);
            nVar.f26116x = tVarCreatePeriod;
            if (nVar.f26117y != null) {
                tVarCreatePeriod.u(nVar, j);
                return nVar;
            }
        } else {
            this.f26144i = nVar;
            if (!this.j) {
                this.j = true;
                c(null, xVar);
            }
        }
        return nVar;
    }

    public final void e(long j) {
        n nVar = this.f26144i;
        int iB = this.f26143h.b(nVar.f26112a.f26177a);
        if (iB == -1) {
            return;
        }
        o oVar = this.f26143h;
        u1 u1Var = this.f26142g;
        oVar.f(iB, u1Var, false);
        long j7 = u1Var.f4597d;
        if (j7 != -9223372036854775807L && j >= j7) {
            j = Math.max(0L, j7 - 1);
        }
        nVar.B = j;
    }

    @Override // ya.x
    public final com.google.android.exoplayer2.n0 getMediaItem() {
        return this.f26139d.getMediaItem();
    }

    @Override // ya.a
    public final void prepareSourceInternal(pb.u0 u0Var) {
        this.f26065c = u0Var;
        this.f26064b = qb.v.l(null);
        if (this.f26140e) {
            return;
        }
        this.j = true;
        c(null, this.f26139d);
    }

    @Override // ya.x
    public final void releasePeriod(t tVar) {
        n nVar = (n) tVar;
        if (nVar.f26116x != null) {
            x xVar = nVar.f26115r;
            xVar.getClass();
            xVar.releasePeriod(nVar.f26116x);
        }
        if (tVar == this.f26144i) {
            this.f26144i = null;
        }
    }

    @Override // ya.g, ya.a
    public final void releaseSourceInternal() {
        this.k = false;
        this.j = false;
        super.releaseSourceInternal();
    }

    @Override // ya.x
    public final void maybeThrowSourceInfoRefreshError() {
    }
}

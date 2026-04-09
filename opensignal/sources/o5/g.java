package o5;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends j1 {

    /* renamed from: e, reason: collision with root package name */
    public final long f18935e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18936f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18937g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18938h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18939i;
    public final ArrayList j;
    public final androidx.media3.common.z0 k;

    /* renamed from: l, reason: collision with root package name */
    public e f18940l;

    /* renamed from: m, reason: collision with root package name */
    public f f18941m;

    /* renamed from: n, reason: collision with root package name */
    public long f18942n;

    /* renamed from: o, reason: collision with root package name */
    public long f18943o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b0 b0Var, long j, long j7, boolean z10, boolean z11, boolean z12) {
        super(b0Var);
        b0Var.getClass();
        a5.a.e(j >= 0);
        this.f18935e = j;
        this.f18936f = j7;
        this.f18937g = z10;
        this.f18938h = z11;
        this.f18939i = z12;
        this.j = new ArrayList();
        this.k = new androidx.media3.common.z0();
    }

    @Override // o5.b0
    public final x createPeriod(z zVar, r5.b bVar, long j) {
        d dVar = new d(this.f18975d.createPeriod(zVar, bVar, j), this.f18937g, this.f18942n, this.f18943o);
        this.j.add(dVar);
        return dVar;
    }

    @Override // o5.j1
    public final void g(androidx.media3.common.a1 a1Var) {
        if (this.f18941m != null) {
            return;
        }
        i(a1Var);
    }

    public final void i(androidx.media3.common.a1 a1Var) {
        long j;
        long j7;
        long j10;
        androidx.media3.common.z0 z0Var = this.k;
        a1Var.n(0, z0Var);
        long j11 = z0Var.M;
        e eVar = this.f18940l;
        long j12 = this.f18936f;
        ArrayList arrayList = this.j;
        if (eVar == null || arrayList.isEmpty() || this.f18938h) {
            boolean z10 = this.f18939i;
            j = this.f18935e;
            if (z10) {
                long j13 = z0Var.I;
                j += j13;
                j7 = j13 + j12;
            } else {
                j7 = j12;
            }
            this.f18942n = j11 + j;
            this.f18943o = j12 != Long.MIN_VALUE ? j11 + j7 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j14 = this.f18942n;
                long j15 = this.f18943o;
                dVar.f18911x = j14;
                dVar.f18912y = j15;
            }
            j10 = j7;
        } else {
            j = this.f18942n - j11;
            j10 = j12 != Long.MIN_VALUE ? this.f18943o - j11 : Long.MIN_VALUE;
        }
        try {
            e eVar2 = new e(a1Var, j, j10);
            this.f18940l = eVar2;
            refreshSourceInfo(eVar2);
        } catch (f e4) {
            this.f18941m = e4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).B = this.f18941m;
            }
        }
    }

    @Override // o5.j, o5.b0
    public final void maybeThrowSourceInfoRefreshError() throws f {
        f fVar = this.f18941m;
        if (fVar != null) {
            throw fVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // o5.b0
    public final void releasePeriod(x xVar) {
        ArrayList arrayList = this.j;
        a5.a.i(arrayList.remove(xVar));
        this.f18975d.releasePeriod(((d) xVar).f18907a);
        if (!arrayList.isEmpty() || this.f18938h) {
            return;
        }
        e eVar = this.f18940l;
        eVar.getClass();
        i(eVar.f19002d);
    }

    @Override // o5.j, o5.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f18941m = null;
        this.f18940l = null;
    }
}

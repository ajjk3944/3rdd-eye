package bb;

import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public final class g extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f2520b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2521c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2522d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2523e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2524f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2525g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2526h;

    /* renamed from: i, reason: collision with root package name */
    public final cb.c f2527i;
    public final n0 j;
    public final l0 k;

    public g(long j, long j7, long j10, int i10, long j11, long j12, long j13, cb.c cVar, n0 n0Var, l0 l0Var) {
        qb.b.j(cVar.f3537d == (l0Var != null));
        this.f2520b = j;
        this.f2521c = j7;
        this.f2522d = j10;
        this.f2523e = i10;
        this.f2524f = j11;
        this.f2525g = j12;
        this.f2526h = j13;
        this.f2527i = cVar;
        this.j = n0Var;
        this.k = l0Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f2523e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final u1 f(int i10, u1 u1Var, boolean z10) {
        qb.b.i(i10, h());
        cb.c cVar = this.f2527i;
        String str = z10 ? cVar.c(i10).f3559a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f2523e + i10) : null;
        long jE = cVar.e(i10);
        long jC = com.google.android.exoplayer2.h.c(cVar.c(i10).f3560b - cVar.c(0).f3560b) - this.f2524f;
        u1Var.getClass();
        za.b bVar = za.b.f26804c;
        u1Var.f4594a = str;
        u1Var.f4595b = numValueOf;
        u1Var.f4596c = 0;
        u1Var.f4597d = jE;
        u1Var.f4598e = jC;
        u1Var.f4600g = bVar;
        u1Var.f4599f = false;
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int h() {
        return this.f2527i.f3544m.size();
    }

    @Override // com.google.android.exoplayer2.w1
    public final Object l(int i10) {
        qb.b.i(i10, h());
        return Integer.valueOf(this.f2523e + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    @Override // com.google.android.exoplayer2.w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.v1 m(int r23, com.google.android.exoplayer2.v1 r24, long r25) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.g.m(int, com.google.android.exoplayer2.v1, long):com.google.android.exoplayer2.v1");
    }

    @Override // com.google.android.exoplayer2.w1
    public final int o() {
        return 1;
    }
}

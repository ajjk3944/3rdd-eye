package ca;

/* loaded from: classes.dex */
public class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3486a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f3487b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3488c;

    public o(q qVar, long j) {
        this.f3488c = qVar;
        this.f3487b = j;
    }

    @Override // ca.u
    public final boolean b() {
        switch (this.f3486a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ca.u
    public final t d(long j) {
        switch (this.f3486a) {
            case 0:
                q qVar = (q) this.f3488c;
                qb.b.k(qVar.k);
                p pVar = qVar.k;
                long[] jArr = pVar.f3489a;
                long[] jArr2 = pVar.f3490b;
                int iE = qb.v.e(jArr, qb.v.j((qVar.f3495e * j) / 1000000, 0L, qVar.j - 1), false);
                long j7 = iE == -1 ? 0L : jArr[iE];
                long j10 = iE != -1 ? jArr2[iE] : 0L;
                int i10 = qVar.f3495e;
                long j11 = (j7 * 1000000) / i10;
                long j12 = this.f3487b;
                v vVar = new v(j11, j10 + j12);
                if (j11 == j || iE == jArr.length - 1) {
                    return new t(vVar, vVar);
                }
                int i11 = iE + 1;
                return new t(vVar, new v((jArr[i11] * 1000000) / i10, j12 + jArr2[i11]));
            default:
                return (t) this.f3488c;
        }
    }

    @Override // ca.u
    public final long e() {
        switch (this.f3486a) {
            case 0:
                return ((q) this.f3488c).c();
            default:
                return this.f3487b;
        }
    }

    public o(long j) {
        this(j, 0L);
    }

    public o(long j, long j7) {
        this.f3487b = j;
        v vVar = j7 == 0 ? v.f3510c : new v(0L, j7);
        this.f3488c = new t(vVar, vVar);
    }
}

package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vj1 implements ak1 {
    public final zj1 f;
    public final long g;
    public final long h;
    public final ck1 i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public vj1(ck1 ck1Var, long j, long j2, long j3, long j4, boolean z) {
        zt0.D(j >= 0 && j2 > j);
        this.i = ck1Var;
        this.g = j;
        this.h = j2;
        if (j3 == j2 - j || z) {
            this.k = j4;
            this.j = 4;
        } else {
            this.j = 0;
        }
        this.f = new zj1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.ak1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.mf1 r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj1.b(mf1):long");
    }

    @Override // defpackage.ak1
    public final void d(long j) {
        long j2 = this.k - 1;
        String str = v23.a;
        this.m = Math.max(0L, Math.min(j, j2));
        this.j = 2;
        this.n = this.g;
        this.o = this.h;
        this.p = 0L;
        this.q = this.k;
    }

    @Override // defpackage.ak1
    public final /* bridge */ /* synthetic */ cg1 h() {
        if (this.k != 0) {
            return new uj1(this);
        }
        return null;
    }
}

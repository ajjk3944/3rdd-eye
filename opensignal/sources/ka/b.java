package ka;

import a5.d0;
import ca.u;
import qb.v;
import u5.x;

/* loaded from: classes.dex */
public final class b implements f, m6.d {
    public long B;
    public long D;
    public long E;
    public long F;
    public long G;
    public final Object H;
    public final Object I;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14228a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f14229d;

    /* renamed from: g, reason: collision with root package name */
    public final long f14230g;

    /* renamed from: r, reason: collision with root package name */
    public int f14231r;

    /* renamed from: x, reason: collision with root package name */
    public long f14232x;

    /* renamed from: y, reason: collision with root package name */
    public long f14233y;

    public b(h hVar, long j, long j7, long j10, long j11, boolean z10) {
        qb.b.g(j >= 0 && j7 > j);
        this.I = hVar;
        this.f14229d = j;
        this.f14230g = j7;
        if (j10 == j7 - j || z10) {
            this.f14232x = j11;
            this.f14231r = 4;
        } else {
            this.f14231r = 0;
        }
        this.H = new e(0);
    }

    @Override // ka.f
    public u c() {
        if (this.f14232x != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // ka.f
    public final void d(long j) {
        switch (this.f14228a) {
            case 0:
                this.B = v.j(j, 0L, this.f14232x - 1);
                this.f14231r = 2;
                this.D = this.f14229d;
                this.E = this.f14230g;
                this.F = 0L;
                this.G = this.f14232x;
                break;
            default:
                this.B = d0.i(j, 0L, this.f14232x - 1);
                this.f14231r = 2;
                this.D = this.f14229d;
                this.E = this.f14230g;
                this.F = 0L;
                this.G = this.f14232x;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    @Override // ka.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long g(ca.l r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b.g(ca.l):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    @Override // m6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long s(u5.l r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b.s(u5.l):long");
    }

    @Override // m6.d
    /* renamed from: c */
    public x mo37c() {
        if (this.f14232x != 0) {
            return new m6.a(this);
        }
        return null;
    }

    public b(h hVar, long j, long j7, long j10, long j11, boolean z10, byte b2) {
        a5.a.e(j >= 0 && j7 > j);
        this.I = hVar;
        this.f14229d = j;
        this.f14230g = j7;
        if (j10 != j7 - j && !z10) {
            this.f14231r = 0;
        } else {
            this.f14232x = j11;
            this.f14231r = 4;
        }
        this.H = new e(1);
    }
}

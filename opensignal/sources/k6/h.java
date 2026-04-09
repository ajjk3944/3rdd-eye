package k6;

import a5.d0;
import u5.w;
import u5.y;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f14162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14163b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14164c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14165d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14166e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f14167f;

    public h(long j, int i10, long j7, long j10, long[] jArr) {
        this.f14162a = j;
        this.f14163b = i10;
        this.f14164c = j7;
        this.f14167f = jArr;
        this.f14165d = j10;
        this.f14166e = j10 != -1 ? j + j10 : -1L;
    }

    @Override // k6.f
    public final long a() {
        return this.f14166e;
    }

    @Override // u5.x
    public final boolean b() {
        return this.f14167f != null;
    }

    @Override // u5.x
    public final w d(long j) {
        double d6;
        double d10;
        boolean zB = b();
        int i10 = this.f14163b;
        long j7 = this.f14162a;
        if (!zB) {
            y yVar = new y(0L, j7 + i10);
            return new w(yVar, yVar);
        }
        long jI = d0.i(j, 0L, this.f14164c);
        double d11 = (jI * 100.0d) / this.f14164c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d6 = 256.0d;
        } else if (d11 >= 100.0d) {
            d6 = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f14167f;
            a5.a.j(jArr);
            double d13 = jArr[i11];
            if (i11 == 99) {
                d6 = 256.0d;
                d10 = 256.0d;
            } else {
                d6 = 256.0d;
                d10 = jArr[i11 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i11)) + d13;
        }
        long j10 = this.f14165d;
        y yVar2 = new y(jI, j7 + d0.i(Math.round((d12 / d6) * j10), i10, j10 - 1));
        return new w(yVar2, yVar2);
    }

    @Override // u5.x
    public final long e() {
        return this.f14164c;
    }

    @Override // k6.f
    public final long getTimeUs(long j) {
        long j7 = j - this.f14162a;
        if (!b() || j7 <= this.f14163b) {
            return 0L;
        }
        long[] jArr = this.f14167f;
        a5.a.j(jArr);
        double d6 = (j7 * 256.0d) / this.f14165d;
        int iE = d0.e(jArr, (long) d6, true);
        long j10 = this.f14164c;
        long j11 = (iE * j10) / 100;
        long j12 = jArr[iE];
        int i10 = iE + 1;
        long j13 = (j10 * i10) / 100;
        return Math.round((j12 == (iE == 99 ? 256L : jArr[i10]) ? 0.0d : (d6 - j12) / (r0 - j12)) * (j13 - j11)) + j11;
    }
}

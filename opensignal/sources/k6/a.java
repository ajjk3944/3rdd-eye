package k6;

import u5.w;
import u5.x;
import u5.y;

/* loaded from: classes.dex */
public final class a implements f, x {

    /* renamed from: a, reason: collision with root package name */
    public final long f14131a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14133c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14134d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14135e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14136f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14137g;

    public a(long j, long j7, int i10, int i11, boolean z10) {
        this.f14131a = j;
        this.f14132b = j7;
        this.f14133c = i11 == -1 ? 1 : i11;
        this.f14135e = i10;
        this.f14137g = z10;
        if (j == -1) {
            this.f14134d = -1L;
            this.f14136f = -9223372036854775807L;
        } else {
            long j10 = j - j7;
            this.f14134d = j10;
            this.f14136f = (Math.max(0L, j10) * 8000000) / i10;
        }
    }

    @Override // k6.f
    public final long a() {
        return -1L;
    }

    @Override // u5.x
    public final boolean b() {
        return this.f14134d != -1 || this.f14137g;
    }

    @Override // u5.x
    public final w d(long j) {
        long j7 = this.f14134d;
        long j10 = this.f14132b;
        if (j7 == -1 && !this.f14137g) {
            y yVar = new y(0L, j10);
            return new w(yVar, yVar);
        }
        int i10 = this.f14135e;
        long j11 = this.f14133c;
        long jMin = (((i10 * j) / 8000000) / j11) * j11;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7 - j11);
        }
        long jMax = Math.max(jMin, 0L) + j10;
        long jMax2 = (Math.max(0L, jMax - j10) * 8000000) / i10;
        y yVar2 = new y(jMax2, jMax);
        if (j7 != -1 && jMax2 < j) {
            long j12 = jMax + j11;
            if (j12 < this.f14131a) {
                return new w(yVar2, new y((Math.max(0L, j12 - j10) * 8000000) / i10, j12));
            }
        }
        return new w(yVar2, yVar2);
    }

    @Override // u5.x
    public final long e() {
        return this.f14136f;
    }

    @Override // k6.f
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.f14132b) * 8000000) / this.f14135e;
    }
}

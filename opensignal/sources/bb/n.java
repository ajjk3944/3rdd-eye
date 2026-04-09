package bb;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import qb.v;
import ya.s0;

/* loaded from: classes.dex */
public final class n implements s0 {
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final Format f2552a;

    /* renamed from: g, reason: collision with root package name */
    public long[] f2554g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2555r;

    /* renamed from: x, reason: collision with root package name */
    public cb.f f2556x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2557y;

    /* renamed from: d, reason: collision with root package name */
    public final om.f f2553d = new om.f(9);
    public long D = -9223372036854775807L;

    public n(cb.f fVar, Format format, boolean z10) {
        this.f2552a = format;
        this.f2556x = fVar;
        this.f2554g = fVar.f3556b;
        c(fVar, z10);
    }

    @Override // ya.s0
    public final boolean b() {
        return true;
    }

    public final void c(cb.f fVar, boolean z10) {
        int i10 = this.B;
        long j = -9223372036854775807L;
        long j7 = i10 == 0 ? -9223372036854775807L : this.f2554g[i10 - 1];
        this.f2555r = z10;
        this.f2556x = fVar;
        long[] jArr = fVar.f3556b;
        this.f2554g = jArr;
        long j10 = this.D;
        if (j10 == -9223372036854775807L) {
            if (j7 != -9223372036854775807L) {
                this.B = v.b(jArr, j7, false);
            }
        } else {
            int iB = v.b(jArr, j10, true);
            this.B = iB;
            if (this.f2555r && iB == this.f2554g.length) {
                j = j10;
            }
            this.D = j;
        }
    }

    @Override // ya.s0
    public final int h(long j) {
        int iMax = Math.max(this.B, v.b(this.f2554g, j, true));
        int i10 = iMax - this.B;
        this.B = iMax;
        return i10;
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) throws IOException {
        int i11 = this.B;
        boolean z10 = i11 == this.f2554g.length;
        if (z10 && !this.f2555r) {
            dVar.f3295d = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f2557y) {
            cVar.f12354g = this.f2552a;
            this.f2557y = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        this.B = i11 + 1;
        byte[] bArrJ = this.f2553d.j(this.f2556x.f3555a[i11]);
        dVar.r(bArrJ.length);
        dVar.f26791r.put(bArrJ);
        dVar.f26793y = this.f2554g[i11];
        dVar.f3295d = 1;
        return -4;
    }

    @Override // ya.s0
    public final void a() {
    }
}

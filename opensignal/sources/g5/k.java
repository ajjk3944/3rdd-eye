package g5;

import a5.d0;
import androidx.media3.common.r;
import java.io.IOException;
import o5.x0;

/* loaded from: classes.dex */
public final class k implements x0 {
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final r f9361a;

    /* renamed from: g, reason: collision with root package name */
    public long[] f9363g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9364r;

    /* renamed from: x, reason: collision with root package name */
    public h5.f f9365x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9366y;

    /* renamed from: d, reason: collision with root package name */
    public final bm.e f9362d = new bm.e(8);
    public long D = -9223372036854775807L;

    public k(h5.f fVar, r rVar, boolean z10) {
        this.f9361a = rVar;
        this.f9365x = fVar;
        this.f9363g = fVar.f9929b;
        c(fVar, z10);
    }

    @Override // o5.x0
    public final boolean b() {
        return true;
    }

    public final void c(h5.f fVar, boolean z10) {
        int i10 = this.B;
        long j = -9223372036854775807L;
        long j7 = i10 == 0 ? -9223372036854775807L : this.f9363g[i10 - 1];
        this.f9364r = z10;
        this.f9365x = fVar;
        long[] jArr = fVar.f9929b;
        this.f9363g = jArr;
        long j10 = this.D;
        if (j10 == -9223372036854775807L) {
            if (j7 != -9223372036854775807L) {
                this.B = d0.b(jArr, j7, false);
            }
        } else {
            int iB = d0.b(jArr, j10, true);
            this.B = iB;
            if (this.f9364r && iB == this.f9363g.length) {
                j = j10;
            }
            this.D = j;
        }
    }

    @Override // o5.x0
    public final int h(long j) {
        int iMax = Math.max(this.B, d0.b(this.f9363g, j, true));
        int i10 = iMax - this.B;
        this.B = iMax;
        return i10;
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) throws IOException {
        int i11 = this.B;
        boolean z10 = i11 == this.f9363g.length;
        if (z10 && !this.f9364r) {
            gVar.f3295d = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f9366y) {
            cVar.f12354g = this.f9361a;
            this.f9366y = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.B = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrW = this.f9362d.w(this.f9365x.f9928a[i11]);
            gVar.r(bArrW.length);
            gVar.f3306r.put(bArrW);
        }
        gVar.f3308y = this.f9363g[i11];
        gVar.f3295d = 1;
        return -4;
    }

    @Override // o5.x0
    public final void a() {
    }
}

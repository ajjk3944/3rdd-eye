package g5;

import a5.d0;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.y0;
import androidx.media3.common.z;

/* loaded from: classes.dex */
public final class g extends a1 {
    public final long B;
    public final long D;
    public final h5.c E;
    public final e0 F;
    public final z G;

    /* renamed from: d, reason: collision with root package name */
    public final long f9353d;

    /* renamed from: g, reason: collision with root package name */
    public final long f9354g;

    /* renamed from: r, reason: collision with root package name */
    public final long f9355r;

    /* renamed from: x, reason: collision with root package name */
    public final int f9356x;

    /* renamed from: y, reason: collision with root package name */
    public final long f9357y;

    public g(long j, long j7, long j10, int i10, long j11, long j12, long j13, h5.c cVar, e0 e0Var, z zVar) {
        a5.a.i(cVar.f9911d == (zVar != null));
        this.f9353d = j;
        this.f9354g = j7;
        this.f9355r = j10;
        this.f9356x = i10;
        this.f9357y = j11;
        this.B = j12;
        this.D = j13;
        this.E = cVar;
        this.F = e0Var;
        this.G = zVar;
    }

    @Override // androidx.media3.common.a1
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f9356x) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // androidx.media3.common.a1
    public final y0 f(int i10, y0 y0Var, boolean z10) {
        a5.a.g(i10, h());
        h5.c cVar = this.E;
        String str = z10 ? cVar.b(i10).f9932a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f9356x + i10) : null;
        long jD = cVar.d(i10);
        long jG = d0.G(cVar.b(i10).f9933b - cVar.b(0).f9933b) - this.f9357y;
        y0Var.getClass();
        y0Var.h(str, numValueOf, 0, jD, jG, androidx.media3.common.b.f1565y, false);
        return y0Var;
    }

    @Override // androidx.media3.common.a1
    public final int h() {
        return this.E.f9918m.size();
    }

    @Override // androidx.media3.common.a1
    public final Object l(int i10) {
        a5.a.g(i10, h());
        return Integer.valueOf(this.f9356x + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    @Override // androidx.media3.common.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.common.z0 m(int r24, androidx.media3.common.z0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.g.m(int, androidx.media3.common.z0, long):androidx.media3.common.z0");
    }

    @Override // androidx.media3.common.a1
    public final int o() {
        return 1;
    }
}

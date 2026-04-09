package p5;

import androidx.media3.common.r;

/* loaded from: classes.dex */
public abstract class a extends l {
    public final long G;
    public final long H;
    public om.f I;
    public int[] J;

    public a(b5.h hVar, b5.k kVar, r rVar, int i10, Object obj, long j, long j7, long j10, long j11, long j12) {
        super(hVar, kVar, rVar, i10, obj, j, j7, j12);
        this.G = j10;
        this.H = j11;
    }

    public final int e(int i10) {
        int[] iArr = this.J;
        a5.a.j(iArr);
        return iArr[i10];
    }
}

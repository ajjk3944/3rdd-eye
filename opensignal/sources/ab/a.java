package ab;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public abstract class a extends m {
    public final long G;
    public final long H;
    public io.sentry.internal.debugmeta.c I;
    public int[] J;

    public a(pb.n nVar, na.c cVar, Format format, int i10, Object obj, long j, long j7, long j10, long j11, long j12) {
        super(nVar, cVar, format, i10, obj, j, j7, j12);
        this.G = j10;
        this.H = j11;
    }

    public final int e(int i10) {
        int[] iArr = this.J;
        qb.b.k(iArr);
        return iArr[i10];
    }
}

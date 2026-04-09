package ab;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public abstract class m extends f {
    public final long F;

    public m(pb.n nVar, na.c cVar, Format format, int i10, Object obj, long j, long j7, long j10) {
        super(nVar, cVar, 1, format, i10, obj, j, j7);
        format.getClass();
        this.F = j10;
    }

    public long a() {
        long j = this.F;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}

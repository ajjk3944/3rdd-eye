package p5;

import androidx.media3.common.r;

/* loaded from: classes.dex */
public abstract class l extends e {
    public final long F;

    public l(b5.h hVar, b5.k kVar, r rVar, int i10, Object obj, long j, long j7, long j10) {
        super(hVar, kVar, 1, rVar, i10, obj, j, j7);
        rVar.getClass();
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

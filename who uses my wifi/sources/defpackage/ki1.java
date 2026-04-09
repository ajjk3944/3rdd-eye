package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ki1 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final pi1 c = new pi1(0);
    public f23 d;
    public int e;
    public int f;
    public long g;

    public final long a(mf1 mf1Var, int i) {
        mf1Var.x(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}

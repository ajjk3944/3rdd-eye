package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kb3 {
    public final long a;
    public final long b;
    public long e;
    public long d = 5;
    public final Random f = new Random();
    public long c = 0;

    public kb3(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.e = j;
    }

    public final boolean a() {
        iz1 iz1Var = mz1.G;
        tw1 tw1Var = tw1.e;
        return ((Integer) tw1Var.c.a(iz1Var)).intValue() >= 0 && this.c > Math.max(this.d, (long) ((Integer) tw1Var.c.a(iz1Var)).intValue()) && this.e >= this.b;
    }
}

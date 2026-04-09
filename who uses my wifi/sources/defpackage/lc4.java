package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lc4 {
    public static final lc4 c;
    public static final lc4 d;
    public final long a;
    public final long b;

    static {
        lc4 lc4Var = new lc4(0L, 0L);
        new lc4(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new lc4(Long.MAX_VALUE, 0L);
        new lc4(0L, Long.MAX_VALUE);
        d = lc4Var;
    }

    public lc4(long j, long j2) {
        zt0.D(j >= 0);
        zt0.D(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lc4.class == obj.getClass()) {
            lc4 lc4Var = (lc4) obj;
            if (this.a == lc4Var.a && this.b == lc4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}

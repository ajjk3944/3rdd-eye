package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ez2 {
    public long a = 0;
    public int b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public final Object f = new Object();
    public final Object g = new Object();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Object j = new Object();

    public final synchronized long a() {
        long j;
        synchronized (this.f) {
            j = this.a;
        }
        return j;
    }

    public final synchronized long b() {
        long j;
        synchronized (this.i) {
            j = this.d;
        }
        return j;
    }
}

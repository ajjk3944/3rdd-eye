package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ck1 {
    public jg1 b;
    public nf1 c;
    public ak1 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final yj1 a = new yj1();
    public l92 j = new l92();

    public void a(boolean z) {
        int i;
        if (z) {
            this.j = new l92();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    public abstract long b(kz2 kz2Var);

    public abstract boolean c(kz2 kz2Var, long j, l92 l92Var);

    public void d(long j) {
        this.g = j;
    }
}

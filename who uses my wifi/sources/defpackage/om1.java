package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class om1 {
    public final jg1 a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;

    public om1(jg1 jg1Var) {
        this.a = jg1Var;
    }

    public final void a(int i) {
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.b;
            long j3 = this.k;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.a.c(j, this.m ? 1 : 0, i2, i, null);
        }
    }
}

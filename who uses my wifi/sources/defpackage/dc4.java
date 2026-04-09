package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dc4 {
    public static final kh4 t = new kh4(-1, new Object());
    public final oz1 a;
    public final kh4 b;
    public final long c;
    public final long d;
    public final int e;
    public final b84 f;
    public final boolean g;
    public final ri4 h;
    public final pj4 i;
    public final List j;
    public final kh4 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final sr1 o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public dc4(oz1 oz1Var, kh4 kh4Var, long j, long j2, int i, b84 b84Var, boolean z, ri4 ri4Var, pj4 pj4Var, List list, kh4 kh4Var2, boolean z2, int i2, int i3, sr1 sr1Var, long j3, long j4, long j5, long j6) {
        this.a = oz1Var;
        this.b = kh4Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = b84Var;
        this.g = z;
        this.h = ri4Var;
        this.i = pj4Var;
        this.j = list;
        this.k = kh4Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = sr1Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
    }

    public static dc4 a(pj4 pj4Var) {
        aw1 aw1Var = oz1.a;
        ri4 ri4Var = ri4.d;
        sn3 sn3Var = sn3.j;
        sr1 sr1Var = sr1.d;
        kh4 kh4Var = t;
        return new dc4(aw1Var, kh4Var, -9223372036854775807L, 0L, 1, null, false, ri4Var, pj4Var, sn3Var, kh4Var, false, 1, 0, sr1Var, 0L, 0L, 0L, 0L);
    }

    public final dc4 b(kh4 kh4Var, long j, long j2, long j3, long j4, ri4 ri4Var, pj4 pj4Var, List list) {
        kh4 kh4Var2 = this.k;
        boolean z = this.l;
        int i = this.m;
        int i2 = this.n;
        sr1 sr1Var = this.o;
        long j5 = this.p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new dc4(this.a, kh4Var, j2, j3, this.e, this.f, this.g, ri4Var, pj4Var, list, kh4Var2, z, i, i2, sr1Var, j5, j4, j, jElapsedRealtime);
    }

    public final dc4 c(oz1 oz1Var) {
        return new dc4(oz1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final dc4 d(int i) {
        return new dc4(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final dc4 e(b84 b84Var) {
        return new dc4(this.a, this.b, this.c, this.d, this.e, b84Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final dc4 f(boolean z) {
        return new dc4(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final dc4 g(kh4 kh4Var) {
        return new dc4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, kh4Var, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final dc4 h(int i, int i2, boolean z) {
        return new dc4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.p, this.q, this.r, this.s);
    }

    public final boolean i() {
        return this.e == 3 && this.l && this.n == 0;
    }
}

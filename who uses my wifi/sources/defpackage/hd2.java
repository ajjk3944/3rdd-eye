package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hd2 {
    public final String g;
    public final ra4 h;
    public long a = -1;
    public long b = -1;
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();
    public int i = 0;
    public int j = 0;
    public int k = 0;

    public hd2(String str, ra4 ra4Var) {
        this.g = str;
        this.h = ra4Var;
    }

    public final void a(pc4 pc4Var, long j) {
        long j2;
        long j3;
        Bundle bundle;
        int i;
        synchronized (this.f) {
            try {
                ra4 ra4Var = this.h;
                ra4Var.h();
                synchronized (ra4Var.a) {
                    j2 = ra4Var.o;
                }
                hg4.C.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.b == -1) {
                    if (jCurrentTimeMillis - j2 > ((Long) tw1.e.c.a(mz1.d1)).longValue()) {
                        this.d = -1;
                    } else {
                        ra4Var.h();
                        synchronized (ra4Var.a) {
                            i = ra4Var.q;
                        }
                        this.d = i;
                    }
                    this.b = j;
                    this.a = j;
                } else {
                    this.a = j;
                }
                if (((Boolean) tw1.e.c.a(mz1.W3)).booleanValue() || (bundle = pc4Var.h) == null || bundle.getInt("gw", 2) != 1) {
                    this.c++;
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 == 0) {
                        this.e = 0L;
                        ra4Var.n(jCurrentTimeMillis);
                    } else {
                        ra4Var.h();
                        synchronized (ra4Var.a) {
                            j3 = ra4Var.p;
                        }
                        this.e = jCurrentTimeMillis - j3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) d12.a.w()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}

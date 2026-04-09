package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z73 {
    public final ym a;
    public final mv2 b;
    public final Object c = new Object();
    public volatile int e = 1;
    public volatile long d = 0;

    public z73(ym ymVar, mv2 mv2Var) {
        this.a = ymVar;
        this.b = mv2Var;
    }

    public final void a(boolean z) {
        if (((Boolean) tw1.e.c.a(mz1.Rd)).booleanValue()) {
            lv2 lv2VarA = this.b.a();
            lv2VarA.k("action", "mbs_state");
            lv2VarA.k("mbs_state", true != z ? "0" : "1");
            lv2VarA.m();
        }
        if (z) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.c) {
            try {
                if (this.e == 3) {
                    if (this.d + ((Long) tw1.e.c.a(mz1.q6)).longValue() <= jCurrentTimeMillis) {
                        this.e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i2) {
        b();
        Object obj = this.c;
        this.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.e != i) {
                    return;
                }
                this.e = i2;
                if (this.e == 3) {
                    this.d = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

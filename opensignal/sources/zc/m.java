package zc;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: d, reason: collision with root package name */
    public static volatile yh.a f27003d;

    /* renamed from: a, reason: collision with root package name */
    public final k1 f27004a;

    /* renamed from: b, reason: collision with root package name */
    public final re.a f27005b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f27006c;

    public m(k1 k1Var) {
        cc.s.h(k1Var);
        this.f27004a = k1Var;
        this.f27005b = new re.a(26, this, k1Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            k1 k1Var = this.f27004a;
            k1Var.C0().getClass();
            this.f27006c = System.currentTimeMillis();
            if (d().postDelayed(this.f27005b, j)) {
                return;
            }
            k1Var.x().B.c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f27006c = 0L;
        d().removeCallbacks(this.f27005b);
    }

    public final Handler d() {
        yh.a aVar;
        if (f27003d != null) {
            return f27003d;
        }
        synchronized (m.class) {
            try {
                if (f27003d == null) {
                    f27003d = new yh.a(this.f27004a.u0().getMainLooper(), 1);
                }
                aVar = f27003d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}

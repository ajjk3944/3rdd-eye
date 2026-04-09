package ec;

import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: d, reason: collision with root package name */
    public static volatile ac.k f22901d;

    /* renamed from: a, reason: collision with root package name */
    public final w1 f22902a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.a f22903b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f22904c;

    public n(w1 w1Var) {
        pb.y.h(w1Var);
        this.f22902a = w1Var;
        this.f22903b = new vd.a(this, false, w1Var, 12);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            w1 w1Var = this.f22902a;
            w1Var.f().getClass();
            this.f22904c = System.currentTimeMillis();
            if (d().postDelayed(this.f22903b, j)) {
                return;
            }
            w1Var.a().g.e(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f22904c = 0L;
        d().removeCallbacks(this.f22903b);
    }

    public final Handler d() {
        ac.k kVar;
        if (f22901d != null) {
            return f22901d;
        }
        synchronized (n.class) {
            try {
                if (f22901d == null) {
                    f22901d = new ac.k(this.f22902a.d().getMainLooper(), 2);
                }
                kVar = f22901d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}

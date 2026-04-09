package ec;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.g5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r3 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public ac.k f23046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23047e;

    /* renamed from: f, reason: collision with root package name */
    public final o7.c f23048f;
    public final g5 g;

    /* renamed from: h, reason: collision with root package name */
    public final y4.a f23049h;

    public r3(o1 o1Var) {
        super(o1Var);
        this.f23047e = true;
        this.f23048f = new o7.c(15, this);
        g5 g5Var = new g5();
        g5Var.f11376d = this;
        o1 o1Var2 = (o1) this.f218b;
        g5Var.f11375c = new q3(g5Var, o1Var2, 0);
        o1Var2.f22957k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g5Var.f11373a = jElapsedRealtime;
        g5Var.f11374b = jElapsedRealtime;
        this.g = g5Var;
        this.f23049h = new y4.a((Object) this, false);
    }

    @Override // ec.f0
    public final boolean E() {
        return false;
    }

    public final void F() {
        B();
        if (this.f23046d == null) {
            this.f23046d = new ac.k(Looper.getMainLooper(), 2);
        }
    }
}

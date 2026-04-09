package ec;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f22729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f22730c;

    public /* synthetic */ g3(i3 i3Var, g0 g0Var, int i4) {
        this.f22728a = i4;
        this.f22729b = g0Var;
        this.f22730c = i3Var;
    }

    private final void a() {
        i3 i3Var = this.f22730c;
        synchronized (i3Var) {
            try {
                i3Var.f22796a = false;
                j3 j3Var = i3Var.f22798c;
                if (!j3Var.S()) {
                    s0 s0Var = ((o1) j3Var.f218b).f22954f;
                    o1.m(s0Var);
                    s0Var.f23060o.d("Connected to service");
                    g0 g0Var = this.f22729b;
                    j3Var.B();
                    j3Var.f22819e = g0Var;
                    j3Var.O();
                    j3Var.Q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22728a) {
            case 0:
                a();
                return;
            default:
                i3 i3Var = this.f22730c;
                synchronized (i3Var) {
                    try {
                        i3Var.f22796a = false;
                        j3 j3Var = i3Var.f22798c;
                        if (!j3Var.S()) {
                            s0 s0Var = ((o1) j3Var.f218b).f22954f;
                            o1.m(s0Var);
                            s0Var.f23059n.d("Connected to remote service");
                            g0 g0Var = this.f22729b;
                            j3Var.B();
                            j3Var.f22819e = g0Var;
                            j3Var.O();
                            j3Var.Q();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                j3 j3Var2 = this.f22730c.f22798c;
                ScheduledExecutorService scheduledExecutorService = j3Var2.f22821h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    j3Var2.f22821h = null;
                    return;
                }
                return;
        }
    }
}

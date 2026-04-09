package zc;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class u2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27231a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f27232d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w2 f27233g;

    public /* synthetic */ u2(w2 w2Var, x xVar, int i10) {
        this.f27231a = i10;
        this.f27232d = xVar;
        this.f27233g = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27231a) {
            case 0:
                w2 w2Var = this.f27233g;
                synchronized (w2Var) {
                    try {
                        w2Var.f27258a = false;
                        x2 x2Var = w2Var.f27260c;
                        if (!x2Var.J1()) {
                            j0 j0Var = ((c1) x2Var.f1504d).f26889y;
                            c1.g(j0Var);
                            j0Var.K.b("Connected to service");
                            x xVar = this.f27232d;
                            x2Var.s1();
                            x2Var.f27267x = xVar;
                            x2Var.F1();
                            x2Var.H1();
                        }
                    } finally {
                    }
                }
                return;
            default:
                w2 w2Var2 = this.f27233g;
                synchronized (w2Var2) {
                    try {
                        w2Var2.f27258a = false;
                        x2 x2Var2 = w2Var2.f27260c;
                        if (!x2Var2.J1()) {
                            j0 j0Var2 = ((c1) x2Var2.f1504d).f26889y;
                            c1.g(j0Var2);
                            j0Var2.J.b("Connected to remote service");
                            x xVar2 = this.f27232d;
                            x2Var2.s1();
                            x2Var2.f27267x = xVar2;
                            x2Var2.F1();
                            x2Var2.H1();
                        }
                    } finally {
                    }
                }
                x2 x2Var3 = this.f27233g.f27260c;
                ScheduledExecutorService scheduledExecutorService = x2Var3.D;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    x2Var3.D = null;
                    return;
                }
                return;
        }
    }
}

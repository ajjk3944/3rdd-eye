package Ng;

import Lg.f;
import Lg.l;
import java.util.Timer;

/* loaded from: classes4.dex */
public abstract class a extends Mg.a {

    /* renamed from: c, reason: collision with root package name */
    private static Ej.b f16421c = Ej.c.i(a.class);

    /* renamed from: b, reason: collision with root package name */
    protected int f16422b;

    public a(l lVar) {
        super(lVar);
        this.f16422b = 0;
    }

    protected abstract f g(f fVar);

    protected abstract f h(f fVar);

    protected abstract String i();

    public void j(Timer timer) {
        if (e().W0() || e().V0()) {
            return;
        }
        timer.schedule(this, 225L, 225L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            if (!e().W0() && !e().V0()) {
                int i10 = this.f16422b;
                this.f16422b = i10 + 1;
                if (i10 >= 3) {
                    cancel();
                    return;
                }
                f16421c.c("{}.run() JmDNS {}", f(), i());
                f fVarH = h(new f(0));
                if (e().T0()) {
                    fVarH = g(fVarH);
                }
                if (fVarH.n()) {
                    return;
                }
                e().m1(fVarH);
                return;
            }
            cancel();
        } catch (Throwable th2) {
            f16421c.j("{}.run() exception ", f(), th2);
            e().c1();
        }
    }

    @Override // Mg.a
    public String toString() {
        return super.toString() + " count: " + this.f16422b;
    }
}

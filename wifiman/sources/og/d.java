package Og;

import Lg.f;
import Lg.h;
import Lg.l;
import Lg.q;
import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import javax.jmdns.impl.constants.g;

/* loaded from: classes4.dex */
public class d extends c {
    public d(l lVar) {
        super(lVar, c.n());
        g gVar = g.PROBING_1;
        t(gVar);
        i(gVar);
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        s();
        return super.cancel();
    }

    @Override // Mg.a
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Prober(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // Og.c
    protected void h() {
        t(q().advance());
        if (q().isProbing()) {
            return;
        }
        cancel();
        e().J();
    }

    @Override // Og.c
    protected f j(f fVar) throws IOException {
        fVar.A(Lg.g.D(e().F0().p(), javax.jmdns.impl.constants.e.TYPE_ANY, javax.jmdns.impl.constants.d.CLASS_IN, false));
        Iterator it = e().F0().a(javax.jmdns.impl.constants.d.CLASS_ANY, false, o()).iterator();
        while (it.hasNext()) {
            fVar = c(fVar, (h) it.next());
        }
        return fVar;
    }

    @Override // Og.c
    protected f k(q qVar, f fVar) {
        String strU = qVar.u();
        javax.jmdns.impl.constants.e eVar = javax.jmdns.impl.constants.e.TYPE_ANY;
        javax.jmdns.impl.constants.d dVar = javax.jmdns.impl.constants.d.CLASS_IN;
        return c(d(fVar, Lg.g.D(strU, eVar, dVar, false)), new h.f(qVar.u(), dVar, false, o(), qVar.p(), qVar.B(), qVar.o(), e().F0().p()));
    }

    @Override // Og.c
    protected boolean l() {
        return (e().W0() || e().V0()) ? false : true;
    }

    @Override // Og.c
    protected f m() {
        return new f(0);
    }

    @Override // Og.c
    public String p() {
        return "probing";
    }

    @Override // Og.c
    protected void r(Throwable th2) {
        e().c1();
    }

    @Override // Mg.a
    public String toString() {
        return super.toString() + " state: " + q();
    }

    public void u(Timer timer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - e().E0() < 5000) {
            e().o1(e().M0() + 1);
        } else {
            e().o1(1);
        }
        e().n1(jCurrentTimeMillis);
        if (e().T0() && e().M0() < 10) {
            timer.schedule(this, l.H0().nextInt(251), 250L);
        } else {
            if (e().W0() || e().V0()) {
                return;
            }
            timer.schedule(this, 1000L, 1000L);
        }
    }
}

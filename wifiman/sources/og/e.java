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
public class e extends c {
    public e(l lVar) {
        super(lVar, c.n());
        g gVar = g.ANNOUNCED;
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
        sb2.append("Renewer(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // Og.c
    protected void h() {
        t(q().advance());
        if (q().isAnnounced()) {
            return;
        }
        cancel();
    }

    @Override // Og.c
    protected f j(f fVar) throws IOException {
        Iterator it = e().F0().a(javax.jmdns.impl.constants.d.CLASS_ANY, true, o()).iterator();
        while (it.hasNext()) {
            fVar = a(fVar, null, (h) it.next());
        }
        return fVar;
    }

    @Override // Og.c
    protected f k(q qVar, f fVar) throws IOException {
        Iterator it = qVar.K(javax.jmdns.impl.constants.d.CLASS_ANY, true, o(), e().F0()).iterator();
        while (it.hasNext()) {
            fVar = a(fVar, null, (h) it.next());
        }
        return fVar;
    }

    @Override // Og.c
    protected boolean l() {
        return (e().W0() || e().V0()) ? false : true;
    }

    @Override // Og.c
    protected f m() {
        return new f(33792);
    }

    @Override // Og.c
    public String p() {
        return "renewing";
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
        if (e().W0() || e().V0()) {
            return;
        }
        int i10 = javax.jmdns.impl.constants.a.f50180e;
        timer.schedule(this, i10, i10);
    }
}

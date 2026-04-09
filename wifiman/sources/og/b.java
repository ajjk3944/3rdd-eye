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
public class b extends c {
    public b(l lVar) {
        super(lVar, 0);
        g gVar = g.CANCELING_1;
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
        sb2.append("Canceler(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // Og.c
    protected void h() {
        t(q().advance());
        if (q().isCanceling()) {
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
        return true;
    }

    @Override // Og.c
    protected f m() {
        return new f(33792);
    }

    @Override // Og.c
    public String p() {
        return "canceling";
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
        timer.schedule(this, 0L, 1000L);
    }
}

package Mg;

import Lg.l;
import java.util.Timer;

/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: b, reason: collision with root package name */
    static Ej.b f13168b = Ej.c.i(b.class);

    public b(l lVar) {
        super(lVar);
    }

    @Override // Mg.a
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RecordReaper(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    public void g(Timer timer) {
        if (e().W0() || e().V0()) {
            return;
        }
        timer.schedule(this, 10000L, 10000L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (e().W0() || e().V0()) {
            return;
        }
        f13168b.d("{}.run() JmDNS reaping cache", f());
        e().w0();
    }
}

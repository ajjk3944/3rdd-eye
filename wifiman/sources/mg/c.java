package Mg;

import Lg.f;
import Lg.g;
import Lg.h;
import Lg.l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: f, reason: collision with root package name */
    static Ej.b f13169f = Ej.c.i(c.class);

    /* renamed from: b, reason: collision with root package name */
    private final Lg.c f13170b;

    /* renamed from: c, reason: collision with root package name */
    private final InetAddress f13171c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13172d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13173e;

    public c(l lVar, Lg.c cVar, InetAddress inetAddress, int i10) {
        super(lVar);
        this.f13170b = cVar;
        this.f13171c = inetAddress;
        this.f13172d = i10;
        this.f13173e = i10 != javax.jmdns.impl.constants.a.f50178c;
    }

    @Override // Mg.a
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Responder(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    public void g(Timer timer) {
        boolean zC = true;
        for (g gVar : this.f13170b.l()) {
            f13169f.g("{}.start() question={}", f(), gVar);
            zC = gVar.C(e());
            if (!zC) {
                break;
            }
        }
        int iNextInt = (!zC || this.f13170b.r()) ? (l.H0().nextInt(96) + 20) - this.f13170b.B() : 0;
        int i10 = iNextInt >= 0 ? iNextInt : 0;
        f13169f.g("{}.start() Responder chosen delay={}", f(), Integer.valueOf(i10));
        if (e().W0() || e().V0()) {
            return;
        }
        timer.schedule(this, i10);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() throws IOException {
        e().k1(this.f13170b);
        HashSet<g> hashSet = new HashSet();
        Set<h> hashSet2 = new HashSet();
        if (e().T0()) {
            try {
                for (g gVar : this.f13170b.l()) {
                    f13169f.c("{}.run() JmDNS responding to: {}", f(), gVar);
                    if (this.f13173e) {
                        hashSet.add(gVar);
                    }
                    gVar.z(e(), hashSet2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (h hVar : this.f13170b.c()) {
                    if (hVar.M(jCurrentTimeMillis)) {
                        hashSet2.remove(hVar);
                        f13169f.n("{} - JmDNS Responder Known Answer Removed", f());
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                f13169f.n("{}.run() JmDNS responding", f());
                f fVar = new f(33792, !this.f13173e, this.f13170b.C());
                if (this.f13173e) {
                    fVar.F(new InetSocketAddress(this.f13171c, this.f13172d));
                }
                fVar.w(this.f13170b.f());
                for (g gVar2 : hashSet) {
                    if (gVar2 != null) {
                        fVar = d(fVar, gVar2);
                    }
                }
                for (h hVar2 : hashSet2) {
                    if (hVar2 != null) {
                        fVar = a(fVar, this.f13170b, hVar2);
                    }
                }
                if (fVar.n()) {
                    return;
                }
                e().m1(fVar);
            } catch (Throwable th2) {
                f13169f.j("{}run() exception ", f(), th2);
                e().close();
            }
        }
    }

    @Override // Mg.a
    public String toString() {
        return super.toString() + " incomming: " + this.f13170b;
    }
}

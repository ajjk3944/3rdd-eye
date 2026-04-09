package Ng;

import Lg.f;
import Lg.g;
import Lg.h;
import Lg.l;
import java.io.IOException;
import java.util.Iterator;
import javax.jmdns.impl.constants.e;

/* loaded from: classes4.dex */
public class d extends a {
    public d(l lVar) {
        super(lVar);
    }

    @Override // Mg.a
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TypeResolver(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // Ng.a
    protected f g(f fVar) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = e().J0().values().iterator();
        while (it.hasNext()) {
            fVar = b(fVar, new h.e("_services._dns-sd._udp.local.", javax.jmdns.impl.constants.d.CLASS_IN, false, javax.jmdns.impl.constants.a.f50179d, ((l.j) it.next()).f()), jCurrentTimeMillis);
        }
        return fVar;
    }

    @Override // Ng.a
    protected f h(f fVar) {
        return d(fVar, g.D("_services._dns-sd._udp.local.", e.TYPE_PTR, javax.jmdns.impl.constants.d.CLASS_IN, false));
    }

    @Override // Ng.a
    protected String i() {
        return "querying type";
    }
}

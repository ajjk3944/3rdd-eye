package Ng;

import Lg.f;
import Lg.g;
import Lg.h;
import Lg.l;
import java.io.IOException;
import javax.jmdns.impl.constants.e;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    private final String f16424d;

    public c(l lVar, String str) {
        super(lVar);
        this.f16424d = str;
    }

    @Override // Mg.a
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ServiceResolver(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // Ng.a
    protected f g(f fVar) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Kg.d dVar : e().K0().values()) {
            fVar = b(fVar, new h.e(dVar.A(), javax.jmdns.impl.constants.d.CLASS_IN, false, javax.jmdns.impl.constants.a.f50179d, dVar.u()), jCurrentTimeMillis);
        }
        return fVar;
    }

    @Override // Ng.a
    protected f h(f fVar) {
        return d(fVar, g.D(this.f16424d, e.TYPE_PTR, javax.jmdns.impl.constants.d.CLASS_IN, false));
    }

    @Override // Ng.a
    protected String i() {
        return "querying service";
    }
}

package Ng;

import Lg.f;
import Lg.g;
import Lg.h;
import Lg.l;
import Lg.q;
import java.io.IOException;
import java.util.Iterator;
import javax.jmdns.impl.constants.e;

/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final q f16423d;

    public b(l lVar, q qVar) {
        super(lVar);
        this.f16423d = qVar;
        qVar.j0(e());
        e().s0(qVar, g.D(qVar.u(), e.TYPE_ANY, javax.jmdns.impl.constants.d.CLASS_IN, false));
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        boolean zCancel = super.cancel();
        if (!this.f16423d.F()) {
            e().g1(this.f16423d);
        }
        return zCancel;
    }

    @Override // Mg.a
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ServiceInfoResolver(");
        sb2.append(e() != null ? e().G0() : "");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // Ng.a
    protected f g(f fVar) throws IOException {
        if (!this.f16423d.D()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Lg.a aVarZ0 = e().z0();
            String strU = this.f16423d.u();
            e eVar = e.TYPE_SRV;
            javax.jmdns.impl.constants.d dVar = javax.jmdns.impl.constants.d.CLASS_IN;
            fVar = b(b(fVar, (h) aVarZ0.l(strU, eVar, dVar), jCurrentTimeMillis), (h) e().z0().l(this.f16423d.u(), e.TYPE_TXT, dVar), jCurrentTimeMillis);
            if (this.f16423d.w().length() > 0) {
                Iterator it = e().z0().p(this.f16423d.w(), e.TYPE_A, dVar).iterator();
                while (it.hasNext()) {
                    fVar = b(fVar, (h) ((Lg.b) it.next()), jCurrentTimeMillis);
                }
                Iterator it2 = e().z0().p(this.f16423d.w(), e.TYPE_AAAA, javax.jmdns.impl.constants.d.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    fVar = b(fVar, (h) ((Lg.b) it2.next()), jCurrentTimeMillis);
                }
            }
        }
        return fVar;
    }

    @Override // Ng.a
    protected f h(f fVar) throws IOException {
        if (this.f16423d.D()) {
            return fVar;
        }
        String strU = this.f16423d.u();
        e eVar = e.TYPE_SRV;
        javax.jmdns.impl.constants.d dVar = javax.jmdns.impl.constants.d.CLASS_IN;
        f fVarD = d(d(fVar, g.D(strU, eVar, dVar, false)), g.D(this.f16423d.u(), e.TYPE_TXT, dVar, false));
        return this.f16423d.w().length() > 0 ? d(d(fVarD, g.D(this.f16423d.w(), e.TYPE_A, dVar, false)), g.D(this.f16423d.w(), e.TYPE_AAAA, dVar, false)) : fVarD;
    }

    @Override // Ng.a
    protected String i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("querying service info: ");
        q qVar = this.f16423d;
        sb2.append(qVar != null ? qVar.u() : "null");
        return sb2.toString();
    }
}

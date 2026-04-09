package sl;

import java.util.Collections;
import java.util.List;
import nk.k;
import s2.t;
import uk.i;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends cm.g {

    /* renamed from: e, reason: collision with root package name */
    public final nk.e f33827e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f33828f;
    public final cm.g g;

    public c(nk.e eVar, Object obj, cm.g gVar) {
        k.e(obj, "value");
        k.e(gVar, "next");
        this.f33827e = eVar;
        this.f33828f = obj;
        this.g = gVar;
    }

    @Override // cm.g
    public final cm.g G(nk.e eVar, Object obj) {
        nk.e eVar2 = this.f33827e;
        boolean zEquals = eVar.equals(eVar2);
        cm.g cVar = this.g;
        if (!zEquals) {
            cm.g gVarG = cVar.G(eVar, null);
            cVar = gVarG == cVar ? this : new c(eVar2, this.f33828f, gVarG);
        }
        return obj != null ? new c(eVar, obj, cVar) : cVar;
    }

    @Override // cm.g
    public final Object k(nk.e eVar) {
        return eVar.equals(this.f33827e) ? pk.a.h(eVar).cast(this.f33828f) : this.g.k(eVar);
    }

    public final String toString() {
        List listT0;
        List listI = i.I(new uk.e(new a6.e(25, this), new t(29)));
        if (listI.size() <= 1) {
            listT0 = n.r0(listI);
        } else {
            listT0 = n.t0(listI);
            Collections.reverse(listT0);
        }
        return n.g0(listT0, null, "{", "}", new b(0), 25);
    }
}

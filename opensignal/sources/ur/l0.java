package ur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class l0 extends at.o {

    /* renamed from: b, reason: collision with root package name */
    public final rr.a0 f23648b;

    /* renamed from: c, reason: collision with root package name */
    public final qs.c f23649c;

    public l0(rr.a0 a0Var, qs.c cVar) {
        br.l.e(a0Var, "moduleDescriptor");
        br.l.e(cVar, "fqName");
        this.f23648b = a0Var;
        this.f23649c = cVar;
    }

    @Override // at.o, at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        if (fVar.a(at.f.f2277h)) {
            qs.c cVar = this.f23649c;
            if (!cVar.d() || !fVar.f2287a.contains(at.c.f2269a)) {
                rr.a0 a0Var = this.f23648b;
                Collection collectionL = a0Var.l(cVar, kVar);
                ArrayList arrayList = new ArrayList(collectionL.size());
                Iterator it = collectionL.iterator();
                while (it.hasNext()) {
                    qs.g gVarF = ((qs.c) it.next()).f();
                    br.l.d(gVarF, "subFqName.shortName()");
                    if (((Boolean) kVar.a(gVarF)).booleanValue()) {
                        x xVar = null;
                        if (!gVarF.f21036d) {
                            x xVar2 = (x) a0Var.J0(cVar.c(gVarF));
                            if (!((Boolean) io.sentry.config.a.Z(xVar2.B, x.E[1])).booleanValue()) {
                                xVar = xVar2;
                            }
                        }
                        rt.k.a(arrayList, xVar);
                    }
                }
                return arrayList;
            }
        }
        return mq.w.f16945a;
    }

    @Override // at.o, at.n
    public final Set e() {
        return mq.y.f16947a;
    }

    public final String toString() {
        return "subpackages of " + this.f23649c + " from " + this.f23648b;
    }
}

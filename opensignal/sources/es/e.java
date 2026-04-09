package es;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8286d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f8287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(0);
        this.f8286d = i10;
        this.f8287g = fVar;
    }

    @Override // ar.a
    public final Object c() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f8286d) {
            case 0:
                f fVar = this.f8287g;
                ArrayList arrayListB = fVar.f8292b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    hs.a aVar = (hs.a) it.next();
                    qs.g gVar = ((xr.f) aVar).f25503a;
                    if (gVar == null) {
                        gVar = as.a0.f2167b;
                    }
                    vs.g gVarC = fVar.c(aVar);
                    lq.l lVar = gVarC != null ? new lq.l(gVar, gVarC) : null;
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                return mq.b0.V(arrayList);
            case 1:
                return xr.d.a(ir.f0.D(ir.f0.z(this.f8287g.f8292b.f25501a))).b();
            default:
                f fVar2 = this.f8287g;
                qs.c cVarA = fVar2.a();
                xr.e eVar = fVar2.f8292b;
                cj.a aVar2 = fVar2.f8291a;
                if (cVarA == null) {
                    return kt.k.c(kt.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, eVar.toString());
                }
                ds.a aVar3 = (ds.a) aVar2.f3974d;
                ds.a aVar4 = (ds.a) aVar2.f3974d;
                rr.f fVarB = qr.e.b(cVarA, aVar3.f7458o.n());
                if (fVarB == null) {
                    xr.o oVar = new xr.o(ir.f0.D(ir.f0.z(eVar.f25501a)));
                    b9.e eVar2 = aVar4.k;
                    eVar2.getClass();
                    y9.u uVar = (y9.u) eVar2.f2481d;
                    if (uVar == null) {
                        br.l.l("resolver");
                        throw null;
                    }
                    fVarB = uVar.f(oVar);
                    if (fVarB == null) {
                        fVarB = rr.w.f(aVar4.f7458o, qs.b.j(cVarA), aVar4.f7449d.c().f7502l);
                    }
                }
                return fVarB.q();
        }
    }
}

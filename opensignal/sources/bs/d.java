package bs;

import as.a0;
import ir.f0;
import lq.l;
import mq.b0;
import or.n;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final qs.g f2929a = qs.g.e("message");

    /* renamed from: b, reason: collision with root package name */
    public static final qs.g f2930b = qs.g.e("allowedTargets");

    /* renamed from: c, reason: collision with root package name */
    public static final qs.g f2931c = qs.g.e("value");

    /* renamed from: d, reason: collision with root package name */
    public static final Object f2932d = b0.R(new l(n.f19706t, a0.f2168c), new l(n.f19709w, a0.f2169d), new l(n.f19710x, a0.f2171f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static cs.i a(qs.c cVar, hs.b bVar, cj.a aVar) {
        xr.e eVarA;
        br.l.e(cVar, "kotlinName");
        br.l.e(bVar, "annotationOwner");
        br.l.e(aVar, "c");
        if (cVar.equals(n.f19699m)) {
            qs.c cVar2 = a0.f2170e;
            br.l.d(cVar2, "DEPRECATED_ANNOTATION");
            xr.e eVarA2 = bVar.a(cVar2);
            if (eVarA2 != null) {
                return new h(eVarA2, aVar);
            }
        }
        qs.c cVar3 = (qs.c) f2932d.get(cVar);
        if (cVar3 == null || (eVarA = bVar.a(cVar3)) == null) {
            return null;
        }
        return b(aVar, eVarA, false);
    }

    public static cs.i b(cj.a aVar, xr.e eVar, boolean z10) {
        br.l.e(eVar, "annotation");
        br.l.e(aVar, "c");
        qs.b bVarA = xr.d.a(f0.D(f0.z(eVar.f25501a)));
        if (bVarA.equals(qs.b.j(a0.f2168c))) {
            return new k(eVar, aVar);
        }
        if (bVarA.equals(qs.b.j(a0.f2169d))) {
            return new j(eVar, aVar);
        }
        if (bVarA.equals(qs.b.j(a0.f2171f))) {
            return new c(aVar, eVar, n.f19710x);
        }
        if (bVarA.equals(qs.b.j(a0.f2170e))) {
            return null;
        }
        return new es.f(aVar, eVar, z10);
    }
}

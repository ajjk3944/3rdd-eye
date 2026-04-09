package qr;

import ir.v;

/* loaded from: classes.dex */
public final class e implements rt.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f20977a = new e();

    public static rr.f a(rr.f fVar) {
        qs.e eVarG = ts.d.g(fVar);
        String str = d.f20965a;
        qs.c cVar = (qs.c) d.k.get(eVarG);
        if (cVar != null) {
            rr.f fVarI = xs.d.e(fVar).i(cVar);
            br.l.d(fVarI, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return fVarI;
        }
        throw new IllegalArgumentException("Given class " + fVar + " is not a read-only collection");
    }

    public static rr.f b(qs.c cVar, or.h hVar) {
        br.l.e(hVar, "builtIns");
        String str = d.f20965a;
        qs.b bVar = (qs.b) d.f20972h.get(cVar.i());
        if (bVar != null) {
            return hVar.i(bVar.b());
        }
        return null;
    }

    @Override // rt.a
    public Iterable d(Object obj) {
        v[] vVarArr = r.f21002g;
        return ((rr.d) obj).u1().p();
    }
}

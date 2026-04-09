package lu;

import ku.l1;
import ku.v0;
import ku.w0;

/* loaded from: classes.dex */
public final class q implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f15955a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f15956b;

    static {
        iu.c cVar = iu.c.f12996l;
        if (tt.l.D0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((nq.h) w0.f14634a.values()).iterator();
        while (((k4.c) it).hasNext()) {
            gu.a aVar = (gu.a) ((nq.d) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.getDescriptor().h())) {
                throw new IllegalArgumentException(tt.m.a0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + br.x.f2918a.b(aVar.getClass()).p() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f15956b = new v0("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        l lVarJ = xu.d.c(cVar).j();
        if (lVarJ instanceof p) {
            return (p) lVarJ;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw mu.l.d(-1, lVarJ.toString(), h0.b.k(br.x.f2918a, lVarJ.getClass(), sb2));
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f15956b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        p pVar = (p) obj;
        br.l.e(pVar, "value");
        String str = pVar.f15954d;
        xu.d.a(dVar);
        if (pVar.f15953a) {
            dVar.r(str);
            return;
        }
        Long lP0 = tt.s.p0(str);
        if (lP0 != null) {
            dVar.q(lP0.longValue());
            return;
        }
        lq.w wVarK = dr.a.K(str);
        if (wVarK != null) {
            dVar.m(l1.f14577b).q(wVarK.f15587a);
            return;
        }
        Double dD0 = tt.r.d0(str);
        if (dD0 != null) {
            dVar.e(dD0.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            dVar.h(bool.booleanValue());
        } else {
            dVar.r(str);
        }
    }
}

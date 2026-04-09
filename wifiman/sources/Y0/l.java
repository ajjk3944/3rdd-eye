package Y0;

/* loaded from: classes.dex */
public interface l {
    default long e0(float f10) {
        Z0.b bVar = Z0.b.f25072a;
        if (!bVar.f(y())) {
            return w.f(f10 / y());
        }
        Z0.a aVarB = bVar.b(y());
        return w.f(aVarB != null ? aVarB.a(f10) : f10 / y());
    }

    default float n0(long j10) {
        if (!x.g(v.g(j10), x.f24553b.b())) {
            m.b("Only Sp can convert to Px");
        }
        Z0.b bVar = Z0.b.f25072a;
        if (!bVar.f(y())) {
            return h.j(v.h(j10) * y());
        }
        Z0.a aVarB = bVar.b(y());
        float fH = v.h(j10);
        return h.j(aVarB == null ? fH * y() : aVarB.b(fH));
    }

    float y();
}

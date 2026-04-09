package i7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends k {
    @Override // i7.e
    public final Object f(s7.a aVar, float f10) {
        return Float.valueOf(m(aVar, f10));
    }

    public final float l() {
        return m(this.f25874c.k(), c());
    }

    public final float m(s7.a aVar, float f10) {
        float f11;
        Object obj = aVar.f33484b;
        Object obj2 = aVar.f33484b;
        if (obj == null || aVar.f33485c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        km.o oVar = this.f25876e;
        if (oVar != null) {
            f11 = f10;
            Float f12 = (Float) oVar.l(aVar.g, aVar.f33489h.floatValue(), (Float) obj2, (Float) aVar.f33485c, f11, d(), this.f25875d);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        if (aVar.f33490i == -3987645.8f) {
            aVar.f33490i = ((Float) obj2).floatValue();
        }
        float f13 = aVar.f33490i;
        if (aVar.j == -3987645.8f) {
            aVar.j = ((Float) aVar.f33485c).floatValue();
        }
        return r7.h.f(f13, aVar.j, f11);
    }
}

package u8;

/* loaded from: classes.dex */
public final class h extends j {
    @Override // u8.d
    public final Object g(f9.a aVar, float f10) {
        return Float.valueOf(n(aVar, f10));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(f9.a aVar, float f10) {
        float f11;
        Object obj = aVar.f8705b;
        Object obj2 = aVar.f8705b;
        if (obj == null || aVar.f8706c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bm.e eVar = this.f23451e;
        if (eVar != null) {
            f11 = f10;
            Float f12 = (Float) eVar.B(aVar.f8710g, aVar.f8711h.floatValue(), (Float) obj2, (Float) aVar.f8706c, f11, e(), this.f23450d);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        if (aVar.f8712i == -3987645.8f) {
            aVar.f8712i = ((Float) obj2).floatValue();
        }
        float f13 = aVar.f8712i;
        if (aVar.j == -3987645.8f) {
            aVar.j = ((Float) aVar.f8706c).floatValue();
        }
        return e9.g.f(f13, aVar.j, f11);
    }
}

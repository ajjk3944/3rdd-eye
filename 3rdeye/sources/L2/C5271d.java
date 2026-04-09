package l2;

import u2.C5628g;
import v2.C5673a;

/* compiled from: FloatKeyframeAnimation.java */
/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5271d extends AbstractC5274g<Float> {
    public C5271d() {
        throw null;
    }

    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        return Float.valueOf(m(c5673a, f10));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(C5673a<Float> c5673a, float f10) {
        float f11;
        if (c5673a.f47012b == null || c5673a.f47013c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        B0.f fVar = this.f43690e;
        Float f12 = c5673a.f47012b;
        if (fVar != null) {
            Float f13 = c5673a.f47013c;
            float fE = e();
            float f14 = this.f43689d;
            f11 = f10;
            Float f15 = (Float) fVar.e(c5673a.f47017g, c5673a.f47018h.floatValue(), f12, f13, f11, fE, f14);
            if (f15 != null) {
                return f15.floatValue();
            }
        } else {
            f11 = f10;
        }
        if (c5673a.i == -3987645.8f) {
            c5673a.i = f12.floatValue();
        }
        float f16 = c5673a.i;
        if (c5673a.f47019j == -3987645.8f) {
            c5673a.f47019j = c5673a.f47013c.floatValue();
        }
        return C5628g.e(f16, c5673a.f47019j, f11);
    }
}

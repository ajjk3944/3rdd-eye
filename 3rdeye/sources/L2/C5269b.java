package l2;

import r7.s;
import u2.C5628g;
import v2.C5673a;

/* compiled from: ColorKeyframeAnimation.java */
/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5269b extends AbstractC5274g<Integer> {
    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        return Integer.valueOf(l(c5673a, f10));
    }

    public final int l(C5673a<Integer> c5673a, float f10) {
        float f11;
        Float f12;
        if (c5673a.f47012b == null || c5673a.f47013c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        B0.f fVar = this.f43690e;
        Integer num = c5673a.f47012b;
        if (fVar == null || (f12 = c5673a.f47018h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num2 = (Integer) fVar.e(c5673a.f47017g, f12.floatValue(), num, c5673a.f47013c, f11, e(), this.f43689d);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return s.d(C5628g.b(f11, 0.0f, 1.0f), num.intValue(), c5673a.f47013c.intValue());
    }
}

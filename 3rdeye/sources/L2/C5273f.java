package l2;

import android.graphics.PointF;
import u2.C5628g;
import v2.C5673a;

/* compiled from: IntegerKeyframeAnimation.java */
/* renamed from: l2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5273f extends AbstractC5274g<Integer> {
    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        return Integer.valueOf(l(c5673a, f10));
    }

    public final int l(C5673a<Integer> c5673a, float f10) {
        int i;
        float f11;
        Integer num = c5673a.f47012b;
        if (num == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Integer num2 = c5673a.f47013c;
        if (num2 == null) {
            if (c5673a.f47020k == 784923401) {
                c5673a.f47020k = num.intValue();
            }
            i = c5673a.f47020k;
        } else {
            if (c5673a.f47021l == 784923401) {
                c5673a.f47021l = num2.intValue();
            }
            i = c5673a.f47021l;
        }
        B0.f fVar = this.f43690e;
        Integer num3 = c5673a.f47012b;
        if (fVar != null) {
            f11 = f10;
            Integer num4 = (Integer) fVar.e(c5673a.f47017g, c5673a.f47018h.floatValue(), num3, Integer.valueOf(i), f11, e(), this.f43689d);
            if (num4 != null) {
                return num4.intValue();
            }
        } else {
            f11 = f10;
        }
        if (c5673a.f47020k == 784923401) {
            c5673a.f47020k = num3.intValue();
        }
        int i10 = c5673a.f47020k;
        PointF pointF = C5628g.f46556a;
        return (int) (((i - i10) * f11) + i10);
    }
}

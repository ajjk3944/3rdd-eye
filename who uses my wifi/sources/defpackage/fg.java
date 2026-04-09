package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fg extends x40 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg(int i, List list) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.ba
    public final Object f(w40 w40Var, float f) {
        int i;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(w40Var, f));
            case 1:
                Object obj2 = w40Var.b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = w40Var.c;
                if (obj3 == null) {
                    if (w40Var.k == 784923401) {
                        w40Var.k = ((Integer) obj2).intValue();
                    }
                    i = w40Var.k;
                } else {
                    if (w40Var.l == 784923401) {
                        w40Var.l = ((Integer) obj3).intValue();
                    }
                    i = w40Var.l;
                }
                int i2 = i;
                vq2 vq2Var = this.e;
                if (vq2Var == null || (num = (Integer) vq2Var.j(w40Var.g, w40Var.h.floatValue(), (Integer) obj2, Integer.valueOf(i2), f, d(), this.d)) == null) {
                    if (w40Var.k == 784923401) {
                        w40Var.k = ((Integer) obj2).intValue();
                    }
                    int i3 = w40Var.k;
                    PointF pointF = te0.a;
                    iIntValue = (int) (((i2 - i3) * f) + i3);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = w40Var.b;
                vq2 vq2Var2 = this.e;
                if (vq2Var2 == null) {
                    return (f != 1.0f || (obj = w40Var.c) == null) ? (pp) obj4 : (pp) obj;
                }
                float f2 = w40Var.g;
                Float f3 = w40Var.h;
                float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                pp ppVar = (pp) obj4;
                Object obj5 = w40Var.c;
                return (pp) vq2Var2.j(f2, fFloatValue, ppVar, obj5 == null ? ppVar : (pp) obj5, f, c(), this.d);
        }
    }

    public int l(w40 w40Var, float f) {
        float f2;
        Float f3;
        Object obj = w40Var.b;
        Object obj2 = w40Var.b;
        if (obj == null || w40Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        vq2 vq2Var = this.e;
        if (vq2Var == null || (f3 = w40Var.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) vq2Var.j(w40Var.g, f3.floatValue(), (Integer) obj2, (Integer) w40Var.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return zt0.n(te0.b(f2, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) w40Var.c).intValue());
    }
}

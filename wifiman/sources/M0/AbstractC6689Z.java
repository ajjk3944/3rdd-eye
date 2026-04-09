package m0;

import Zg.AbstractC3689v;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import l0.C6531g;

/* renamed from: m0.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6689Z {
    public static final Shader a(long j10, long j11, List list, List list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new LinearGradient(C6531g.m(j10), C6531g.n(j10), C6531g.m(j11), C6531g.n(j11), d(list, iC), e(list2, list, iC), AbstractC6691a0.a(i10));
    }

    public static final Shader b(long j10, float f10, List list, List list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new RadialGradient(C6531g.m(j10), C6531g.n(j10), f10, d(list, iC), e(list2, list, iC), AbstractC6691a0.a(i10));
    }

    public static final int c(List list) {
        return 0;
    }

    public static final int[] d(List list, int i10) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = AbstractC6737x0.j(((C6733v0) list.get(i11)).u());
        }
        return iArr;
    }

    public static final float[] e(List list, List list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return AbstractC3689v.f1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iN = AbstractC3689v.n(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iN; i12++) {
            long jU = ((C6733v0) list2.get(i12)).u();
            float fFloatValue = list != null ? ((Number) list.get(i12)).floatValue() : i12 / AbstractC3689v.n(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (C6733v0.n(jU) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? ((Number) list.get(AbstractC3689v.n(list2))).floatValue() : 1.0f;
        return fArr;
    }

    private static final void f(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}

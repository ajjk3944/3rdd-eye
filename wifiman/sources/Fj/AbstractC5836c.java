package fj;

import ej.C5473A;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: fj.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5836c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        AbstractC6492s.i(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(C5473A c5473a, int i10) {
        AbstractC6492s.i(c5473a, "<this>");
        int iA = a(c5473a.E0(), i10 + 1, 0, c5473a.G0().length);
        return iA >= 0 ? iA : ~iA;
    }
}

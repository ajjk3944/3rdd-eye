package com.facebook.ads.redexgen.core;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2810Px implements Comparator<C2811Py> {
    public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C2811Py c2811Py, C2811Py c2811Py2) {
        if ((c2811Py.A03 == null) != (c2811Py2.A03 == null)) {
            C23196g c23196g = c2811Py.A03;
            if (A00[1].length() == 18) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
            strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
            return c23196g == null ? 1 : -1;
        }
        if (c2811Py.A04 != c2811Py2.A04) {
            return c2811Py.A04 ? -1 : 1;
        }
        int i = c2811Py2.A02 - c2811Py.A02;
        if (i != 0) {
            return i;
        }
        int i10 = c2811Py.A00;
        int deltaViewVelocity = c2811Py2.A00;
        int i11 = i10 - deltaViewVelocity;
        if (i11 != 0) {
            return i11;
        }
        return 0;
    }
}

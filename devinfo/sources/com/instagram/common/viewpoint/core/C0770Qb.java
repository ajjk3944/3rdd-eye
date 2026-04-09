package com.instagram.common.viewpoint.core;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0770Qb implements Comparator<C0771Qc> {
    public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0771Qc c0771Qc, C0771Qc c0771Qc2) {
        if ((c0771Qc.A03 == null) != (c0771Qc2.A03 == null)) {
            C7M c7m = c0771Qc.A03;
            if (A00[1].length() == 18) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
            strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
            return c7m == null ? 1 : -1;
        }
        if (c0771Qc.A04 != c0771Qc2.A04) {
            return c0771Qc.A04 ? -1 : 1;
        }
        int i4 = c0771Qc2.A02 - c0771Qc.A02;
        if (i4 != 0) {
            return i4;
        }
        int i10 = c0771Qc.A00;
        int deltaViewVelocity = c0771Qc2.A00;
        int i11 = i10 - deltaViewVelocity;
        if (i11 != 0) {
            return i11;
        }
        return 0;
    }
}

package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1157Ql {
    public static byte[] A01;
    public final InterfaceC1156Qk A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private int A00(List<QN> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return -1;
        }
        list.get(size);
        throw new NullPointerException(A01(0, 3, 72));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{61, 51, 58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A03(List<QN> list, int i10, int i11) {
        list.get(i10);
        list.get(i11);
        throw new NullPointerException(A01(0, 3, 72));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(List<QN> list) {
        int iA00 = A00(list);
        if (iA00 != -1) {
            A03(list, iA00, iA00 + 1);
            throw null;
        }
    }

    public C1157Ql(InterfaceC1156Qk interfaceC1156Qk) {
        this.A00 = interfaceC1156Qk;
    }
}

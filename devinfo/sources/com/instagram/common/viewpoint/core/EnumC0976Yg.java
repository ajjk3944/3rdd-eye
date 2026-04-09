package com.instagram.common.viewpoint.core;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC0976Yg {
    A08(C0750Pe.A0D, -1, -15986668, 858468406, true),
    A09(C0750Pe.A0E, LinearLayoutManager.INVALID_OFFSET, -1, 452984831, false);

    public static byte[] A05;
    public static String[] A06 = {"V62FSpXyXg0rt4sPiNo", "6lq6AHOCdAk9akPwvyC", "nqUSJeC0aIJYgUKl2CPVEyh1brd6E0Ae", "x0NdoFH36D", "29PPikSq1e", "88nHmfXS0I", "EpErG0pNHZnmsJ1", "e2q5yIycFm4TxUxK8s9XbNDHLyuGtCe3"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final boolean A04;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-33, -30, -15, -34, -35, -30, -24, -21, -35, -16};
    }

    static {
        A01();
    }

    EnumC0976Yg(Integer num, int i4, int i10, int i11, boolean z3) {
        this.A03 = num;
        this.A00 = i4;
        this.A01 = i10;
        this.A02 = i11;
        this.A04 = z3;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0976Yg[] valuesCustom() {
        EnumC0976Yg[] enumC0976YgArr = (EnumC0976Yg[]) values().clone();
        if (A06[3].length() != 10) {
            throw new RuntimeException();
        }
        A06[3] = "b4MYrm3ZFw";
        return enumC0976YgArr;
    }
}

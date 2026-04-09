package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1354Yg {
    A08(C1128Pe.A0D, -1, -15986668, 858468406, true),
    A09(C1128Pe.A0E, Integer.MIN_VALUE, -1, 452984831, false);

    public static byte[] A05;
    public static String[] A06 = {"V62FSpXyXg0rt4sPiNo", "6lq6AHOCdAk9akPwvyC", "nqUSJeC0aIJYgUKl2CPVEyh1brd6E0Ae", "x0NdoFH36D", "29PPikSq1e", "88nHmfXS0I", "EpErG0pNHZnmsJ1", "e2q5yIycFm4TxUxK8s9XbNDHLyuGtCe3"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final boolean A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-33, -30, -15, -34, -35, -30, -24, -21, -35, -16};
    }

    static {
        A01();
    }

    EnumC1354Yg(Integer num, int i10, int i11, int i12, boolean z10) {
        this.A03 = num;
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A04 = z10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1354Yg[] valuesCustom() {
        EnumC1354Yg[] enumC1354YgArr = (EnumC1354Yg[]) values().clone();
        if (A06[3].length() != 10) {
            throw new RuntimeException();
        }
        A06[3] = "b4MYrm3ZFw";
        return enumC1354YgArr;
    }
}

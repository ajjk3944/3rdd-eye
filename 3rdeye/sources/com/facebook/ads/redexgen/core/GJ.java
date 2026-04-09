package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class GJ {
    public static byte[] A06;
    public static String[] A07 = {"f", "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GJ A00(C4J c4j) throws C22172i {
        try {
            c4j.A0g(4);
            int iA0I = (c4j.A0I() & 3) + 1;
            if (iA0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0I2 = c4j.A0I() & 31;
            for (int i = 0; i < iA0I2; i++) {
                arrayList.add(A03(c4j));
            }
            int iA0I3 = c4j.A0I();
            String[] strArr = A07;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
            for (int i10 = 0; i10 < iA0I3; i10++) {
                arrayList.add(A03(c4j));
            }
            int i11 = -1;
            int i12 = -1;
            float f10 = 1.0f;
            String strA01 = null;
            if (iA0I2 > 0) {
                C2572Gp c2572GpA09 = AbstractC2573Gq.A09((byte[]) arrayList.get(0), iA0I, ((byte[]) arrayList.get(0)).length);
                i11 = c2572GpA09.A0A;
                i12 = c2572GpA09.A03;
                f10 = c2572GpA09.A00;
                strA01 = C3U.A01(c2572GpA09.A08, c2572GpA09.A01, c2572GpA09.A04);
            }
            return new GJ(arrayList, iA0I, i11, i12, f10, strA01);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw C22172i.A01(A01(0, 24, 51), e4);
        }
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, -61, -61, -64, -61, 113, -63, -78, -61, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, -64, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public GJ(List<byte[]> initializationData, int i, int i10, int i11, float f10, String str) {
        this.A05 = initializationData;
        this.A02 = i;
        this.A03 = i10;
        this.A01 = i11;
        this.A00 = f10;
        this.A04 = str;
    }

    public static byte[] A03(C4J c4j) {
        int iA0M = c4j.A0M();
        int offset = c4j.A09();
        c4j.A0g(iA0M);
        return C3U.A07(c4j.A0l(), offset, iA0M);
    }
}

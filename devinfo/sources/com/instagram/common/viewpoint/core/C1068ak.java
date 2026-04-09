package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1068ak {
    public static byte[] A08;
    public static String[] A09 = {"RCnn6pCzuGmx3q71pxhPkiVufEZFhrue", "mpaFRgKOI8I", "wGcy8NSqCuh8w4Qd8eleXwL5PKL6kLu0", "yBtS5H9nBGCF", "BJontwmfcei8Ydfnpbrw2OUV", "oZ3BMmDZvmusmOT443VgfsBrmXcMhGXT", "1c3rWqDgJYn0reBhn", "avQkykMwqnpIevrWTEzEvMtO"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{104, 99, 97, 83, 111, 99, 98, 120, 105, 98, 120, 83, 96, 99, 109, 104, 105, 104, 83, 97, 127, 112, 121, 118, 124, 116, 125, 106, 71, 108, 113, 117, 125, 71, 117, 107, 46, 41, 46, 51, 46, 38, 43, 24, 50, 53, 43, 81, 82, 92, 89, 98, 91, 84, 83, 84, 78, 85, 98, 80, 78, 89, 90, 84, 81, 106, 70, 65, 84, 71, 65, 106, 88, 70, 34, 53, 35, 32, Utf8.REPLACEMENT_BYTE, 62, 35, 53, 15, 53, 62, 52, 15, 61, 35, 92, 76, 93, 64, 67, 67, 112, 93, 74, 78, 75, 86, 112, 66, 92, 68, 82, 68, 68, 94, 88, 89, 104, 81, 94, 89, 94, 68, 95, 104, 90, 68};
        String[] strArr = A09;
        if (strArr[2].charAt(30) != strArr[0].charAt(30)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[4] = "471Kmxz1Me6vVyXXwzQpeRmH";
        strArr2[7] = "yPKApIkQtN13Op8uOOE76YlC";
    }

    static {
        A01();
    }

    public C1068ak(String str, long j, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.A07 = str;
        this.A01 = j;
        this.A03 = j8;
        this.A04 = j9;
        this.A00 = j10;
        this.A05 = j11;
        this.A02 = j12;
        this.A06 = j13;
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap(7);
        map.put(A00(36, 11, 25), this.A07);
        map.put(A00(21, 15, 70), String.valueOf(this.A01));
        map.put(A00(61, 13, FacebookMediationAdapter.ERROR_NULL_CONTEXT), String.valueOf(this.A03));
        map.put(A00(74, 15, 14), String.valueOf(this.A04));
        map.put(A00(0, 21, 82), String.valueOf(this.A00));
        map.put(A00(89, 15, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID), String.valueOf(this.A05));
        map.put(A00(47, 14, 99), String.valueOf(this.A02));
        map.put(A00(104, 17, 105), String.valueOf(this.A06));
        return map;
    }
}

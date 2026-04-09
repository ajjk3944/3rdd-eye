package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.fO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC3397fO {
    public static byte[] A01;
    public static String[] A02 = {"4MR", "ox3", "IUsSI7rcrCx1ERgKd0rYF5wqQshT9MFY", "XMpLbdKCI8ptDt9BVBTjCKDwrbbZ39Yk", "reDnu4iC6gOf", "58W6JAylc1sA", "T5hdxNMEH3a8tXz2YdYKh9bF2ZTD6zRG", "CM8HCV1eVyulF3snUIL5CjajvzNLA86A"};
    public static final /* synthetic */ EnumC3397fO[] A03;
    public static final EnumC3397fO A04;
    public static final EnumC3397fO A05;
    public String A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "zM61rMpjrvDScug74JUjCxPutIg5FxhC";
            strArr2[7] = "TMGBJitMUu1pxt90KbWrvOLR2BVfJ6J0";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 11);
            i12++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-86, -83, -80, -80, -104, -109, -121, -124, -105, -120, -116, -113, -110, -110, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
        A04 = new EnumC3397fO(A00(0, 4, 89), 0, A00(10, 4, 27));
        A05 = new EnumC3397fO(A00(4, 6, 56), 1, A00(14, 6, 40));
        A03 = A02();
    }

    public EnumC3397fO(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC3397fO[] A02() {
        EnumC3397fO[] enumC3397fOArr = new EnumC3397fO[2];
        enumC3397fOArr[0] = A04;
        EnumC3397fO enumC3397fO = A05;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "lJSENTz9psORZi9A2zDcPU2PQxg7yytN";
        enumC3397fOArr[1] = enumC3397fO;
        return enumC3397fOArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC3397fO valueOf(String str) {
        return (EnumC3397fO) Enum.valueOf(EnumC3397fO.class, str);
    }

    public static EnumC3397fO[] values() {
        return (EnumC3397fO[]) A03.clone();
    }
}

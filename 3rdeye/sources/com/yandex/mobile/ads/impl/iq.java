package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class iq {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f28834a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f28835b = {"", "A", "B", "C"};

    public static String a(int i, boolean z10, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f28835b[i], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = s82.f32899a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i, int i10) {
        byte[] bArr2 = new byte[i10 + 4];
        System.arraycopy(f28834a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i10);
        return bArr2;
    }

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}

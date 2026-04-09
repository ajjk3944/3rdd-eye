package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class NC {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9976a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i3 = 0; i3 < 26; i3++) {
            byte b5 = (byte) (i3 + 10);
            bArr[i3 + 65] = b5;
            bArr[i3 + 97] = b5;
        }
        f9976a = bArr;
    }
}

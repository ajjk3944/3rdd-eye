package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.mL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1528mL {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15610a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15611b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f15612c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15611b = bArr;
        f15612c = ByteBuffer.wrap(bArr);
        D5.b.i(0, 0, bArr);
    }

    public static int a(int i, byte[] bArr, int i3, int i6) {
        for (int i7 = i3; i7 < i3 + i6; i7++) {
            i = (i * 31) + bArr[i7];
        }
        return i;
    }
}

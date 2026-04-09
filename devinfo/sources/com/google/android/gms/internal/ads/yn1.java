package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class yn1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f18811a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18812b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f18813c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18812b = bArr;
        f18813c = ByteBuffer.wrap(bArr);
        en1.d(0, 0, bArr);
    }

    public static int a(int i4, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i4 = (i4 * 31) + bArr[i12];
        }
        return i4;
    }
}

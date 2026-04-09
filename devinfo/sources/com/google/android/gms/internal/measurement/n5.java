package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f19843a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f19844b;

    static {
        Charset.forName("US-ASCII");
        f19843a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19844b = bArr;
        ByteBuffer.wrap(bArr);
    }
}

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class o5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5148a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5149b;

    static {
        Charset.forName("US-ASCII");
        f5148a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5149b = bArr;
        ByteBuffer.wrap(bArr);
    }
}

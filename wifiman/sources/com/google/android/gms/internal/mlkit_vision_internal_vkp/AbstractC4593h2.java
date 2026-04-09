package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4593h2 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f35691a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f35692b;

    static {
        Charset.forName("US-ASCII");
        f35691a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f35692b = bArr;
        ByteBuffer.wrap(bArr);
        F1.c(bArr, 0, 0, false);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    static boolean d(InterfaceC4790z2 interfaceC4790z2) {
        return false;
    }
}

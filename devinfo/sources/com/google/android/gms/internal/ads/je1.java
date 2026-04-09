package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class je1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12739a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final vl1 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new ac.m(sb2.toString());
            }
            bArr[i4] = (byte) cCharAt;
        }
        return vl1.a(bArr);
    }

    public static final vl1 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new GeneralSecurityException(sb2.toString());
            }
            bArr[i4] = (byte) cCharAt;
        }
        return vl1.a(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (bArr2[i4] != bArr[i4]) {
                return false;
            }
        }
        return true;
    }
}

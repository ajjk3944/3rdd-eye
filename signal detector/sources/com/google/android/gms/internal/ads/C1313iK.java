package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.iK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313iK {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14720a;

    public C1313iK(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f14720a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C1313iK a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new C1313iK(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f14720a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1313iK) {
            return Arrays.equals(((C1313iK) obj).f14720a, this.f14720a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14720a);
    }

    public final String toString() {
        byte[] bArr = this.f14720a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b5 : bArr) {
            sb.append("0123456789abcdef".charAt((b5 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b5 & 15));
        }
        String string = sb.toString();
        return AbstractC1135f5.n(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}

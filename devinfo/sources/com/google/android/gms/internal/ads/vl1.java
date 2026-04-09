package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vl1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17649a;

    public vl1(byte[] bArr, int i4) {
        byte[] bArr2 = new byte[i4];
        this.f17649a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i4);
    }

    public static vl1 a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new vl1(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f17649a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vl1) {
            return Arrays.equals(((vl1) obj).f17649a, this.f17649a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17649a);
    }

    public final String toString() {
        byte[] bArr = this.f17649a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        String string = sb2.toString();
        return r5.c.m(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rb {

    /* renamed from: b, reason: collision with root package name */
    public static final rb f15609b = new rb(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15610a;

    public rb(byte[] bArr) {
        this.f15610a = bArr;
    }

    public static rb e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new rb(bArr2);
    }

    public static int f(byte b10) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        return b10 & ((iArr[7] % 837626799) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
    }

    public final byte[] a() {
        byte[] bArr = this.f15610a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final byte b(int i4) {
        int i10 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i11 = 2013725218 % 1633938701;
        int i12 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i13 = 1442767057 % 63299708;
        byte[] bArr = this.f15610a;
        int length = bArr.length;
        if (((length - (i4 + 1)) | i4) >= 0) {
            return bArr[i4];
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(r5.c.e(i4, i10 ^ i11));
            sb2.append(qb.a("Akelqh1fajntGgo="));
            sb2.append(i4);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(r5.c.e(length, r5.c.e(i4, i12 ^ i13)));
        sb3.append(qb.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb3.append(i4);
        sb3.append(qb.a("Zwk="));
        sb3.append(length);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(qb.a("Hn2H4l0="));
        byte[] bArr = this.f15610a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final rb d(rb rbVar) {
        byte[] bArr = rbVar.f15610a;
        int length = bArr.length;
        byte[] bArr2 = this.f15610a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rb) {
            return Arrays.equals(this.f15610a, ((rb) obj).f15610a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15610a);
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        String string = Arrays.toString(this.f15610a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + ((i16 % 981766422) ^ iM));
        sb2.append(qb.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(string);
        sb2.append(qb.a("Ng=="));
        return sb2.toString();
    }
}

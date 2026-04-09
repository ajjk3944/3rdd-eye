package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458l5 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1458l5 f15349b = new C1458l5(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15350a;

    public C1458l5(byte[] bArr) {
        this.f15350a = bArr;
    }

    public static C1458l5 e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new C1458l5(bArr2);
    }

    public static int f(byte b5) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        return b5 & ((iArr[7] % 837626799) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
    }

    public final byte[] a() {
        byte[] bArr = this.f15350a;
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

    public final byte b(int i) {
        int i3 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i6 = 2013725218 % 1633938701;
        int i7 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i8 = 1442767057 % 63299708;
        byte[] bArr = this.f15350a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(AbstractC2763b.a(i, i3 ^ i6));
            sb.append(AbstractC1404k5.a("Akelqh1fajntGgo="));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(AbstractC2763b.a(length, AbstractC2763b.a(i, i7 ^ i8)));
        sb2.append(AbstractC1404k5.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i);
        sb2.append(AbstractC1404k5.a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(AbstractC1404k5.a("Hn2H4l0="));
        byte[] bArr = this.f15350a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final C1458l5 d(C1458l5 c1458l5) {
        byte[] bArr = c1458l5.f15350a;
        int length = bArr.length;
        byte[] bArr2 = this.f15350a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1458l5) {
            return Arrays.equals(this.f15350a, ((C1458l5) obj).f15350a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15350a);
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        String string = Arrays.toString(this.f15350a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i11 % 981766422) ^ iD));
        sb.append(AbstractC1404k5.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(AbstractC1404k5.a("Ng=="));
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2047w1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17393b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17394c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17395d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17396e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17397f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17398g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f17399h;

    public C2047w1(int i, String str, String str2, int i3, int i6, int i7, int i8, byte[] bArr) {
        this.f17392a = i;
        this.f17393b = str;
        this.f17394c = str2;
        this.f17395d = i3;
        this.f17396e = i6;
        this.f17397f = i7;
        this.f17398g = i8;
        this.f17399h = bArr;
    }

    public static C2047w1 b(C2036vr c2036vr) {
        int iB = c2036vr.b();
        String strH = D4.h(c2036vr.k(c2036vr.b(), StandardCharsets.US_ASCII));
        String strK = c2036vr.k(c2036vr.b(), StandardCharsets.UTF_8);
        int iB2 = c2036vr.b();
        int iB3 = c2036vr.b();
        int iB4 = c2036vr.b();
        int iB5 = c2036vr.b();
        int iB6 = c2036vr.b();
        byte[] bArr = new byte[iB6];
        c2036vr.H(0, iB6, bArr);
        return new C2047w1(iB, strH, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final void a(O2 o22) {
        o22.a(this.f17392a, this.f17399h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2047w1.class == obj.getClass()) {
            C2047w1 c2047w1 = (C2047w1) obj;
            if (this.f17392a == c2047w1.f17392a && this.f17393b.equals(c2047w1.f17393b) && this.f17394c.equals(c2047w1.f17394c) && this.f17395d == c2047w1.f17395d && this.f17396e == c2047w1.f17396e && this.f17397f == c2047w1.f17397f && this.f17398g == c2047w1.f17398g && Arrays.equals(this.f17399h, c2047w1.f17399h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17399h) + ((((((((((this.f17394c.hashCode() + ((this.f17393b.hashCode() + ((this.f17392a + 527) * 31)) * 31)) * 31) + this.f17395d) * 31) + this.f17396e) * 31) + this.f17397f) * 31) + this.f17398g) * 31);
    }

    public final String toString() {
        String str = this.f17393b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f17394c;
        return AbstractC1135f5.o(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}

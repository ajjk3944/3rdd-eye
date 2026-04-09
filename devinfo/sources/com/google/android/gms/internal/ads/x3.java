package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x3 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18285b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18287d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18288e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18289f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f18290h;

    public x3(int i4, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f18284a = i4;
        this.f18285b = str;
        this.f18286c = str2;
        this.f18287d = i10;
        this.f18288e = i11;
        this.f18289f = i12;
        this.g = i13;
        this.f18290h = bArr;
    }

    public static x3 b(sk0 sk0Var) {
        int iB = sk0Var.b();
        String strH = ia.h(sk0Var.k(sk0Var.b(), StandardCharsets.US_ASCII));
        String strK = sk0Var.k(sk0Var.b(), StandardCharsets.UTF_8);
        int iB2 = sk0Var.b();
        int iB3 = sk0Var.b();
        int iB4 = sk0Var.b();
        int iB5 = sk0Var.b();
        int iB6 = sk0Var.b();
        byte[] bArr = new byte[iB6];
        sk0Var.H(0, iB6, bArr);
        return new x3(iB, strH, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void a(o6 o6Var) {
        o6Var.a(this.f18284a, this.f18290h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x3.class == obj.getClass()) {
            x3 x3Var = (x3) obj;
            if (this.f18284a == x3Var.f18284a && this.f18285b.equals(x3Var.f18285b) && this.f18286c.equals(x3Var.f18286c) && this.f18287d == x3Var.f18287d && this.f18288e == x3Var.f18288e && this.f18289f == x3Var.f18289f && this.g == x3Var.g && Arrays.equals(this.f18290h, x3Var.f18290h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18290h) + ((((((((((this.f18286c.hashCode() + ((this.f18285b.hashCode() + ((this.f18284a + 527) * 31)) * 31)) * 31) + this.f18287d) * 31) + this.f18288e) * 31) + this.f18289f) * 31) + this.g) * 31);
    }

    public final String toString() {
        String str = this.f18285b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f18286c;
        return a0.g.p(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}

package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nh1 implements en1 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public nh1(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static nh1 b(kz2 kz2Var) {
        int iB = kz2Var.b();
        String strI = pp1.i(kz2Var.k(kz2Var.b(), StandardCharsets.US_ASCII));
        String strK = kz2Var.k(kz2Var.b(), StandardCharsets.UTF_8);
        int iB2 = kz2Var.b();
        int iB3 = kz2Var.b();
        int iB4 = kz2Var.b();
        int iB5 = kz2Var.b();
        int iB6 = kz2Var.b();
        byte[] bArr = new byte[iB6];
        kz2Var.H(bArr, 0, iB6);
        return new nh1(iB, strI, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // defpackage.en1
    public final void a(vl1 vl1Var) {
        vl1Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nh1.class == obj.getClass()) {
            nh1 nh1Var = (nh1) obj;
            if (this.a == nh1Var.a && this.b.equals(nh1Var.b) && this.c.equals(nh1Var.c) && this.d == nh1Var.d && this.e == nh1Var.e && this.f == nh1Var.f && this.g == nh1Var.g && Arrays.equals(this.h, nh1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((((this.c.hashCode() + ((this.b.hashCode() + ((this.a + 527) * 31)) * 31)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        String str = this.b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.c;
        return ex0.m(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}

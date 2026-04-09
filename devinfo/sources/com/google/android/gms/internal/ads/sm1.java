package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sm1 {

    /* renamed from: h, reason: collision with root package name */
    public static final sm1 f16479h;

    /* renamed from: a, reason: collision with root package name */
    public final int f16480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16481b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16482c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16483d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16484e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16485f;
    public int g;

    static {
        int i4 = -1;
        f16479h = new sm1(1, 2, 3, null, i4, i4);
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ sm1(int i4, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f16480a = i4;
        this.f16481b = i10;
        this.f16482c = i11;
        this.f16483d = bArr;
        this.f16484e = i12;
        this.f16485f = i13;
    }

    public static boolean a(sm1 sm1Var) {
        if (sm1Var == null) {
            return true;
        }
        int i4 = sm1Var.f16480a;
        if (i4 != -1 && i4 != 1 && i4 != 2) {
            return false;
        }
        int i10 = sm1Var.f16481b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = sm1Var.f16482c;
        if ((i11 != -1 && i11 != 3) || sm1Var.f16483d != null) {
            return false;
        }
        int i12 = sm1Var.f16485f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = sm1Var.f16484e;
        return i13 == -1 || i13 == 8;
    }

    public static int b(int i4) {
        if (i4 == 1) {
            return 1;
        }
        if (i4 != 9) {
            return (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i4) {
        if (i4 == 1) {
            return 3;
        }
        if (i4 == 4) {
            return 10;
        }
        if (i4 == 13) {
            return 2;
        }
        if (i4 == 16) {
            return 6;
        }
        if (i4 != 18) {
            return (i4 == 6 || i4 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i4) {
        return i4 != -1 ? i4 != 6 ? i4 != 1 ? i4 != 2 ? d.h.q(i4, "Undefined color space ", new StringBuilder(String.valueOf(i4).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i4) {
        return i4 != -1 ? i4 != 10 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? d.h.q(i4, "Undefined color transfer ", new StringBuilder(String.valueOf(i4).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i4) {
        return i4 != -1 ? i4 != 1 ? i4 != 2 ? d.h.q(i4, "Undefined color range ", new StringBuilder(String.valueOf(i4).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.f16480a == -1 || this.f16481b == -1 || this.f16482c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sm1.class == obj.getClass()) {
            sm1 sm1Var = (sm1) obj;
            if (this.f16480a == sm1Var.f16480a && this.f16481b == sm1Var.f16481b && this.f16482c == sm1Var.f16482c && Arrays.equals(this.f16483d, sm1Var.f16483d) && this.f16484e == sm1Var.f16484e && this.f16485f == sm1Var.f16485f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.g;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = ((((Arrays.hashCode(this.f16483d) + ((((((this.f16480a + 527) * 31) + this.f16481b) * 31) + this.f16482c) * 31)) * 31) + this.f16484e) * 31) + this.f16485f;
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.f16480a);
        String strG = g(this.f16481b);
        String strF = f(this.f16482c);
        int i4 = this.f16484e;
        String strJ = i4 != -1 ? r5.c.j(i4, "bit Luma", new StringBuilder(String.valueOf(i4).length() + 8)) : "NA";
        int i10 = this.f16485f;
        String strJ2 = i10 != -1 ? r5.c.j(i10, "bit Chroma", new StringBuilder(String.valueOf(i10).length() + 10)) : "NA";
        boolean z3 = this.f16483d != null;
        StringBuilder sb2 = new StringBuilder(r5.c.f(r5.c.f(r5.c.f(r5.c.f(strE.length() + 12, 2, strG) + strF.length() + 2, 2, String.valueOf(z3)), 2, strJ), 1, strJ2));
        sb2.append("ColorInfo(");
        sb2.append(strE);
        sb2.append(", ");
        sb2.append(strG);
        sb2.append(", ");
        sb2.append(strF);
        sb2.append(", ");
        sb2.append(z3);
        je.u.B(sb2, ", ", strJ, ", ", strJ2);
        sb2.append(")");
        return sb2.toString();
    }
}

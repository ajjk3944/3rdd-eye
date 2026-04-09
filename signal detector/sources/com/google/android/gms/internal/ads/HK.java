package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class HK {

    /* renamed from: h, reason: collision with root package name */
    public static final HK f8893h;

    /* renamed from: a, reason: collision with root package name */
    public final int f8894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8896c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8898e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8899f;

    /* renamed from: g, reason: collision with root package name */
    public int f8900g;

    static {
        int i = -1;
        f8893h = new HK(1, 2, 3, null, i, i);
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ HK(int i, int i3, int i6, byte[] bArr, int i7, int i8) {
        this.f8894a = i;
        this.f8895b = i3;
        this.f8896c = i6;
        this.f8897d = bArr;
        this.f8898e = i7;
        this.f8899f = i8;
    }

    public static boolean a(HK hk) {
        if (hk == null) {
            return true;
        }
        int i = hk.f8894a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i3 = hk.f8895b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i6 = hk.f8896c;
        if ((i6 != -1 && i6 != 3) || hk.f8897d != null) {
            return false;
        }
        int i7 = hk.f8899f;
        if (i7 != -1 && i7 != 8) {
            return false;
        }
        int i8 = hk.f8898e;
        return i8 == -1 || i8 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? A.f.i(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? A.f.i(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? A.f.i(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.f8894a == -1 || this.f8895b == -1 || this.f8896c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HK.class == obj.getClass()) {
            HK hk = (HK) obj;
            if (this.f8894a == hk.f8894a && this.f8895b == hk.f8895b && this.f8896c == hk.f8896c && Arrays.equals(this.f8897d, hk.f8897d) && this.f8898e == hk.f8898e && this.f8899f == hk.f8899f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f8900g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.f8897d) + ((((((this.f8894a + 527) * 31) + this.f8895b) * 31) + this.f8896c) * 31)) * 31) + this.f8898e) * 31) + this.f8899f;
        this.f8900g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.f8894a);
        String strG = g(this.f8895b);
        String strF = f(this.f8896c);
        int i = this.f8898e;
        String strD = i != -1 ? AbstractC2763b.d(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i3 = this.f8899f;
        String strD2 = i3 != -1 ? AbstractC2763b.d(i3, "bit Chroma", new StringBuilder(String.valueOf(i3).length() + 10)) : "NA";
        boolean z6 = this.f8897d != null;
        StringBuilder sb = new StringBuilder(AbstractC2763b.b(AbstractC2763b.b(AbstractC2763b.b(AbstractC2763b.b(strE.length() + 12, 2, strG) + strF.length() + 2, 2, String.valueOf(z6)), 2, strD), 1, strD2));
        sb.append("ColorInfo(");
        sb.append(strE);
        sb.append(", ");
        sb.append(strG);
        sb.append(", ");
        sb.append(strF);
        sb.append(", ");
        sb.append(z6);
        A.f.w(sb, ", ", strD, ", ", strD2);
        sb.append(")");
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2108x8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17548c;

    /* renamed from: d, reason: collision with root package name */
    public final TP[] f17549d;

    /* renamed from: e, reason: collision with root package name */
    public int f17550e;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2108x8(String str, TP... tpArr) {
        int length = tpArr.length;
        int i = 1;
        AbstractC0582Jp.m(length > 0);
        this.f17547b = str;
        this.f17549d = tpArr;
        this.f17546a = length;
        int iF = D4.f(tpArr[0].f11397m);
        this.f17548c = iF == -1 ? D4.f(tpArr[0].f11396l) : iF;
        TP tp = tpArr[0];
        String str2 = tp.f11389d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i3 = tp.f11391f | 16384;
        while (true) {
            TP[] tpArr2 = this.f17549d;
            if (i >= tpArr2.length) {
                return;
            }
            TP tp2 = tpArr2[i];
            String str3 = tp2.f11389d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a("languages", i, tpArr2[0].f11389d, str3);
                return;
            } else {
                if (i3 != (tp2.f11391f | 16384)) {
                    a("role flags", i, Integer.toBinaryString(tpArr2[0].f11391f), Integer.toBinaryString(this.f17549d[i].f11391f));
                    return;
                }
                i++;
            }
        }
    }

    public static void a(String str, int i, String str2, String str3) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        A.f.w(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        AbstractC2022vd.K("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2108x8.class == obj.getClass()) {
            C2108x8 c2108x8 = (C2108x8) obj;
            if (this.f17547b.equals(c2108x8.f17547b) && Arrays.equals(this.f17549d, c2108x8.f17549d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17550e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f17549d) + ((this.f17547b.hashCode() + 527) * 31);
        this.f17550e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f17549d);
        String str = this.f17547b;
        return AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}

package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ii {

    /* renamed from: a, reason: collision with root package name */
    public final int f12337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12339c;

    /* renamed from: d, reason: collision with root package name */
    public final mx1[] f12340d;

    /* renamed from: e, reason: collision with root package name */
    public int f12341e;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ii(String str, mx1... mx1VarArr) {
        int length = mx1VarArr.length;
        int i4 = 1;
        mq0.m(length > 0);
        this.f12338b = str;
        this.f12340d = mx1VarArr;
        this.f12337a = length;
        int iF = ia.f(mx1VarArr[0].f14052m);
        this.f12339c = iF == -1 ? ia.f(mx1VarArr[0].f14051l) : iF;
        mx1 mx1Var = mx1VarArr[0];
        String str2 = mx1Var.f14045d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = mx1Var.f14047f | Http2.INITIAL_MAX_FRAME_SIZE;
        while (true) {
            mx1[] mx1VarArr2 = this.f12340d;
            if (i4 >= mx1VarArr2.length) {
                return;
            }
            mx1 mx1Var2 = mx1VarArr2[i4];
            String str3 = mx1Var2.f14045d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a("languages", i4, mx1VarArr2[0].f14045d, str3);
                return;
            } else {
                if (i10 != (mx1Var2.f14047f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    a("role flags", i4, Integer.toBinaryString(mx1VarArr2[0].f14047f), Integer.toBinaryString(this.f12340d[i4].f14047f));
                    return;
                }
                i4++;
            }
        }
    }

    public static void a(String str, int i4, String str2, String str3) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i4).length() + 1);
        je.u.B(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i4);
        sb2.append(")");
        ls.H("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ii.class == obj.getClass()) {
            ii iiVar = (ii) obj;
            if (this.f12338b.equals(iiVar.f12338b) && Arrays.equals(this.f12340d, iiVar.f12340d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f12341e;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = Arrays.hashCode(this.f12340d) + ((this.f12338b.hashCode() + 527) * 31);
        this.f12341e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f12340d);
        String str = this.f12338b;
        return r5.c.m(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}

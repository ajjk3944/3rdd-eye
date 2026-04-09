package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b84 extends Exception {
    public final int f;
    public final long g;
    public final int h;
    public final String i;
    public final int j;
    public final ph4 k;
    public final int l;
    public final kh4 m;
    public final boolean n;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public b84(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    public final b84 a(kh4 kh4Var) {
        String message = getMessage();
        String str = v23.a;
        return new b84(message, getCause(), this.f, this.h, this.i, this.j, this.k, this.l, kh4Var, this.g, this.n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b84(int i, Exception exc, int i2, String str, int i3, ph4 ph4Var, int i4, kh4 kh4Var, boolean z) {
        String str2;
        int i5;
        String strL;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            strL = "Source error";
        } else if (i != 1) {
            strL = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(ph4Var);
            String str4 = v23.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder(str3.length() + strValueOf.length() + ga1.i(String.valueOf(i3), String.valueOf(str).length() + 14, 9) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            strL = ex0.l(sb, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strL : strL.concat(": null"), exc, i2, i, str2, i5, ph4Var, i4, kh4Var, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b84(String str, Throwable th, int i, int i2, String str2, int i3, ph4 ph4Var, int i4, kh4 kh4Var, long j, boolean z) {
        boolean z2;
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.f = i;
        this.g = j;
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zt0.D(z2);
        zt0.D(th != null);
        this.h = i2;
        this.i = str2;
        this.j = i3;
        this.k = ph4Var;
        this.l = i4;
        this.m = kh4Var;
        this.n = z;
    }
}

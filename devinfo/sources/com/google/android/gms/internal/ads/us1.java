package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class us1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f17309a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17311c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17313e;

    /* renamed from: f, reason: collision with root package name */
    public final mx1 f17314f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final jy1 f17315h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17316i;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public us1(int i4, Exception exc, int i10) {
        this(i4, exc, i10, null, -1, null, 4, null, false);
    }

    public final us1 a(jy1 jy1Var) {
        String message = getMessage();
        String str = bq0.f9768a;
        return new us1(message, getCause(), this.f17309a, this.f17311c, this.f17312d, this.f17313e, this.f17314f, this.g, jy1Var, this.f17310b, this.f17316i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public us1(int i4, Exception exc, int i10, String str, int i11, mx1 mx1Var, int i12, jy1 jy1Var, boolean z3) {
        String str2;
        int i13;
        String strM;
        String str3;
        if (i4 == 0) {
            str2 = str;
            i13 = i11;
            strM = "Source error";
        } else if (i4 != 1) {
            strM = "Unexpected runtime error";
            str2 = str;
            i13 = i11;
        } else {
            String strValueOf = String.valueOf(mx1Var);
            String str4 = bq0.f9768a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str3.length() + strValueOf.length() + r5.c.f(String.valueOf(str).length() + 14, 9, String.valueOf(i11)) + 19);
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            strM = r5.c.m(sb2, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strM : strM.concat(": null"), exc, i10, i4, str2, i13, mx1Var, i12, jy1Var, SystemClock.elapsedRealtime(), z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us1(String str, Throwable th2, int i4, int i10, String str2, int i11, mx1 mx1Var, int i12, jy1 jy1Var, long j, boolean z3) {
        boolean z10;
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f17309a = i4;
        this.f17310b = j;
        if (!z3) {
            z10 = true;
        } else if (i10 == 1) {
            i10 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        mq0.m(z10);
        mq0.m(th2 != null);
        this.f17311c = i10;
        this.f17312d = str2;
        this.f17313e = i11;
        this.f17314f = mx1Var;
        this.g = i12;
        this.f17315h = jy1Var;
        this.f17316i = z3;
    }
}

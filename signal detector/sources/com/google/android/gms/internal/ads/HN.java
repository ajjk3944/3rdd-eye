package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class HN extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f8903a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8905c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8907e;

    /* renamed from: f, reason: collision with root package name */
    public final TP f8908f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8909g;

    /* renamed from: h, reason: collision with root package name */
    public final C1749qQ f8910h;
    public final boolean i;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public HN(int i, Exception exc, int i3) {
        this(i, exc, i3, null, -1, null, 4, null, false);
    }

    public final HN a(C1749qQ c1749qQ) {
        String message = getMessage();
        String str = Vt.f12096a;
        return new HN(message, getCause(), this.f8903a, this.f8905c, this.f8906d, this.f8907e, this.f8908f, this.f8909g, c1749qQ, this.f8904b, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HN(int i, Exception exc, int i3, String str, int i6, TP tp, int i7, C1749qQ c1749qQ, boolean z6) {
        String str2;
        int i8;
        String strN;
        String str3;
        if (i == 0) {
            str2 = str;
            i8 = i6;
            strN = "Source error";
        } else if (i != 1) {
            strN = "Unexpected runtime error";
            str2 = str;
            i8 = i6;
        } else {
            String strValueOf = String.valueOf(tp);
            String str4 = Vt.f12096a;
            if (i7 == 0) {
                str3 = "NO";
            } else if (i7 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i7 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i7 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder(str3.length() + strValueOf.length() + AbstractC2763b.b(String.valueOf(str).length() + 14, 9, String.valueOf(i6)) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i8 = i6;
            sb.append(i8);
            sb.append(", format=");
            strN = AbstractC1135f5.n(sb, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strN : strN.concat(": null"), exc, i3, i, str2, i8, tp, i7, c1749qQ, SystemClock.elapsedRealtime(), z6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HN(String str, Throwable th, int i, int i3, String str2, int i6, TP tp, int i7, C1749qQ c1749qQ, long j6, boolean z6) {
        boolean z7;
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.f8903a = i;
        this.f8904b = j6;
        if (!z6) {
            z7 = true;
        } else if (i3 == 1) {
            i3 = 1;
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0582Jp.m(z7);
        AbstractC0582Jp.m(th != null);
        this.f8905c = i3;
        this.f8906d = str2;
        this.f8907e = i6;
        this.f8908f = tp;
        this.f8909g = i7;
        this.f8910h = c1749qQ;
        this.i = z6;
    }
}

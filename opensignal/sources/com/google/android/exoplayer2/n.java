package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class n extends z0 {
    public final int B;
    public final ya.u D;
    public final boolean E;

    /* renamed from: g, reason: collision with root package name */
    public final int f4331g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4332r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4333x;

    /* renamed from: y, reason: collision with root package name */
    public final Format f4334y;

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    public final n a(ya.u uVar) {
        String message = getMessage();
        int i10 = qb.v.f20828a;
        return new n(message, getCause(), this.f4795a, this.f4331g, this.f4332r, this.f4333x, this.f4334y, this.B, uVar, this.f4796d, this.E);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, Format format, int i13, ya.u uVar, long j, boolean z10) {
        super(str, th2, i10, j);
        qb.b.g(!z10 || i11 == 1);
        qb.b.g(th2 != null || i11 == 3);
        this.f4331g = i11;
        this.f4332r = str2;
        this.f4333x = i12;
        this.f4334y = format;
        this.B = i13;
        this.D = uVar;
        this.E = z10;
    }

    public n(int i10, Throwable th2, int i11, String str, int i12, Format format, int i13, boolean z10) {
        int i14;
        String string;
        if (i10 == 0) {
            i14 = i12;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(format);
            String strB = h.b(i13);
            StringBuilder sb2 = new StringBuilder(strB.length() + strValueOf.length() + c7.a.d(53, str));
            sb2.append(str);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            string = h0.b.s(sb2, strValueOf, ", format_supported=", strB);
        }
        if (!TextUtils.isEmpty(null)) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder("null".length() + strValueOf2.length() + 2);
            sb3.append(strValueOf2);
            sb3.append(": null");
            string = sb3.toString();
        }
        this(string, th2, i11, i10, str, i14, format, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}

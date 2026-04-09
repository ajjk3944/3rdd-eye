package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class jj0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29162a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29163b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29164c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29165d;

    /* renamed from: e, reason: collision with root package name */
    private final f02 f29166e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29167f;

    /* renamed from: g, reason: collision with root package name */
    private final String f29168g;

    public /* synthetic */ jj0(int i, int i10, String str, String str2, int i11) {
        this(i, i10, str, (i11 & 8) != 0 ? null : str2, null, true, null);
    }

    public final int a() {
        return this.f29163b;
    }

    public final boolean b() {
        return this.f29167f;
    }

    public final String c() {
        return this.f29168g;
    }

    public final String d() {
        return this.f29165d;
    }

    public final f02 e() {
        return this.f29166e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return this.f29162a == jj0Var.f29162a && this.f29163b == jj0Var.f29163b && kotlin.jvm.internal.l.b(this.f29164c, jj0Var.f29164c) && kotlin.jvm.internal.l.b(this.f29165d, jj0Var.f29165d) && kotlin.jvm.internal.l.b(this.f29166e, jj0Var.f29166e) && this.f29167f == jj0Var.f29167f && kotlin.jvm.internal.l.b(this.f29168g, jj0Var.f29168g);
    }

    public final String f() {
        return this.f29164c;
    }

    public final int g() {
        return this.f29162a;
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f29164c, sx1.a(this.f29163b, this.f29162a * 31, 31), 31);
        String str = this.f29165d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        f02 f02Var = this.f29166e;
        int iA2 = m6.a(this.f29167f, (iHashCode + (f02Var == null ? 0 : f02Var.hashCode())) * 31, 31);
        String str2 = this.f29168g;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f29162a;
        int i10 = this.f29163b;
        String str = this.f29164c;
        String str2 = this.f29165d;
        f02 f02Var = this.f29166e;
        boolean z10 = this.f29167f;
        String str3 = this.f29168g;
        StringBuilder sbI = androidx.work.s.i("ImageValue(width=", i, ", height=", i10, ", url=");
        com.google.android.gms.measurement.internal.a.l(sbI, str, ", sizeType=", str2, ", smartCenterSettings=");
        sbI.append(f02Var);
        sbI.append(", preload=");
        sbI.append(z10);
        sbI.append(", preview=");
        return B4.f.c(sbI, str3, ")");
    }

    public jj0(int i, int i10, String url, String str, f02 f02Var, boolean z10, String str2) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f29162a = i;
        this.f29163b = i10;
        this.f29164c = url;
        this.f29165d = str;
        this.f29166e = f02Var;
        this.f29167f = z10;
        this.f29168g = str2;
    }
}

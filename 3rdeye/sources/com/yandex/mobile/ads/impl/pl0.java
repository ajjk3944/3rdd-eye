package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f31810a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31811b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31812c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31813d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31814e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31815f;

    public pl0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f31810a = str;
        this.f31811b = str2;
        this.f31812c = str3;
        this.f31813d = str4;
        this.f31814e = str5;
        this.f31815f = str6;
    }

    public final String a() {
        return this.f31810a;
    }

    public final String b() {
        return this.f31815f;
    }

    public final String c() {
        return this.f31814e;
    }

    public final String d() {
        return this.f31812c;
    }

    public final String e() {
        return this.f31811b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl0)) {
            return false;
        }
        pl0 pl0Var = (pl0) obj;
        return kotlin.jvm.internal.l.b(this.f31810a, pl0Var.f31810a) && kotlin.jvm.internal.l.b(this.f31811b, pl0Var.f31811b) && kotlin.jvm.internal.l.b(this.f31812c, pl0Var.f31812c) && kotlin.jvm.internal.l.b(this.f31813d, pl0Var.f31813d) && kotlin.jvm.internal.l.b(this.f31814e, pl0Var.f31814e) && kotlin.jvm.internal.l.b(this.f31815f, pl0Var.f31815f);
    }

    public final String f() {
        return this.f31813d;
    }

    public final int hashCode() {
        String str = this.f31810a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31811b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31812c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31813d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31814e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f31815f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f31810a;
        String str2 = this.f31811b;
        String str3 = this.f31812c;
        String str4 = this.f31813d;
        String str5 = this.f31814e;
        String str6 = this.f31815f;
        StringBuilder sbD = j6.l.d("InstreamAdInfo(adId=", str, ", creativeId=", str2, ", bannerId=");
        com.google.android.gms.measurement.internal.a.l(sbD, str3, ", data=", str4, ", advertiserInfo=");
        return C1154e9.j(sbD, str5, ", adParameters=", str6, ")");
    }
}

package com.applovin.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: com.applovin.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2157z {

    /* renamed from: a, reason: collision with root package name */
    private final String f21860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21861b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21862c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21863d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21864e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21865f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21866g;

    public C2157z(String str, int i) {
        this.f21864e = str;
        this.f21865f = i;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        boolean z10 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f21866g = z10;
        if (z10) {
            this.f21860a = a(strArrSplit[0]);
            this.f21861b = a(strArrSplit[1]);
            this.f21862c = a(strArrSplit[2]);
            this.f21863d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f21860a = "";
        this.f21861b = "";
        this.f21862c = "";
        this.f21863d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof C2157z;
    }

    public String b() {
        return this.f21860a;
    }

    public String c() {
        return this.f21861b;
    }

    public String d() {
        return this.f21864e;
    }

    public String e() {
        return this.f21862c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2157z)) {
            return false;
        }
        C2157z c2157z = (C2157z) obj;
        if (!c2157z.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = c2157z.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = c2157z.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = c2157z.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = c2157z.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f21865f;
    }

    public boolean g() {
        return this.f21860a.equals("applovin.com");
    }

    public boolean h() {
        return this.f21866g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public String a() {
        return this.f21863d;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public C2157z(String str) {
        this(str, -1);
    }
}

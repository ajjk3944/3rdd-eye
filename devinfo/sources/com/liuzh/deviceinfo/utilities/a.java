package com.liuzh.deviceinfo.utilities;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21238b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21239c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21240d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f21241e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21242f;

    public a(String str, String str2, long j, String str3, Long l10, String str4) {
        this.f21237a = str;
        this.f21238b = str2;
        this.f21239c = j;
        this.f21240d = str3;
        this.f21241e = l10;
        this.f21242f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return nk.k.a(this.f21237a, aVar.f21237a) && nk.k.a(this.f21238b, aVar.f21238b) && this.f21239c == aVar.f21239c && nk.k.a(this.f21240d, aVar.f21240d) && nk.k.a(this.f21241e, aVar.f21241e) && nk.k.a(this.f21242f, aVar.f21242f);
    }

    public final int hashCode() {
        int iM = je.u.m(this.f21237a.hashCode() * 31, 31, this.f21238b);
        long j = this.f21239c;
        int iM2 = je.u.m((iM + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f21240d);
        Long l10 = this.f21241e;
        int iHashCode = (iM2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f21242f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = r5.c.o("ApkInfo(name=", this.f21237a, ", pkgName=", this.f21238b, ", versionCode=");
        sbO.append(this.f21239c);
        sbO.append(", versionName=");
        sbO.append(this.f21240d);
        sbO.append(", installedVersionCode=");
        sbO.append(this.f21241e);
        sbO.append(", installedVersionName=");
        sbO.append(this.f21242f);
        sbO.append(")");
        return sbO.toString();
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private final String f25620a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25621b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25622c;

    public cf(String str, String str2, String str3) {
        this.f25620a = str;
        this.f25621b = str2;
        this.f25622c = str3;
    }

    public final String a() {
        return this.f25621b;
    }

    public final String b() {
        return this.f25622c;
    }

    public final String c() {
        return this.f25620a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return kotlin.jvm.internal.l.b(this.f25620a, cfVar.f25620a) && kotlin.jvm.internal.l.b(this.f25621b, cfVar.f25621b) && kotlin.jvm.internal.l.b(this.f25622c, cfVar.f25622c);
    }

    public final int hashCode() {
        String str = this.f25620a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25621b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25622c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f25620a;
        String str2 = this.f25621b;
        return B4.f.c(j6.l.d("AppMetricaStartupParams(uuid=", str, ", deviceId=", str2, ", getAdUrl="), this.f25622c, ")");
    }
}

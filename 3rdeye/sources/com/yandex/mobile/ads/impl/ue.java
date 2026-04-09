package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ue {

    /* renamed from: a, reason: collision with root package name */
    private final String f34041a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34042b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34043c;

    public ue(String str, String str2, String str3) {
        this.f34041a = str;
        this.f34042b = str2;
        this.f34043c = str3;
    }

    public final String a() {
        return this.f34041a;
    }

    public final String b() {
        return this.f34042b;
    }

    public final String c() {
        return this.f34043c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return kotlin.jvm.internal.l.b(this.f34041a, ueVar.f34041a) && kotlin.jvm.internal.l.b(this.f34042b, ueVar.f34042b) && kotlin.jvm.internal.l.b(this.f34043c, ueVar.f34043c);
    }

    public final int hashCode() {
        String str = this.f34041a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34042b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34043c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f34041a;
        String str2 = this.f34042b;
        return B4.f.c(j6.l.d("AppMetricaIdentifiers(adGetUrl=", str, ", deviceId=", str2, ", uuid="), this.f34043c, ")");
    }
}

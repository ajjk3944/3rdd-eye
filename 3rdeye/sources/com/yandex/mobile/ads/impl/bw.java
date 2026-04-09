package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    private final String f25407a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25408b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25409c;

    public bw(String str, String str2, String str3) {
        this.f25407a = str;
        this.f25408b = str2;
        this.f25409c = str3;
    }

    public final String a() {
        return this.f25409c;
    }

    public final String b() {
        return this.f25408b;
    }

    public final String c() {
        return this.f25407a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return kotlin.jvm.internal.l.b(this.f25407a, bwVar.f25407a) && kotlin.jvm.internal.l.b(this.f25408b, bwVar.f25408b) && kotlin.jvm.internal.l.b(this.f25409c, bwVar.f25409c);
    }

    public final int hashCode() {
        String str = this.f25407a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25408b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25409c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f25407a;
        String str2 = this.f25408b;
        return B4.f.c(j6.l.d("DebugPanelAdNetworkSettingsData(pageId=", str, ", appReviewStatus=", str2, ", appAdsTxt="), this.f25409c, ")");
    }
}

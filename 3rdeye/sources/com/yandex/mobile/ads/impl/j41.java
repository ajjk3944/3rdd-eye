package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class j41 {

    /* renamed from: a, reason: collision with root package name */
    private final p61 f28952a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f28953b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f28954c;

    public j41(a8 adResponse, C4072a3 adConfiguration, p61 nativeAdResponse) {
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f28952a = nativeAdResponse;
        this.f28953b = adResponse;
        this.f28954c = adConfiguration;
    }

    public static j41 a(j41 j41Var, p61 nativeAdResponse) {
        a8<?> adResponse = j41Var.f28953b;
        C4072a3 adConfiguration = j41Var.f28954c;
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        return new j41(adResponse, adConfiguration, nativeAdResponse);
    }

    public final a8<?> b() {
        return this.f28953b;
    }

    public final p61 c() {
        return this.f28952a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j41)) {
            return false;
        }
        j41 j41Var = (j41) obj;
        return kotlin.jvm.internal.l.b(this.f28952a, j41Var.f28952a) && kotlin.jvm.internal.l.b(this.f28953b, j41Var.f28953b) && kotlin.jvm.internal.l.b(this.f28954c, j41Var.f28954c);
    }

    public final int hashCode() {
        return this.f28954c.hashCode() + ((this.f28953b.hashCode() + (this.f28952a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.f28952a + ", adResponse=" + this.f28953b + ", adConfiguration=" + this.f28954c + ")";
    }

    public final C4072a3 a() {
        return this.f28954c;
    }
}

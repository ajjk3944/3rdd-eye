package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class ww {

    /* renamed from: a, reason: collision with root package name */
    private final sw f35087a;

    /* renamed from: b, reason: collision with root package name */
    private final tx f35088b;

    /* renamed from: c, reason: collision with root package name */
    private final bw f35089c;

    /* renamed from: d, reason: collision with root package name */
    private final ow f35090d;

    /* renamed from: e, reason: collision with root package name */
    private final vw f35091e;

    /* renamed from: f, reason: collision with root package name */
    private final cx f35092f;

    /* renamed from: g, reason: collision with root package name */
    private final List<cw> f35093g;

    /* renamed from: h, reason: collision with root package name */
    private final List<qw> f35094h;

    public ww(sw appData, tx sdkData, bw networkSettingsData, ow adaptersData, vw consentsData, cx debugErrorIndicatorData, List<cw> adUnits, List<qw> alerts) {
        kotlin.jvm.internal.l.f(appData, "appData");
        kotlin.jvm.internal.l.f(sdkData, "sdkData");
        kotlin.jvm.internal.l.f(networkSettingsData, "networkSettingsData");
        kotlin.jvm.internal.l.f(adaptersData, "adaptersData");
        kotlin.jvm.internal.l.f(consentsData, "consentsData");
        kotlin.jvm.internal.l.f(debugErrorIndicatorData, "debugErrorIndicatorData");
        kotlin.jvm.internal.l.f(adUnits, "adUnits");
        kotlin.jvm.internal.l.f(alerts, "alerts");
        this.f35087a = appData;
        this.f35088b = sdkData;
        this.f35089c = networkSettingsData;
        this.f35090d = adaptersData;
        this.f35091e = consentsData;
        this.f35092f = debugErrorIndicatorData;
        this.f35093g = adUnits;
        this.f35094h = alerts;
    }

    public final List<cw> a() {
        return this.f35093g;
    }

    public final ow b() {
        return this.f35090d;
    }

    public final List<qw> c() {
        return this.f35094h;
    }

    public final sw d() {
        return this.f35087a;
    }

    public final vw e() {
        return this.f35091e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj;
        return kotlin.jvm.internal.l.b(this.f35087a, wwVar.f35087a) && kotlin.jvm.internal.l.b(this.f35088b, wwVar.f35088b) && kotlin.jvm.internal.l.b(this.f35089c, wwVar.f35089c) && kotlin.jvm.internal.l.b(this.f35090d, wwVar.f35090d) && kotlin.jvm.internal.l.b(this.f35091e, wwVar.f35091e) && kotlin.jvm.internal.l.b(this.f35092f, wwVar.f35092f) && kotlin.jvm.internal.l.b(this.f35093g, wwVar.f35093g) && kotlin.jvm.internal.l.b(this.f35094h, wwVar.f35094h);
    }

    public final cx f() {
        return this.f35092f;
    }

    public final bw g() {
        return this.f35089c;
    }

    public final tx h() {
        return this.f35088b;
    }

    public final int hashCode() {
        return this.f35094h.hashCode() + m9.a(this.f35093g, (this.f35092f.hashCode() + ((this.f35091e.hashCode() + ((this.f35090d.hashCode() + ((this.f35089c.hashCode() + ((this.f35088b.hashCode() + (this.f35087a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelData(appData=" + this.f35087a + ", sdkData=" + this.f35088b + ", networkSettingsData=" + this.f35089c + ", adaptersData=" + this.f35090d + ", consentsData=" + this.f35091e + ", debugErrorIndicatorData=" + this.f35092f + ", adUnits=" + this.f35093g + ", alerts=" + this.f35094h + ")";
    }
}

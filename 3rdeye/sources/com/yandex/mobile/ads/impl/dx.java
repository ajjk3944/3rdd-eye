package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class dx {

    /* renamed from: a, reason: collision with root package name */
    private final List<qw> f26509a;

    /* renamed from: b, reason: collision with root package name */
    private final sw f26510b;

    /* renamed from: c, reason: collision with root package name */
    private final ux f26511c;

    /* renamed from: d, reason: collision with root package name */
    private final bw f26512d;

    /* renamed from: e, reason: collision with root package name */
    private final ow f26513e;

    /* renamed from: f, reason: collision with root package name */
    private final vw f26514f;

    /* renamed from: g, reason: collision with root package name */
    private final cx f26515g;

    public dx(List<qw> alertsData, sw appData, ux sdkIntegrationData, bw adNetworkSettingsData, ow adaptersData, vw consentsData, cx debugErrorIndicatorData) {
        kotlin.jvm.internal.l.f(alertsData, "alertsData");
        kotlin.jvm.internal.l.f(appData, "appData");
        kotlin.jvm.internal.l.f(sdkIntegrationData, "sdkIntegrationData");
        kotlin.jvm.internal.l.f(adNetworkSettingsData, "adNetworkSettingsData");
        kotlin.jvm.internal.l.f(adaptersData, "adaptersData");
        kotlin.jvm.internal.l.f(consentsData, "consentsData");
        kotlin.jvm.internal.l.f(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f26509a = alertsData;
        this.f26510b = appData;
        this.f26511c = sdkIntegrationData;
        this.f26512d = adNetworkSettingsData;
        this.f26513e = adaptersData;
        this.f26514f = consentsData;
        this.f26515g = debugErrorIndicatorData;
    }

    public final bw a() {
        return this.f26512d;
    }

    public final ow b() {
        return this.f26513e;
    }

    public final sw c() {
        return this.f26510b;
    }

    public final vw d() {
        return this.f26514f;
    }

    public final cx e() {
        return this.f26515g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        return kotlin.jvm.internal.l.b(this.f26509a, dxVar.f26509a) && kotlin.jvm.internal.l.b(this.f26510b, dxVar.f26510b) && kotlin.jvm.internal.l.b(this.f26511c, dxVar.f26511c) && kotlin.jvm.internal.l.b(this.f26512d, dxVar.f26512d) && kotlin.jvm.internal.l.b(this.f26513e, dxVar.f26513e) && kotlin.jvm.internal.l.b(this.f26514f, dxVar.f26514f) && kotlin.jvm.internal.l.b(this.f26515g, dxVar.f26515g);
    }

    public final ux f() {
        return this.f26511c;
    }

    public final int hashCode() {
        return this.f26515g.hashCode() + ((this.f26514f.hashCode() + ((this.f26513e.hashCode() + ((this.f26512d.hashCode() + ((this.f26511c.hashCode() + ((this.f26510b.hashCode() + (this.f26509a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f26509a + ", appData=" + this.f26510b + ", sdkIntegrationData=" + this.f26511c + ", adNetworkSettingsData=" + this.f26512d + ", adaptersData=" + this.f26513e + ", consentsData=" + this.f26514f + ", debugErrorIndicatorData=" + this.f26515g + ")";
    }
}

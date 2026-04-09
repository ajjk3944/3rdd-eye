package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p61 {

    /* renamed from: a, reason: collision with root package name */
    private final List<w31> f31607a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ag<?>> f31608b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f31609c;

    /* renamed from: d, reason: collision with root package name */
    private final C4108f4 f31610d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f31611e;

    /* renamed from: f, reason: collision with root package name */
    private final List<w20> f31612f;

    /* renamed from: g, reason: collision with root package name */
    private final List<tx1> f31613g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31614h;
    private final nx1 i;

    /* renamed from: j, reason: collision with root package name */
    private final C4199s5 f31615j;

    /* JADX WARN: Multi-variable type inference failed */
    public p61(List<w31> nativeAds, List<? extends ag<?>> assets, List<String> renderTrackingUrls, C4108f4 c4108f4, Map<String, ? extends Object> properties, List<w20> divKitDesigns, List<tx1> showNotices, String str, nx1 nx1Var, C4199s5 c4199s5) {
        kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(renderTrackingUrls, "renderTrackingUrls");
        kotlin.jvm.internal.l.f(properties, "properties");
        kotlin.jvm.internal.l.f(divKitDesigns, "divKitDesigns");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        this.f31607a = nativeAds;
        this.f31608b = assets;
        this.f31609c = renderTrackingUrls;
        this.f31610d = c4108f4;
        this.f31611e = properties;
        this.f31612f = divKitDesigns;
        this.f31613g = showNotices;
        this.f31614h = str;
        this.i = nx1Var;
        this.f31615j = c4199s5;
    }

    public static p61 a(p61 p61Var, List nativeAds) {
        List<ag<?>> assets = p61Var.f31608b;
        List<String> renderTrackingUrls = p61Var.f31609c;
        C4108f4 c4108f4 = p61Var.f31610d;
        Map<String, Object> properties = p61Var.f31611e;
        List<w20> divKitDesigns = p61Var.f31612f;
        List<tx1> showNotices = p61Var.f31613g;
        String str = p61Var.f31614h;
        nx1 nx1Var = p61Var.i;
        C4199s5 c4199s5 = p61Var.f31615j;
        kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(renderTrackingUrls, "renderTrackingUrls");
        kotlin.jvm.internal.l.f(properties, "properties");
        kotlin.jvm.internal.l.f(divKitDesigns, "divKitDesigns");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        return new p61(nativeAds, assets, renderTrackingUrls, c4108f4, properties, divKitDesigns, showNotices, str, nx1Var, c4199s5);
    }

    public final List<ag<?>> b() {
        return this.f31608b;
    }

    public final List<w20> c() {
        return this.f31612f;
    }

    public final C4108f4 d() {
        return this.f31610d;
    }

    public final List<w31> e() {
        return this.f31607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p61)) {
            return false;
        }
        p61 p61Var = (p61) obj;
        return kotlin.jvm.internal.l.b(this.f31607a, p61Var.f31607a) && kotlin.jvm.internal.l.b(this.f31608b, p61Var.f31608b) && kotlin.jvm.internal.l.b(this.f31609c, p61Var.f31609c) && kotlin.jvm.internal.l.b(this.f31610d, p61Var.f31610d) && kotlin.jvm.internal.l.b(this.f31611e, p61Var.f31611e) && kotlin.jvm.internal.l.b(this.f31612f, p61Var.f31612f) && kotlin.jvm.internal.l.b(this.f31613g, p61Var.f31613g) && kotlin.jvm.internal.l.b(this.f31614h, p61Var.f31614h) && kotlin.jvm.internal.l.b(this.i, p61Var.i) && kotlin.jvm.internal.l.b(this.f31615j, p61Var.f31615j);
    }

    public final Map<String, Object> f() {
        return this.f31611e;
    }

    public final List<String> g() {
        return this.f31609c;
    }

    public final nx1 h() {
        return this.i;
    }

    public final int hashCode() {
        int iA = m9.a(this.f31609c, m9.a(this.f31608b, this.f31607a.hashCode() * 31, 31), 31);
        C4108f4 c4108f4 = this.f31610d;
        int iA2 = m9.a(this.f31613g, m9.a(this.f31612f, (this.f31611e.hashCode() + ((iA + (c4108f4 == null ? 0 : c4108f4.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f31614h;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        nx1 nx1Var = this.i;
        int iHashCode2 = (iHashCode + (nx1Var == null ? 0 : nx1Var.hashCode())) * 31;
        C4199s5 c4199s5 = this.f31615j;
        return iHashCode2 + (c4199s5 != null ? c4199s5.hashCode() : 0);
    }

    public final List<tx1> i() {
        return this.f31613g;
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f31607a + ", assets=" + this.f31608b + ", renderTrackingUrls=" + this.f31609c + ", impressionData=" + this.f31610d + ", properties=" + this.f31611e + ", divKitDesigns=" + this.f31612f + ", showNotices=" + this.f31613g + ", version=" + this.f31614h + ", settings=" + this.i + ", adPod=" + this.f31615j + ")";
    }

    public final C4199s5 a() {
        return this.f31615j;
    }
}

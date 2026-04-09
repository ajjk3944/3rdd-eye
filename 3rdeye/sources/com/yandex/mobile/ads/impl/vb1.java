package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class vb1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f34439a;

    /* renamed from: b, reason: collision with root package name */
    private final List<tx1> f34440b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f34441c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34442d;

    /* renamed from: e, reason: collision with root package name */
    private final C4108f4 f34443e;

    public vb1(List assets, ArrayList showNotices, ArrayList renderTrackingUrls, String str, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        kotlin.jvm.internal.l.f(renderTrackingUrls, "renderTrackingUrls");
        this.f34439a = assets;
        this.f34440b = showNotices;
        this.f34441c = renderTrackingUrls;
        this.f34442d = str;
        this.f34443e = c4108f4;
    }

    public final String a() {
        return this.f34442d;
    }

    public final List<ag<?>> b() {
        return this.f34439a;
    }

    public final C4108f4 c() {
        return this.f34443e;
    }

    public final List<String> d() {
        return this.f34441c;
    }

    public final List<tx1> e() {
        return this.f34440b;
    }
}

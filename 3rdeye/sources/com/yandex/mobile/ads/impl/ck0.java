package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ck0 implements bc0, he2, hk0, h11, wo1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f25685a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f25686b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f25687c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f25688d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f25689e = new LinkedHashSet();

    public final void a(bc0 forceImpressionTrackingListener) {
        kotlin.jvm.internal.l.f(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f25685a.add(forceImpressionTrackingListener);
    }

    public final void b(dk0 impressionTrackingListener) {
        kotlin.jvm.internal.l.f(impressionTrackingListener, "impressionTrackingListener");
        this.f25687c.add(impressionTrackingListener);
    }

    public final void c(dk0 videoImpressionTrackingListener) {
        kotlin.jvm.internal.l.f(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        this.f25686b.add(videoImpressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.he2
    public final void d() {
        Iterator it = this.f25686b.iterator();
        while (it.hasNext()) {
            ((he2) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void e() {
        Iterator it = this.f25689e.iterator();
        while (it.hasNext()) {
            ((h11) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wo1
    public final void f() {
        Iterator it = this.f25687c.iterator();
        while (it.hasNext()) {
            ((wo1) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hk0
    public final void g() {
        Iterator it = this.f25688d.iterator();
        while (it.hasNext()) {
            ((hk0) it.next()).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.he2
    public final void h() {
        Iterator it = this.f25686b.iterator();
        while (it.hasNext()) {
            ((he2) it.next()).h();
        }
    }

    public final void a(h11 mobileAdsSchemeImpressionListener) {
        kotlin.jvm.internal.l.f(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f25689e.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void b() {
        Iterator it = this.f25689e.iterator();
        while (it.hasNext()) {
            ((h11) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hk0
    public final void c() {
        Iterator it = this.f25688d.iterator();
        while (it.hasNext()) {
            ((hk0) it.next()).c();
        }
    }

    public final void a(dk0 impressionTrackingListener) {
        kotlin.jvm.internal.l.f(impressionTrackingListener, "impressionTrackingListener");
        this.f25688d.add(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    public final void a() {
        Iterator it = this.f25685a.iterator();
        while (it.hasNext()) {
            ((bc0) it.next()).a();
        }
    }
}

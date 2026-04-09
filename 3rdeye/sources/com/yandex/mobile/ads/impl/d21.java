package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d21 implements h11, i11, te1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f25932a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f25933b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f25934c = new ArrayList();

    public final void a(h11 mobileAdsSchemeImpressionListener) {
        kotlin.jvm.internal.l.f(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f25932a.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void b() {
        Iterator it = this.f25932a.iterator();
        while (it.hasNext()) {
            ((h11) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.te1
    public final void c() {
        Iterator it = this.f25934c.iterator();
        while (it.hasNext()) {
            ((te1) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void e() {
        Iterator it = this.f25932a.iterator();
        while (it.hasNext()) {
            ((h11) it.next()).e();
        }
    }

    public final void a(i11 mobileAdsSchemeRewardListener) {
        kotlin.jvm.internal.l.f(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        this.f25933b.add(mobileAdsSchemeRewardListener);
    }

    public final void a(te1 onCloseButtonListener) {
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        this.f25934c.add(onCloseButtonListener);
    }

    @Override // com.yandex.mobile.ads.impl.i11
    public final void a() {
        Iterator it = this.f25933b.iterator();
        while (it.hasNext()) {
            ((i11) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.te1
    public final void a(boolean z10) {
        Iterator it = this.f25934c.iterator();
        while (it.hasNext()) {
            ((te1) it.next()).a(z10);
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdInfo;

/* loaded from: classes3.dex */
public final class cl2 implements AppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final os f25698a;

    /* renamed from: b, reason: collision with root package name */
    private final wk2 f25699b;

    public cl2(os coreAppOpenAd, wk2 adInfoConverter) {
        kotlin.jvm.internal.l.f(coreAppOpenAd, "coreAppOpenAd");
        kotlin.jvm.internal.l.f(adInfoConverter, "adInfoConverter");
        this.f25698a = coreAppOpenAd;
        this.f25699b = adInfoConverter;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cl2) && kotlin.jvm.internal.l.b(((cl2) obj).f25698a, this.f25698a);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final AdInfo getInfo() {
        wk2 wk2Var = this.f25699b;
        ms info = this.f25698a.getInfo();
        wk2Var.getClass();
        return wk2.a(info);
    }

    public final int hashCode() {
        return this.f25698a.hashCode();
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void setAdEventListener(AppOpenAdEventListener appOpenAdEventListener) {
        this.f25698a.a(new dl2(appOpenAdEventListener));
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void show(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f25698a.show(activity);
    }
}
